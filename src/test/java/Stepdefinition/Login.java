package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("User enters App Url")
	public void user_enters_app_url() {
	    System.out.println("User Enter the url");
	}

	@Given("Checks for admin login page gets loaded")
	public void checks_for_admin_login_page_gets_loaded() {
	    System.out.println("Admin login page");
	}

	@When("Entering the username and password")
	public void entering_the_username_and_password() {
	    System.out.println("Entering the user name and password");
	}

	@When("Clicking on submit button")
	public void clicking_on_submit_button() {
	    System.out.println("Clicking on signin button");
	}

	@Then("User must navigate to homepage")
	public void user_must_navigate_to_homepage() {
	   System.out.println("Navigate to Homepage");
	}
}