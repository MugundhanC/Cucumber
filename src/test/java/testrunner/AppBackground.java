package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Appfeature/AppBackground.feature"},
		glue = {"Stepdefinition"}
		
		)

public class AppBackground {

}
