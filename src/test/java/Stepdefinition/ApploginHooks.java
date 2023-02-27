package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApploginHooks {
	
	@Given("User is in Loginpage")
	public void user_is_in_loginpage() {
	    System.out.println("User is in Admin Loginpage");
	}

	@When("Entering the Admin name {string}")
	public void entering_the_admin_name(String string) {
	    System.out.println("User Enter the Name");
	}

	@When("Entering the password {string}")
	public void entering_the_password(String string) {
	    System.out.println("User Enter the password");
	}

	@When("Clicking on signin button")
	public void clicking_on_signin_button() {
	    System.out.println("User Clicked signin button");
	}

	@Then("User must navigate to dashboard page")
	public void user_must_navigate_to_dashboard_page() {
	    System.out.println("User naviagte to homepage");
	}

}
