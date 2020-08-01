package cucumber.options;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( 
		features = "src/test/java/features",
		glue = "stepDefinition"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests  {

}
