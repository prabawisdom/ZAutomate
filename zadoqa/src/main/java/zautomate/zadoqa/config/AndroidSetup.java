package zautomate.zadoqa.config;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidSetup {
	public static AndroidDriver adriver;
	public static AndroidDriver start() {
//		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File("C://workspace//Zautomate//ZA//testcases");
		File app = new File(appDir, "Freecharge_4.1.8.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName","Praba's");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.freecharge.android");
//		capabilities.setCapability("app-activity", ".Freecharge");	
		try {
			adriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adriver;
		
	}

}
