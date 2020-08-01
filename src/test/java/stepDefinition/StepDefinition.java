package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.HelloWorld_Page;

public class StepDefinition extends TestBase {

	public static HelloWorld_Page hp;

	@When("^user landed into opencms page$")
	public void user_landed_into_opencms_page() {
		hp = new HelloWorld_Page();

	}

	@When("^user click over \"([^\"]*)\" link$")
	public void user_click_over_link(String arg1) {

		hp.clickAtLink(arg1);
	}

	@Then("^user landed into \"([^\"]*)\" page$")
	public void user_landed_into_page(String arg1) throws Throwable {
		String title = hp.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Hello world! – opensourcecms");
	}

	@Then("^user must able to fill form and submit his details - \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_must_able_to_fill_form_and_submit_his_details_and(String arg1, String arg2, String arg3,
			String arg4) throws Throwable {

		hp.comment.sendKeys(arg1);
		hp.author.sendKeys(arg2);
		hp.email.sendKeys(arg3);
		hp.url.sendKeys(arg4);
		hp.submit.click();
	}

}
