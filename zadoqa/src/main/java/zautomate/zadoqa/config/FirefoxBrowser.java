package zautomate.zadoqa.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Class to configure and get Details for Firefox Browser
 * @author babu.sathiyaraja
 * 
 */
public class FirefoxBrowser implements Browser {

	private WebDriver firefoxDriver;
	public static final Log log = LogFactory
			.getLog(zautomate.zadoqa.config.FirefoxBrowser.class);

	public FirefoxBrowser() {
		log.info("Calling FirefoxBrowser constructor and return Firefox Driver Object");
		firefoxDriver = new FirefoxDriver();
	}

	public String getBrowserName() {
		return ((RemoteWebDriver) firefoxDriver).getCapabilities()
				.getBrowserName();
	}

	public String getVersion() {
		return ((RemoteWebDriver) firefoxDriver).getCapabilities().getVersion();
	}

	public WebDriver getDriver() {
		return firefoxDriver;
	}

}
