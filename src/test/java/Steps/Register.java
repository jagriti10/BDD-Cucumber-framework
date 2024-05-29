package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	@Given("I am on the Login Page")
	public void i_am_on_the_login_page() {
	    System.out.println("In the i_am_on_the_login_page method");
	}

	@When("I enter valid email id")
	public void i_enter_valid_email_id() {
		 System.out.println("In the i_enter_valid_email_id method");
	}

	@When("I click submit")
	public void i_click_submit() {
		 System.out.println("In the i_click_submit method");
	}

	@Then("I see the username and password credentials")
	public void i_see_the_username_and_password_credentials() {
		 System.out.println("In the i_see_the_username_and_password_credentials method");
	}

}
