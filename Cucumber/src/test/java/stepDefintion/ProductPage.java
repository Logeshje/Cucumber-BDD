package stepDefintion;

import static pages.ProductPage.*;

import io.cucumber.java.en.Then;


public class ProductPage {
	
	@Then("User able to see the product category page")

	public void user_enters_to_the_login_page(){
		ProductClick();
		
		
	}
}