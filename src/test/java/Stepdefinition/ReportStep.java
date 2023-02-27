package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportStep {
	@Given("Enter Application url {string}")
	public void enter_application_url(String string) {
	    System.out.println("Url Entered");
	}
	@When("Username {string} password {string}")
	public void username_password(String string, String string2) {
		 System.out.println("Username and Password is Entered");
	}
	   
	@When("Click on Signin Button")
	public void click_on_signin_button() {
	   System.out.println("Signin button is checked");
	}

	@Then("Check for AddAppointment")
	public void check_for_add_appointment() {
	    System.out.println("Addappointment is checked");
	}

	@Then("Check for Phonecall logs")
	public void check_for_phonecall_logs() {
	    System.out.println("Phonecall log is checked");
	}

	@Then("Check for Visitor Book")
	public void check_for_visitor_book() {
	    System.out.println("Visitor Book is checked");
	}

}
