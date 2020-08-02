package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HelloWorld_Page extends TestBase {

	public HelloWorld_Page()throws IOException {
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

	@FindBy(xpath = "(//div[@class = 'comment-content'])[2]")
	public WebElement updatedComment;

	public String hpTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();

	}

	public void submitForm(String arg1, String arg2, String arg3, String arg4) {

		comment.sendKeys(arg1);
		author.sendKeys(arg2);
		email.sendKeys(arg3);
		url.sendKeys(arg4);
		submit.click();
	}

	public String testUpdate() {
		System.out.println(updatedComment.getText());
		return updatedComment.getText();
	}

}
