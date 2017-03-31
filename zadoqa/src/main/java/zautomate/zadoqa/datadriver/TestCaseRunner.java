package zautomate.zadoqa.datadriver;

/**
 * Executing and add results in reports
 */
import io.appium.java_client.android.AndroidDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import zautomate.zadoqa.ZadoReports;
import zautomate.zadoqa.enums.LogAs;
import zautomate.zadoqa.reports.CaptureScreen;
import zautomate.zadoqa.reports.CaptureScreen.ScreenshotOf;
import zautomate.zadoqa.util.AndroidCommandUtils;
import zautomate.zadoqa.util.CommandUtils;
import zautomate.zadoqa.utils.Directory;

public class TestCaseRunner {

	public static void exectuteTestCase(AndroidDriver adriver,WebDriver driver, List<CaseStep> steps) throws Exception {
		Iterator<CaseStep> stepIterator = steps.iterator();

		while (stepIterator.hasNext()) {
			CaseStep eachStep = stepIterator.next();
			CommandUtils util = new CommandUtils();
			AndroidCommandUtils autil = new AndroidCommandUtils(); 
			WebElement element = null;
			if (eachStep.getOrLocator()!=null) {		
				try
				{
					if(Directory.browser.equalsIgnoreCase("android"))
					{
						element = autil.findElement(adriver, eachStep.getLocateBy(),
								eachStep.getOrLocator());
					}
					else {
						element = util.findElement(driver, eachStep.getLocateBy(),
								eachStep.getOrLocator());
					}
				}
				catch(NoSuchElementException exception)
				{
					throw exception;
				}
			}
			if(Directory.browser.equalsIgnoreCase("android"))
			{
				Object returnObj = autil.executeAction(adriver, element, eachStep.getAction(),
						eachStep.getInputData(),eachStep.getStepNo(),eachStep.getReferenceStep());	    
				ZadoReports.add(eachStep.getDescription(),eachStep.getInputData(), eachStep.getExpectedResult(),Objects.toString(returnObj, ""),LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			else {
				Object returnObj = util.executeAction(driver, element, eachStep.getAction(),
						eachStep.getInputData(),eachStep.getStepNo(),eachStep.getReferenceStep());	    
				//ZadoReports.add(eachStep.getDescription(),eachStep.getInputData(), eachStep.getExpectedResult(),Objects.toString(returnObj, ""),LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				ZadoReports.add(eachStep.getDescription(),eachStep.getInputData(), eachStep.getExpectedResult(),Objects.toString(returnObj, ""),LogAs.PASSED, null);
			}
		}
	}
}