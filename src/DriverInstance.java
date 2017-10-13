import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInstance {
    public WebDriver driver;
    String demoqaURL = "http://demoqa.com/registration/";
    String temporaryMail = "https://temp-mail.org/pl/";

    public DriverInstance() {
        this.driver = Main.driver;
    }


    public void waitUntilPageLoad(By b) throws InterruptedException{
        //driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(b));
    }

    public void openTestingPage (){
        driver.get(demoqaURL);
    }
    public void openTemporaryMailPage (){
        driver.get(temporaryMail);
    }

}