package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
			features = ".//featureFiles",
			glue = {"stepDefinition"},
			plugin = {"pretty", "html:target/cucumber-reports2.html"},
			tags = "@smoke"
		)


public class Runner {	

}
