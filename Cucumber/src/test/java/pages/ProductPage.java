package pages;

import org.openqa.selenium.By;

public class ProductPage {
	
	public static void ProductClick() {
		HomePage.driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button")).click();
	}

}
