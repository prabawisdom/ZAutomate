package zautomate.zadoqa.commands;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import bsh.org.objectweb.asm.Constants;
import zautomate.zadoqa.util.CommandUtils;
import zautomate.zadoqa.utils.Directory;

//import com.thoughtworks.selenium.webdriven.commands.WaitForPopup;

public class Manipulation extends CommandUtils implements OR {

	static Logger log = Logger.getLogger(Manipulation.class.getName());
	public static String ElementWait=Directory.WaitFor;
	public static int WaitElementSeconds=new Integer(ElementWait);

	public static void click(WebElement webElement) {
		try {
			if(webElement.isDisplayed()) {
				webElement.click();    	    	   
			}    	   
		} 
		catch (StaleElementReferenceException e){ }
	}

	public static void jsClickByXPath(WebDriver driver,String NormalXpath) {
		WebElement element = driver.findElement(By.xpath(NormalXpath));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	 public static void aclick(AndroidDriver driver, String NormalXpath) {
		 driver.findElement(By.xpath(NormalXpath));
	 }

	public static void actionClick(WebDriver driver, WebElement webElement) {
		try {
			if(webElement.isEnabled()) {
				Actions action = new Actions(driver);
				action.click(webElement).build().perform();     	    	 
			}    	   
		} catch (StaleElementReferenceException e) { }
	}

	public static String actionType(WebDriver driver,WebElement webElement,CharSequence... keysToSend){
		try {
			if(webElement.isEnabled())
			{
				Actions action = new Actions(driver);
				action.sendKeys(webElement, keysToSend).build().perform();    	    	 
			}    	   
		} catch (StaleElementReferenceException e) { }
		String Value = keysToSend.toString();
 		return Value;
	}

	public static void doubleClick(WebDriver driver, WebElement webElement) {
		try {
			Actions action = new Actions(driver).doubleClick(webElement);
			action.build().perform();
		} catch (StaleElementReferenceException e) {
			log.info("Element is not attached to the page document "
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			log.info("Element " + webElement + " was not found in DOM "
					+ e.getStackTrace());
		} catch (Exception e) {
			log.info("Element " + webElement + " was not clickable "
					+ e.getStackTrace());
		}
	}

	public static void clickAt(WebDriver driver, WebElement webElement, int x,int y) {
		try {
			Actions builder = new Actions(driver);
			builder.moveToElement(webElement, x, y).click().build().perform();
		} catch (StaleElementReferenceException e) {
			log.info("Element is not attached to the page document "
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			log.info("Element " + webElement + " was not found in DOM "
					+ e.getStackTrace());
		} catch (Exception e) {
			log.info("Element " + webElement + " was not clickable "
					+ e.getStackTrace());
		}
	}

	public static void clickAndHold(WebDriver driver,WebElement webElement)	{
		try {
			Actions builder = new Actions(driver);
			builder.clickAndHold(webElement).build().perform();
		} catch (StaleElementReferenceException e) {
			log.info("Element is not attached to the page document "
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			log.info("Element " + webElement + " was not found in DOM "
					+ e.getStackTrace());
		} catch (Exception e) {
			log.info("Element " + webElement + " was not clickable "
					+ e.getStackTrace());
		}
	}

	public static void clear(WebElement webElement) {
		webElement.clear();
	}

	public static String clearAndType(WebElement webElement, String keysToSend) {
		webElement.clear();
		try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();}
		webElement.sendKeys(keysToSend);		
		return keysToSend;
	}

	public static String sendKeys(WebElement webElement,String keysToSend) {
		webElement.sendKeys(keysToSend);
		return keysToSend;
	} 

	public static void submit(WebElement webElement) {
		webElement.submit();
	}

	public static void keyDown(Actions actions, Keys keys) {
		actions.keyDown(keys);
	}

	public static void keyUp(Actions actions, Keys keys) {
		actions.keyUp(keys);
	}

	public static String getCurrentURL(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public static String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public static void mouseOver(WebDriver driver, WebElement webElement) {
		try {
			Actions builder = new Actions(driver);
			builder.moveToElement(webElement).build().perform();
		} catch (StaleElementReferenceException e) {
			log.info("Element is not attached to the page document "
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			log.info("Element " + webElement + " was not found in DOM "
					+ e.getStackTrace());
		} catch (Exception e) {
			log.info("Element " + webElement + " was not mouseOver "
					+ e.getStackTrace());
		}
	}

	public static void mouseOverAndClick(WebDriver driver, WebElement webElement) {
		try {
			Actions builder = new Actions(driver);
			builder.moveToElement(webElement).click().build().perform();
		} catch (StaleElementReferenceException e) {
			log.info("Element is not attached to the page document "
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			log.info("Element " + webElement + " was not found in DOM "
					+ e.getStackTrace());
		} catch (Exception e) {
			log.info("Element " + webElement + " was not mouseOver "
					+ e.getStackTrace());
		}
	}

	public static void selectCheckBox(WebElement element) {
		try {
			if (element.isSelected()) {
				log.info("Checkbox: " + element + "is already selected");
			} else {
				element.click();
			}
		} catch (Exception e) {
			log.info("Unable to select the checkbox: " + element);
		}
	}

	public static void deSelectCheckBox(WebElement element) {
		try {
			if (element.isSelected()) {
				element.click();
			} else {
				log.info("Checkbox: " + element + "is already deselected");
			}
		} catch (Exception e) {
			log.info("Unable to deselect checkbox: " + element);
		}
	}

	public static void selectByIndex(WebElement element, String inputData) {
		try {
			Integer index = new Integer(inputData);
			Select selectBox = new Select(element);
			selectBox.selectByIndex(index);
		} catch (Exception e) {
			log.info("Unable to select selectbox: " + element);
		}
	}

	public static void selectByValue(WebElement element, String inputData) {
		try {
			Select selectBox = new Select(element);
			selectBox.selectByValue(inputData);
		} catch (Exception e) {
			log.info("Unable to select selectbox: " + element);
		}
	}

	public static String selectByVisibletext(WebElement element, String inputData) {
		try {
			Select selectBox = new Select(element);
			selectBox.selectByVisibleText(inputData);
		} catch (Exception e) {
			log.info("Unable to select selectbox: " + element);
		}
		return inputData;
	}

	public static void deSelectByVisibletext(WebElement element, String inputData) {
		try {
			Select selectBox = new Select(element);
			selectBox.deselectByVisibleText(inputData);
		} catch (Exception e) {
			log.info("Unable to select selectbox: " + element);
		}
	}

	public static void deSelectByIndex(WebElement element, String inputData) {
		try {
			Integer index = new Integer(inputData);
			Select selectBox = new Select(element);
			selectBox.deselectByIndex(index);
		} catch (Exception e) {
			log.info("Unable to select selectbox: " + element);
		}
	}

	public static void deSelectByValue(WebElement element, String inputData) {
		try {
			Select selectBox = new Select(element);
			selectBox.deselectByValue(inputData);
		} catch (Exception e) {
			log.info("Unable to select selectbox: " + element);
		}
	} 

	public static String Main_Window = "";
	public static void getWindow(WebDriver driver, WebElement webElement) {  
		Main_Window = driver.getWindowHandle();
		try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		click(webElement);
		try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		ArrayList<String> allWindows=new ArrayList<String>(driver.getWindowHandles());
		allWindows.remove(Main_Window);
		driver.switchTo().window(allWindows.get(0));
	}

	public static void switchWindow(WebDriver driver) {  
		driver.switchTo().window(Main_Window);			
		try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
	}

	public static void switchDefaultContent(WebDriver driver) {  	 
		driver.switchTo().defaultContent();
		try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
	}

	public static void getAutoit(WebDriver driver, String inputData) {  
		try {		
			Runtime.getRuntime().exec(inputData);		 
		} catch (IOException e1){
			e1.printStackTrace();
		}
	}

	public static void wait(WebDriver driver,String inputData) {
		try {
			int time = Integer.parseInt(inputData);
			int seconds = time*1000;
			Thread.sleep(seconds);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

	public static WebElement fromElement;
	public static void dragElement(WebDriver driver, WebElement webElement)	{
		fromElement=webElement;
	}

	public static void dropElement(WebDriver driver, WebElement webElement) {
		Actions action = new Actions(driver);
		Action dragDrop = action.dragAndDrop(fromElement, webElement).build();
		dragDrop.perform(); 
	}

	public static boolean elementIsSelected(WebDriver driver, WebElement webElement) {
		try {
			webElement.isSelected();
			return true;  
		} catch(NoSuchElementException e) {
			log.info("Unable to Select WebElement: " + webElement);
			return false;
		}    	
	}    

	public static boolean verifyElementIsPresent(WebDriver driver, WebElement webElement){    	
		try {
			webElement.isDisplayed();			
			return true; 
		} catch(NoSuchElementException e)   {
			log.info("Unable to Displayed WebElement: " + webElement);
			return false;
		}    	    	  
	} 

	public static String verifyElementIsNotPresent(WebDriver driver, WebElement webElement){
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
			wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(webElement)));
		}
		catch(Exception e)
		{
			return "Verified Element is not present";
		}
		return "Verified Element is Visible";
	}	

	public static boolean elementIsEnable(WebDriver driver, WebElement webElement){
		try {
			webElement.isEnabled();         	
			return true;   
		} catch(NoSuchElementException e)  {
			log.info("Unable to Enabled WebElement: " + webElement);
			return false;
		}		
	}

	public static void visibilityElement(WebDriver driver, WebElement webElement){
		WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
		wait.until(ExpectedConditions.visibilityOf(webElement));			
	}	

	public static void inVisibilityElement(WebDriver driver, String NormalXpath){
		WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(NormalXpath)));
	}	

	public static void testIsPresent(WebDriver driver,WebElement webElement, String inputData){
		driver.getPageSource().contains(inputData);
	}

	public static void textTobePresent(WebDriver driver,WebElement webElement, String inputData){       	 
		WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
		waits.until(ExpectedConditions.textToBePresentInElement(webElement, inputData));    	 
	}

	public static void testIsNotPresent(WebDriver driver, String NormalXpath,String inputData){       	 
		WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
		waits.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(NormalXpath), inputData)); 
	}

	public static void elementTobeClickable(WebDriver driver,WebElement webElement)	{       	 
		WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
		waits.until(ExpectedConditions.elementToBeClickable(webElement));  
	}

	public static void elementToBeSelected(WebDriver driver,WebElement webElement)	{       	 
		WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
		waits.until(ExpectedConditions.elementToBeSelected(webElement));    	 
	}

	public static void waitForElement(WebDriver driver, String NormalXpath)	{   	
		WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);   
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NormalXpath)));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NormalXpath)));
	}    	

	public static void waitForElementNotpresent(WebDriver driver,String NormalXpath) {    	     	 
		WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);    	
		wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(By.xpath(NormalXpath))));
	}

	public static void textElementPresentValue(WebDriver driver,WebElement webElement, String inputData){   	
		WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);    	
		wait.until(ExpectedConditions.textToBePresentInElementValue(webElement, inputData));
	}    	 

	public static String linkCounts(WebDriver driver, String NormalXpath){    	
		int count = driver.findElements(By.xpath(NormalXpath)).size();
		String elementCounts = String.valueOf(count);    	
		return "Count Is :" +elementCounts;
	}

	/**
	 * Name : Gobi.E
	 * Created Date:
	 * Modified Date:
	 * Description : 
	 * Ticket ID : 
	 * Required Inputs : 
	 * Purpose : 
	 */
	public static String dynamicSendkeys(WebDriver driver,String inputData, WebElement webElement){    
		webElement.clear();
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		String currenttime = new SimpleDateFormat("E_yyyy_MM_dd_HH_mm_ss_a").format(Calendar.getInstance().getTime());
		String originalValue = inputData;
		String combinedValues = currenttime+originalValue;
		sendKeys(webElement, combinedValues);		
		return combinedValues;
	}

	public static void waitForAjax(WebDriver driver) {
		new WebDriverWait(driver, 180).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) 	{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return (Boolean) js.executeScript("return jQuery.active == 0");
			}
		});
	}

	public static String condtionMatch(String GetText1, String GetText2){	
		String output = "";    
		System.out.println("Object is Before :" +GetText1);  		
		System.out.println("Object to After : "+GetText2);
		try	{
			if(GetText1.equalsIgnoreCase(GetText2))	{
				output = "The value"+GetText2+" is Verified"; 
			}
			return output;
		} catch(NoSuchElementException e) {
			log.info("Unable to Matched WebElement: " + output);
			return output;
		}		
	}
	
	/**
	 * Name:Prabakaran
	 * @param element
	 * @param imageName
	 * Created Date:17-dec-15
	 * Modified Date:18-dec-15
	 * Purpose:To send the file using relative path as inputdata
	 * @return
	 */
	public static String uploadFileSendkeys(WebElement element, String imageName){
		//		 String userDir = System.getProperty("user.dir");
		//			  String filePath = userDir  + File.separatorChar +"src"+ File.separatorChar + "main"+ File.separatorChar +"resources" + File.separatorChar + "testcases"  + File.separatorChar +"UploadFiles"+ File.separatorChar +inputData; 
		//			  Manipulation.sendKeys(element, imageName);
		String filepath=Directory.uploadFilePath+imageName;
		File fileName = new File(filepath);
		String absoultePath = fileName.getAbsoluteFile().toString();
		Manipulation.sendKeys(element,absoultePath);
		return absoultePath;
	}
	
	/**
	 * Name:Prabakaran
	 * @param driver
	 * @param inputData
	 * @param webElement
	 * Created date:24-dec-15
	 * Modified date:24-dec-15
	 * Purpose: To send dynamic key values without special characters
	 * @return
	 */
	public static String dynamicSendkeysNumbers(WebDriver driver,String inputData, WebElement webElement){    
		webElement.clear();
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		String currenttime = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
		String originalValue = inputData;
		String combinedValues = currenttime+originalValue;
		sendKeys(webElement, combinedValues);		
		return combinedValues;
	}
}
