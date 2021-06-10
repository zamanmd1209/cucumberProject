package testRunner;
//This is my test runner class

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features//",
		glue="stepDefinitions",
		monochrome=true,
		tags= {"@sanity1"},
		plugin= {"pretty","html:test-output"}
		)
public class TestRunner {

}
