package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Appfeature/Report.feature"},
		glue = {"Stepdefinition"},
		plugin = {"pretty",
		       "json:target/Appreport/status.json",
		       "junit:target/Appreport/status.xml"
		},
		publish = true
		
		)


public class ReportRunner {

}
