package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Apptagslogin {
	
	@Given("User Enters the app url\"http:\\/\\/triotend.com\\/tts\\/site\\/Adminlogin\"")
	public void user_enters_the_app_url_http_triotend_com_tts_site_adminlogin() {
	    System.out.println("admin's url");
	}

	@When("Entering the username {string} Password {string}")
	public void entering_the_username_password(String string, String string2) {
	    System.out.println("Login deatails Entered");
	}

	@When("Clicking on submit buttton")
	public void clicking_on_submit_buttton() {
	    System.out.println("Clicking on Signin button");
	}

	@Then("User must navigate to Admin dashboard page")
	public void user_must_navigate_to_admin_dashboard_page() {
	    System.out.println("Admin Dashboard displayed");
	}

	@Given("User Enters the app url\"http:\\/\\/triotend.com\\/tts\\/site\\/Stafflogin\"")
	public void user_enters_the_app_url_http_triotend_com_tts_site_stafflogin() {
	    System.out.println("Staff url");
	}

	@Then("User must navigate to Staff dashboard page")
	public void user_must_navigate_to_staff_dashboard_page() {
	    System.out.println("Staff Dashboard displayed");
	}

	@Given("User Enters the app url\"http:\\/\\/triotend.com\\/tts\\/site\\/Doctorlogin\"")
	public void user_enters_the_app_url_http_triotend_com_tts_site_doctorlogin() {
	    System.out.println("Doctor's url");
	}

	@Then("User must navigate to Doctor dashboard page")
	public void user_must_navigate_to_doctor_dashboard_page() {
	    System.out.println("Doctor Dashboard displayed");
	}

	
	
}
