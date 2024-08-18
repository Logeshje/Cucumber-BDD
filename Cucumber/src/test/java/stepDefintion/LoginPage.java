package stepDefintion;

import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {

	@When("User enters to the login page")
	public void user_enters_to_the_login_page(){
		LoginCredentials();
		
		
	}
}
