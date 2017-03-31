package zautomate.zadoqa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import zautomate.zadoqa.writers.TestCaseReportsPageWriter;

import zautomate.zadoqa.utils.Directory;
import zautomate.zadoqa.utils.Platform;
import zautomate.zadoqa.writers.CurrentRunPageWriter;

public class MailingReport
{

   public static String getCurrentTime;
   public static String Zipfolder_path = Directory.Zipfolder_Path;
   static PrintWriter printwriter;

   public static void main( String[] args ) throws IOException
   {
      SendMail();
   }

   public static void SendMail() throws IOException
   {

      final String username = Directory.userName;
      final String password = Directory.password;
      final String subject = Directory.Subject;

      Properties props = new Properties();
      props.put( "mail.smtp.starttls.enable", true );
      props.put( "mail.smtp.auth", true );
      props.put( "mail.smtp.host", Directory.smtpHost );
      props.put( "mail.smtp.port", "587" );
      Session session = Session.getInstance( props,
            new javax.mail.Authenticator()
            {
               protected PasswordAuthentication getPasswordAuthentication()
               {
                  return new PasswordAuthentication( username, password );
               }
            } );
      try
      {
         String currenttime = new SimpleDateFormat(
               " E-yyyy/MM/dd HH:mm:ss a" ).format( Calendar.getInstance()
               .getTime() );
         Message message = new MimeMessage( session );
         message.setFrom( new InternetAddress( Directory.fromAddress ) );
         message.setRecipients( Message.RecipientType.TO,
               InternetAddress.parse( Directory.toAddress ) );
         message.setRecipients( Message.RecipientType.CC,
               InternetAddress.parse( Directory.ccAddress ) );
         // get Calendar instance
         Calendar now = Calendar.getInstance();

         // get current TimeZone using getTimeZone method of Calendar class
         String timeZone = now.getTimeZone().getID();

         // display current TimeZone using getDisplayName() method of
         // TimeZone class       
         String sub = subject + currenttime + " " + timeZone;
         message.setSubject( sub );

         BodyPart messageBodyPart = new MimeBodyPart();
         Multipart multipart = new MimeMultipart();
         MimeBodyPart messageBodyPart1 = new MimeBodyPart();
         String file = Zipfolder_path + getCurrentTime + ".zip";
         File srcfile = new File( file );
         DataSource source = new FileDataSource( file );
         messageBodyPart1.setDataHandler( new DataHandler( source ) );
         float size = ( srcfile.length() / 1024 );
         System.out.println( "Attachment size: " + size + "KB" );
         if ( size < 25600 )
         {
            messageBodyPart1.attachFile( file );
         }
         else
         {
            messageBodyPart1.setContent( "<br>"
                  + "<p> Attachment file Size is more than 25 MB </p>",
                  "text/html" );
         }
         MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			String logFile = TestCaseReportsPageWriter.fileName;
			DataSource logFilesource = new FileDataSource( logFile );
			messageBodyPart2.setDataHandler( new DataHandler( logFilesource ) );
			messageBodyPart2.attachFile( logFile );
         
         Properties prop = new Properties();
         InputStream input = new FileInputStream( Directory.Reports_Path
               + "\\Results\\Settings.properties" );
         prop.load( input );
         String passCount = String.valueOf( CurrentRunPageWriter.passCount );
         String failCount = String.valueOf( CurrentRunPageWriter.failCount );
         String skipCount = String.valueOf( CurrentRunPageWriter.skipCount );
         String totalRun = String.valueOf( CurrentRunPageWriter.passCount
               + CurrentRunPageWriter.failCount
               + CurrentRunPageWriter.skipCount );
         String ExecutionType = System.getProperty( "zado.execution.parseq" )
               .trim();

         messageBodyPart
         .setContent(
					"<b><h2 ALIGN=CENTER>ZAutomate Results</h2></b>"
							+ ""
							+ "<br>"
							+ "<br>"
							+ "<table ALIGN=CENTER border=2>"
							+ "<tr style=\"color:black;\"><th ALIGN=LEFT>Test Run Details<td ALIGN=CENTER>"
							+ currenttime
							+ "</td></th></tr>"
							+ "<tr BGCOLOR=BLUE style=\"color:black;\"><th ALIGN=LEFT>Total TestCases<td ALIGN=CENTER>"
							+ totalRun
							+ "</td></th></tr>"
							+ "<tr BGCOLOR=LimeGreen style=\"color:black;\"><th ALIGN=LEFT>Passed List<td ALIGN=CENTER valign=middle>"
							+ passCount
							+ "</td></th></tr>"
							+ "<tr BGCOLOR=RED style=\"color:black;\"><th ALIGN=LEFT>Failed List<td ALIGN=CENTER valign=middle>"
							+ failCount
							+ "</td></th></tr>"
							+ "<tr BGCOLOR=ORANGE style=\"color:black;\"><th ALIGN=LEFT>Skipped List<td ALIGN=CENTER valign=middle>"
							+ skipCount
							+ "</td></th></tr>"
							+ "<tr BGCOLOR=YELLOW style=\"color:black;\"><th ALIGN=LEFT>OS Name<td ALIGN=CENTER valign=middle>"
							+ Platform.OS.toUpperCase()
							+ "</td></th></tr>"
							+ "<tr BGCOLOR=GREEN style=\"color:black;\"><th ALIGN=LEFT>Browser Name<td ALIGN=CENTER valign=middle>"
							+ Directory.browser.toUpperCase()
							+ "</td></th></tr>"
							+ "<tr BGCOLOR=PINK style=\"color:black;\"><th ALIGN=LEFT>Execution Type<td ALIGN=CENTER valign=middle>"
							+ ExecutionType.toUpperCase()
							+ "<tr BGCOLOR=AQUA style=\"color:black;\"><th ALIGN=LEFT>HostName<td ALIGN=CENTER valign=middle>"
							+ Platform.getHostName().toUpperCase()
							+ "</td></th></tr>"
							+ "<br></table></BODY>"
							+ ""
							+ "<br>"
							+ "<p>This mail sent from <cite><strong><ul><u><A HREF=\"http://zado-tech.com\">Zado Infotech Solution</A></u></ul></strong></cite></p>",
					"text/html" );

         multipart.addBodyPart( messageBodyPart );
         //multipart.addBodyPart( messageBodyPart1 );
         multipart.addBodyPart( messageBodyPart2 );
         message.setContent( multipart );
         System.out.println( "Mail Sending" );
         Transport.send( message );
         System.out.println( "Done" );
      }
      catch ( MessagingException e )
      {
         e.printStackTrace();
      }
   }

   public static void MailZipped() throws Exception
   {
      File directoryToZip = new File( Directory.Reports_Path );
      List< File > fileList = new ArrayList< File >();
      getAllFiles( directoryToZip, fileList );
      writeZipFile( directoryToZip, fileList );
      System.out.println( "---Done" );
   }

   public static void getAllFiles( File dir, List< File > fileList )
         throws InterruptedException
   {

      File[] files = dir.listFiles();
      for ( File file : files )
      {
         fileList.add( file );
         if ( file.isDirectory() )
         {
            getAllFiles( file, fileList );
         }
         else
         {
            // System.out.println("file:" + file.getCanonicalPath());
         }
      }
   }

   public static void writeZipFile( File directoryToZip, List< File > fileList )
         throws Exception
   {
      try
      { // E yyyy.MM.dd 'at' hh:mm:ss a
         getCurrentTime = new SimpleDateFormat( "E_yyyy_MM_dd_HH_mm_ss_a" )
               .format( Calendar.getInstance().getTime() );
         FileOutputStream fos = new FileOutputStream( Zipfolder_path
               + getCurrentTime + ".zip" );
         ZipOutputStream zos = new ZipOutputStream( fos );
         for ( File file : fileList )
         {
            if ( !file.isDirectory() )
            {
               addToZip( directoryToZip, file, zos );
            }
         }
         zos.close();
         fos.close();
      }
      catch ( FileNotFoundException e )
      {
         e.printStackTrace();
      }
      catch ( IOException e )
      {
         e.printStackTrace();
      }
   }

   public static void addToZip( File directoryToZip, File file,
         ZipOutputStream zos ) throws FileNotFoundException, IOException
   {
      FileInputStream fis = new FileInputStream( file );
      String zipFilePath = file.getCanonicalPath().substring(
            directoryToZip.getCanonicalPath().length() + 1,
            file.getCanonicalPath().length() );
      ZipEntry zipEntry = new ZipEntry( zipFilePath );
      zos.putNextEntry( zipEntry );
      byte[] bytes = new byte[ 1024 ];
      int length;
      while ( ( length = fis.read( bytes ) ) >= 0 )
      {
         zos.write( bytes, 0, length );
      }
      zos.closeEntry();
      fis.close();
   }
}