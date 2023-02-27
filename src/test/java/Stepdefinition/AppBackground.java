package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppBackground {

	@Given("Enetr the Application Url\"http:\\/\\/triotend.com\\/tts\\/site\\/login\"")
	public void enetr_the_application_url_http_triotend_com_tts_site_login() {
	    System.out.println("Enter the URl");
	}

	@When("Username {string} Password {string}")
	public void username_password(String string, String string2) {
	    System.out.println("Username and password Entered");
	}

	@When("Click on the signin button")
	public void click_on_the_signin_button() {
	    System.out.println("Entered the submit button");
	}

	@Then("Checks for the AddAppointment")
	public void checks_for_the_add_appointment() {
	    System.out.println("AddAppointment page displayed");
	}

	@Then("Checks for the Phonecalltags")
	public void checks_for_the_phonecalltags() {
	   System.out.println("Phonecalltags page displayed");
	}

	@Then("Checks for the Visitorbook")
	public void checks_for_the_visitorbook() {
	    System.out.println("Visitorbook page displayed");
	}

}
