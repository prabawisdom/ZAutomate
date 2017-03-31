package zautomate.zadoqa.commands;

import java.awt.Window;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Navigate {

	public static void get(WebDriver driver, String url) {
		driver.get(url);
	}

	public static void close(WebDriver driver) {
		driver.close();
	}
	
	public static void quit(WebDriver driver) {
		driver.close();
		driver.quit();
	}

	public static void waitTime(WebDriver driver, String waitSeconds) {
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(waitSeconds), TimeUnit.SECONDS);
	}

	public static void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void goBack(WebDriver driver) {
		driver.navigate().back();
	}

	public static void goForward(WebDriver driver) {
		driver.navigate().forward();
	}

	public static void goTo(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public static void keyboardTab(WebDriver driver)  {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).perform();
	}

	public static void enter(WebDriver driver)  {
		Actions actionObject = new Actions(driver);
		actionObject.sendKeys(Keys.ENTER).build().perform();
	}


	public static String alertOk(WebDriver driver, WebElement element) {
		element.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public static void dismissAlert(WebDriver driver) {  
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static String alertDismiss(WebDriver driver, WebElement element) {
		element.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.dismiss();
		return alertText;
	}

	public static String promptBox(WebDriver driver, WebElement element, String inputData) {
		element.click();
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys(inputData);
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public static void switchToFrame(WebDriver driver,String frameName) {
		try {
			driver.switchTo().frame(frameName);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with Name " + frameName
					+ e.getStackTrace());
		} 
	}

	public static void switchToFrame(WebDriver driver,int frameIndex) {
		try {
			driver.switchTo().frame(frameIndex);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id " + frameIndex
					+ e.getStackTrace());
		} 
	}

	public static void switchToDefaultFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public static void switchToFrame(WebDriver driver,WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with Xpath " + element
					+ e.getStackTrace());
		} 
	}

	public static void pageDown(WebDriver driver)  {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");   
	}

	public static void pageUp(WebDriver driver)  {
		((JavascriptExecutor) driver).executeScript("scroll(0,-250);");
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0, -250)", "");    
	}

	public static void scrollBottom(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,"
				+ "document.body.scrollHeight,document.documentElement.clientHeight));");    
	}

	public static void keyboardPageUp(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_UP).perform();    	
	}

	public static void keyboardPageDown(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).perform();    	
	}

	public static void keyboardEnd(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	}

	public static void keyboardArrowUp(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_UP).perform();
	}

	public static void keyboardArrowDown(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).perform();
	}

	public static void keyboardArrowLeft(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).perform();
	}

	public static void keyboardArrowRight(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_RIGHT).perform();
	}

	public static void pageMaximize(WebDriver driver) {
		//driver.findElement(By.tagName("body")).sendKeys(Keys.F11);
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.F11).perform();    	
	}

	public static void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();  	
	}

	public static void navigateUrl(WebDriver driver,String inputData) {
		driver.navigate().to(inputData);  	
	}

	public static void screenShot(WebDriver driver,String inputData) {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {	FileUtils.copyFile(screenshot, new File(inputData));	} catch (IOException e) { e.printStackTrace();
		} 	
	}

	public static void alertGenerate(WebDriver driver,String inputData) {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('"+inputData+"');");  
		try {Thread.sleep(3000);} catch (InterruptedException e) { e.printStackTrace();	}
	}

	public static void highLightElement(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",webElement, "color: red; border: 3px solid red;");
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",webElement, "");
	}    

	public static ArrayList<String> tabs;
	public static void newTab(WebDriver driver) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));		
	}

	public static void closeTab(WebDriver driver) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"w");
		//tabs.remove(tabs.get(0));
		driver.switchTo().defaultContent();
		try {Thread.sleep(1000);} catch (InterruptedException e) { e.printStackTrace();}
		ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(0));
	}

	public static String sendHttpPost(String inputData) throws Exception {        
		String[] requestParameters = inputData.split(",");
		String url = requestParameters[0];        
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
		//add request header
		con.setRequestMethod(requestParameters[1]);
		con.setRequestProperty(requestParameters[2],requestParameters[3]);
		con.setRequestProperty(requestParameters[4], requestParameters[5]);
		String urlParameters = requestParameters[6];        
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		System.out.println(response.toString());        
		String a=response.toString();
		String testStr = "< > \" &";
		return response.toString();
	}



}
