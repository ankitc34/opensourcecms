package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	
	public static WebDriver dr;
	
	public static WebDriver intitialization() {
		System.setProperty("webdriver.chrome.driver", "D://selenium softwares/Browserdriver/chromedriver.exe");
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions ch = new ChromeOptions();
		ch.merge(cap);
		dr = new ChromeDriver(ch);
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://s1.demo.opensourcecms.com/wordpress/");
		return dr;
		
	}

}
