package zautomate.zadoqa.commands;

import org.openqa.selenium.WebElement;

public class ElementActions {

	public static String getText(WebElement webElement) {		
		return webElement.getText();		
	}

	public static String getAttribute(WebElement webElement, String locatorName) {
		return webElement.getAttribute(locatorName);
	}

	public static String getTagName(WebElement webElement) {
		return webElement.getTagName();
	}

	public static boolean isDisplayed(WebElement webElement) {
		return webElement.isDisplayed();
	}

	public static boolean isSelected(WebElement webElement) {
		return webElement.isSelected();
	}

	public static boolean isEnabled(WebElement webElement) {
		return webElement.isEnabled();
	}
	
	
}
