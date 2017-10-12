import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DriverInstance {
    public WebDriver driver;
    String demoqaURL = "http://demoqa.com/registration/";
    String temporaryMail = "https://temp-mail.org/pl/";

    public DriverInstance() {
        this.driver = Main.driver;
    }

    public void waitUntilTestingPageLoad() throws InterruptedException{
        //driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("pie_submit")));
    }
    public void waitUntilMailPageLoad() throws InterruptedException{
        //driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("mail")));
    }

    public void openTestingPage (){
        driver.get(demoqaURL);
    }
    public void openTemporaryMailPage (){
        driver.get(temporaryMail);
    }

}