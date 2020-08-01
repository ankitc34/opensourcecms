package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.Cms_Page;
import objectRepository.HelloWorld_Page;

public class StepDefinition extends TestBase {

	public static HelloWorld_Page hp;
	public static Cms_Page cms;

	@When("^user landed into opencms page$")
	public void user_landed_into_opencms_page() {
		intitialization();
		cms = new Cms_Page();
		System.out.println(cms.getTitle());
		Assert.assertEquals(cms.getTitle(), "opensourcecms – Just another WordPress site");

	}

	@When("^user click over \"([^\"]*)\" link$")
	public void user_click_over_link(String arg1) throws InterruptedException {
		hp = cms.clickAtLink(arg1);
	}

	@Then("^user landed into \"([^\"]*)\" page$")
	public void user_landed_into_page(String arg1) throws Throwable {
		Assert.assertEquals(hp.hpTitle(), arg1);
	}

	@Then("^user must able to fill form and submit his details - \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_must_able_to_fill_form_and_submit_his_details_and(String arg1, String arg2, String arg3,
			String arg4) throws Throwable {

		hp.submitForm(arg1, arg2, arg3, arg4);
		Assert.assertEquals(hp.testUpdate(), arg1);
		
	}

}
