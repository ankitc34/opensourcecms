package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Cms_Page extends TestBase {

	public Cms_Page() throws IOException {
		PageFactory.initElements(driver, this);		
	}

	@FindBy(xpath = "(//li/a[text() = \"Hello world!\"])[1]")
	public WebElement helloWorld;

	@FindBy(linkText = "Log in")
	public WebElement login;

	public String getTitle() {
		return driver.getTitle();
	}

	public HelloWorld_Page clickAtHelloWorldLink() throws InterruptedException, IOException {

		helloWorld.click();
		Thread.sleep(2000);

		return new HelloWorld_Page();

	}

	public Login_Page clickAtLoginLink() throws InterruptedException, IOException {

		login.click();
		Thread.sleep(2000);

		return new Login_Page();

	}

}
