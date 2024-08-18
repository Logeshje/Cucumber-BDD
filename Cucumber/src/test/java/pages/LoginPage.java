package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static void LoginCredentials() {
        WebElement usernameField = HomePage.driver.findElement(By.xpath("//*[@id=\"usr\"]"));
        usernameField.sendKeys("lk");
        
        WebElement password = HomePage.driver.findElement(By.xpath("//*[@id=\"pwd\"]"));
        password.sendKeys("1234");
        
        HomePage.driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
    }
}
