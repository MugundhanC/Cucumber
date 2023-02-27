package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamplesStep {

	@Given("Staff is in staff login page")
	public void staff_is_in_staff_login_page() {
		System.out.println("Staff login page displayed");
	    
	}

	@When("Staff Enter the username\"trio1\"")
	public void staff_enter_the_username_trio1() {
	    System.out.println("Staff Enterd username trio1");
	}

	@When("Staff Enter the password\"TTS1\"")
	public void staff_enter_the_password_tts1() {
	    System.out.println("Staff Enterd password TTS1");
	}

	@When("Staffs clicks on the submit button")
	public void staffs_clicks_on_the_submit_button() {
	    System.out.println("Staff Clicked Signin Button"); 
	}

	@Then("Staff navigated to the dashboard page")
	public void staff_navigated_to_the_dashboard_page() {
	    System.out.println("Satff is in Dashboard Page");
	}

	@When("Staff Enter the username\"trio2\"")
	public void staff_enter_the_username_trio2() {
	    System.out.println("Staff Enterd the username trio2");
	}

	@When("Staff Enter the password\"TTS2\"")
	public void staff_enter_the_password_tts2() {
	   System.out.println("Staff Entered the password TTS2");
	}

	@When("Staff Enter the username\"trio3\"")
	public void staff_enter_the_username_trio3() {
	   System.out.println("Entered the username trio3");
	}

	@When("Staff Enter the password\"TTS3\"")
	public void staff_enter_the_password_tts3() {
	   System.out.println("Enterd the password TTS3");
	}
}
