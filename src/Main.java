import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Main {


    public static void main(String[] args) {
        Functions randomString = new Functions();
        // Create a new instance of the FireFox driver
        WebDriver driver = new FirefoxDriver();

        // Put an Implicit wait,
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL
        driver.get("http://demoqa.com/registration");
        // Click 'Submit' button.
        driver.findElement(By.name("pie_submit")).click();
        // Fill out 'First Name'.
        driver.findElement(By.id("name_3_firstname")).sendKeys(randomString.getString(10));
        // Fill out 'Last Name'.
        driver.findElement(By.id("name_3_lastname")).sendKeys(randomString.getString(1));
        // Marks all option is check box
        driver.findElement(By.name("checkbox_5[]")).click();
        // Fill out 'Phone Number'
        driver.findElement(By.id("phone_9")).sendKeys(randomString.getNumber(10));
        // Fill out 'Username'
        driver.findElement(By.id("username")).sendKeys(randomString.getString(10));
        // Fill out 'E-mail'
        driver.findElement(By.id("email_1")).sendKeys(randomString.getEmailAdress(5));
        // Fill out 'Password' + 'Confirm Password'
        driver.findElement(By.id("password_2")).sendKeys(randomString.getPassword(20));






    }
}

