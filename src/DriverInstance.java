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
    // This method checks page readiness.

    public void waitUntilPageLoad(By id) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(id));
    }
    // These methods bellow opens pages.

    public void openTestingPage (){
        driver.get(demoqaURL);
    }
    public void openTemporaryMailPage (){
        driver.get(temporaryMail);
    }

}