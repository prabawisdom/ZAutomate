import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;







import zautomate.zadoqa.ZadoReports;
import zautomate.zadoqa.commands.Navigate;
import zautomate.zadoqa.config.AndroidSetup;
import zautomate.zadoqa.config.ChromeBrowser;
import zautomate.zadoqa.config.FirefoxBrowser;
import zautomate.zadoqa.config.IEBrowser;
import zautomate.zadoqa.config.SafariBrowser;
import zautomate.zadoqa.datadriver.CaseStep;
import zautomate.zadoqa.datadriver.TestCaseRunner;
import zautomate.zadoqa.enums.LogAs;
import zautomate.zadoqa.listeners.ConfigurationListener;
import zautomate.zadoqa.listeners.MethodListener;
import zautomate.zadoqa.listeners.ZadoReportsListener;
import zautomate.zadoqa.reports.CaptureScreen;
import zautomate.zadoqa.reports.CaptureScreen.ScreenshotOf;
import zautomate.zadoqa.util.ExcelUtils;
import zautomate.zadoqa.utils.Directory;
import zautomate.zadoqa.utils.TestParameters;

@Listeners({ ConfigurationListener.class, ZadoReportsListener.class,
	MethodListener.class })
public class TestNGClass {

	Logger log = Logger.getLogger(TestNGClass.class.getName());
	@BeforeTest
	@DataProvider(name = "data", parallel = true)
	public static Iterator<Object[]> testCaseProvider() {
		List<Object[]> data = new ArrayList<Object[]>();
		ExcelUtils utils = new ExcelUtils();
		Collection<File> testCaseList = utils.readTestCaseFiles(Directory.testCasePath);
		Iterator<File> testCaseItr = testCaseList.iterator();

		while (testCaseItr.hasNext()) {
			String[] browser = Directory.browser.split(",");
			File tcFileName = testCaseItr.next();
			for (int i = 0; i < browser.length; i++) {
				TestParameters params = new TestParameters();
				params.setBrowserName(browser[i]);
				params.setTestCaseFileName(tcFileName);
				params.setTestCaseName(FilenameUtils.getBaseName(tcFileName
						.getName()) + "_" + browser[i]);
				params.setModuleName(tcFileName.getParentFile().getName());
				params.setOrSheetFileName(new File(Directory.ORSheetPath));
				data.add(new Object[] { params });
			}
		}
		return data.iterator();
	}

	@Test(dataProvider = "data", enabled = true)
	public void launchapp(TestParameters params) throws Exception {
		WebDriver driver = null;
		AndroidDriver adriver = null;
		/*if(params.getBrowserName().equals("android")) {
			System.out.print("andoird entered1");
			System.out.print("andoird entered");
//			File classpathRoot = new File(System.getProperty("user.dir"));
//			File appDir = new File(classpathRoot, "lib//");
			File appDir = new File("C://workspace//Zautomate//ZA//testcases");
			File app = new File(appDir, "Freecharge_4.1.8.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName","Praba's");
			capabilities.setCapability("platformVersion", "5.0.2");
			capabilities.setCapability("app", app.getAbsolutePath());
//			capabilities.setCapability("appPackage", "com.freecharge.android");
//			capabilities.setCapability("app-activity", ".Freecharge");	
			try {
				adriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}*/
		ExcelUtils utils = new ExcelUtils();
		try {
			if (params.getBrowserName().equals("chrome")) {
				driver = new ChromeBrowser().getDriver();
			} else if (params.getBrowserName().equals("firefox")) {
				driver =  new FirefoxBrowser().getDriver();
			} else if (params.getBrowserName().equals("ie")) {
				driver = new IEBrowser().getDriver();
			} else if (params.getBrowserName().equals("safari")) {
				driver = new SafariBrowser().getDriver();
			} else if(params.getBrowserName().equals("android")) {
				adriver = AndroidSetup.start();
				}

			log.info("before set driver Thread -----"+Thread.currentThread().getId() +"------------driver------------"+driver);

			ZadoReports.setWebDriver(driver);

			log.info("after set driver Thread -----"+Thread.currentThread().getId() +"------------driver------------"+driver);

			try {
				List<CaseStep> steps = utils.readTestCase(
						params.getTestCaseFileName(),
						params.getOrSheetFileName());
				TestCaseRunner.exectuteTestCase(adriver,driver, steps);
			} catch (NoSuchElementException e) {
				ZadoReports.add("Failed to find Element", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				log.info("Thread @ first close-----"+Thread.currentThread().getId() +"------------driver------------"+driver);		
				
				throw e;
			}catch (NullPointerException e){
				ZadoReports.add("NullPointerException", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				log.info("Thread @ first close-----"+Thread.currentThread().getId() +"------------driver------------"+driver);

				throw e;
			}catch (TimeoutException e){
				ZadoReports.add("TimeoutException", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				log.info("Thread @ first close-----"+Thread.currentThread().getId() +"------------driver------------"+driver);

				throw e;
			}catch (Exception e){
				ZadoReports.add("Exception", LogAs.FAILED,
						new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				log.info("Thread @ first close-----"+Thread.currentThread().getId() +"------------driver------------"+driver);
				throw e;
			}
			finally
			{
//				Navigate.quit(driver);				
			}

			log.info("Thread @ close-----"+Thread.currentThread().getId() +"------------driver------------"+driver);

		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
