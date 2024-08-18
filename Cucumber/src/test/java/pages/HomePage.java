package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

    // Define the locators as constants
    public static final String HAMBURGER_MENU = "//input[@type='checkbox']";
    public static final String SIGN_IN = "/html/body/div/nav/div/ul/a[2]/li";

    // Declare WebDriver and WebDriverWait instances at class level
    public static WebDriver driver;
    private static WebDriverWait wait;

    // Initialize the WebDriver in a static block or method
    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Method to click the hamburger menu
    public static void ClickHamburgerMenu() throws InterruptedException {
        driver.findElement(By.xpath(HAMBURGER_MENU)).click();
    }

    // Method to click the sign-in link
    public static void ClickSignIn() {
        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SIGN_IN)));
        signIn.click();
    }
}
