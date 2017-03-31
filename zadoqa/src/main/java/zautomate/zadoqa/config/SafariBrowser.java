package zautomate.zadoqa.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Class to configure and get Details for Safari Browser
 * @author Praba
 * 
 */
public class SafariBrowser implements Browser {

	private WebDriver safariDriver;
	public static final Log log = LogFactory
			.getLog(zautomate.zadoqa.config.SafariBrowser.class);

	public SafariBrowser() {
		log.info("Calling SafariBrowser constructor and return Safari Driver Object");
		safariDriver = new SafariDriver();
	}

	public String getBrowserName() {
		return ((RemoteWebDriver) safariDriver).getCapabilities()
				.getBrowserName();
	}

	public String getVersion() {
		return ((RemoteWebDriver) safariDriver).getCapabilities().getVersion();
	}

	public WebDriver getDriver() {
		return safariDriver;
	}
}