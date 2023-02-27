package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/Appfeature/Apptags.feature"},
		glue = {"Stepdefinition"},
		//tags = "@Admin and @Smoke"
		//tags = "@Staff or @Doctor"
		tags = "@all"
		
		)

public class Apptagslogin {
	

}
