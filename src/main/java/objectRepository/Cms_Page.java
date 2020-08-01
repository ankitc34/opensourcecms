package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Cms_Page extends TestBase {

	public Cms_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//li/a[text() = \"Hello world!\"])[1]")
	public WebElement helloWorld;

	public String getTitle() {
		return driver.getTitle();
	}

	public HelloWorld_Page clickAtLink(String arg1) throws InterruptedException {

		helloWorld.click();
		Thread.sleep(2000);

		return new HelloWorld_Page();

	}

}
