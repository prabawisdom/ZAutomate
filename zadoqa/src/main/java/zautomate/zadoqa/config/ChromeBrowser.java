package zautomate.zadoqa.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import zautomate.zadoqa.utils.Platform;
/**
 * Class to configure and get Details for Chrome Browser
 * 
 * @author babu.sathiyaraja
 * 
 */
public class ChromeBrowser implements Browser {

	private WebDriver chromeDriver;

	public ChromeBrowser() {
		String OSName=Platform.OS.toUpperCase();
		if(OSName.contains("WINDOWS")){
		System.setProperty(ApplicationConstants.CHROME_DRIVER_NAME,
				ApplicationConstants.CHROME_DRIVER_PATH_WINDOWS);
		}
		else if(OSName.contains("MAC")){
			System.setProperty(ApplicationConstants.CHROME_DRIVER_NAME,
					ApplicationConstants.CHROME_DRIVER_PATH_MAC_OS);
		}
		chromeDriver = new ChromeDriver();
	}

	public String getBrowserName() {
		return ((RemoteWebDriver) chromeDriver).getCapabilities()
				.getBrowserName();
	}

	public String getVersion() {
		return ((RemoteWebDriver) chromeDriver).getCapabilities().getVersion();
	}

	public WebDriver getDriver() {
		return chromeDriver;
	}

}
