package cucumber.options;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import managers.FileReaderManager;

@CucumberOptions(features = "src\\test\\java\\features", glue = "stepDefinition", plugin = {
		"pretty", }, strict = true, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
