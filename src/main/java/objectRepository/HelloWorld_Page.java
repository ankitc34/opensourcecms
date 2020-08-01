package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HelloWorld_Page extends TestBase {
	public static WebDriver driver;

	public HelloWorld_Page() {
		driver = intitialization();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "comment")
	public WebElement comment;

	@FindBy(name = "author")
	public WebElement author;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "url")
	public WebElement url;

	@FindBy(id = "submit")
	public WebElement submit;
	


	public void clickAtLink(String arg1) {
		driver.findElement(By.linkText(arg1)).click();
		
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

}
