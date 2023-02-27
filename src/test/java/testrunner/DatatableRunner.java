package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Appfeature/DataTable.feature"},
		glue = {"Stepdefinition"}
		)

public class DatatableRunner {

}
