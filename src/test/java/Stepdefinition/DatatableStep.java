package Stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableStep {
	@Given("User in registraion page")
	public void user_in_registraion_page() {
	    System.out.println("Registration page is displayed");
	}

	@When("User Enter the details")
	public void user_enter_the_details(DataTable dataTable) {
		List<List<String>>reg=dataTable.asLists(String.class);
		
		for (List<String> lis : reg) {
			System.out.println(lis);
		}
		
	}

	@Then("Registration should be succesfull")
	public void registration_should_be_succesfull() {
	    System.out.println("User registered Succesfully");	
	}
	
	
	
	@Given("Doctor in is Registration")
	public void doctor_in_is_registration() {
	    System.out.println("Doctor Registration page Displayed ");
	}

	@When("Doctor Enetr the details")
	public void doctor_enetr_the_details(DataTable dt) {
	    
		List<Map<String, String>>dreg=dt.asMaps(String.class,String.class);
		//System.out.println(dreg.get(0).get("Firstname"));
		for (Map<String, String> data : dreg) {
			System.out.println(data.get("Firstname"));
			System.out.println(data.get("Lastname"));
			System.out.println(data.get("city"));
			System.out.println(data.get("phno"));
		}
	}

	@Then("Doctor Registration should be succesfull")
	public void doctor_registration_should_be_succesfull() {
	    System.out.println("Doctor Registered Succesfully");
	}

}
