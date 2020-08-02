package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import commonUtils.TestUtils;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		FileInputStream fis = new FileInputStream("src/main/resources/resources/config.properties");
		prop = new Properties();
		prop.load(fis);
	}
	
	public static void intitialization() {
		System.setProperty("webdriver.chrome.driver", "D://selenium softwares/Browserdriver/chromedriver.exe");
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions ch = new ChromeOptions();
		ch.merge(cap);
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.Implicit_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}

}
