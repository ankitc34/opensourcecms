package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Login_Page extends TestBase {

	@FindBy(xpath = "//p/label")
	public WebElement loginLabel;
	
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();

	}
	
	


	
}
