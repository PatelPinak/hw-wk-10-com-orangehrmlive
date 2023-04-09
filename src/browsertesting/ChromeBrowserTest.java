package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {
        // Setup driver for Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the given the URL in Chrome Browser
        String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Give implicit wait to driver for the page to complete loading
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Get the title of the page
        System.out.println(driver.getTitle());
        // Get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Get page source
        System.out.println("Page source: " + driver.getPageSource());
        // Find the email field element
        driver.findElement(By.name("username")).sendKeys("Admin");
        // Type the password in the element
        driver.findElement(By.name("password")).sendKeys("admin123");
        // Close the browser
        driver.close();
    }
}
