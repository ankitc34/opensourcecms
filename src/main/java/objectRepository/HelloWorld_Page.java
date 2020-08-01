package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HelloWorld_Page extends TestBase {

	public HelloWorld_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "textarea#comment")
	public WebElement comment;

	@FindBy(css = "input#author")
	public WebElement author;

	@FindBy(css = "input#email")
	public WebElement email;

	@FindBy(css = "input#url")
	public WebElement url;

	@FindBy(css = "input#submit")
	public WebElement submit;

	public String hpTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();

	}

}
