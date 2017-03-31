package zautomate.zadoqa.config;

import org.openqa.selenium.WebDriver;

/**
 * Main interface for the Browser Configuration
 * 
 * @author babu.sathiyaraja
 * 
 */
public interface Browser {

	public WebDriver getDriver();

	public String getBrowserName();

	public String getVersion();

}
