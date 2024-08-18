package stepDefintion;

import io.cucumber.java.en.Given;
import static pages.HomePage.*;
public class HomePage {
	
	@Given("User navigate to the home page")
	public void user_navigate_to_the_home_page() throws InterruptedException{
		
		ClickHamburgerMenu();
		ClickSignIn();
		
	}
	
	

}
