import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HappyPath {



    public  void happyPath () throws InterruptedException{
        Main.driver = new FirefoxDriver();
        Registration element = new Registration();
        Functions generator = new Functions();
        DriverInstance instance = new DriverInstance();

        instance.openTemporaryMailPage();
        instance.waitUntilPageLoad(By.id("mail"));

        String temporaryMail = element.getTemporaryMail().getAttribute("value");

        instance.openTestingPage();
        instance.waitUntilPageLoad(By.name("pie_submit"));


        element.getSubmitButton().click();
        element.getFirstName().sendKeys(generator.getRandomString(25));
        element.getLastName().sendKeys(generator.getRandomString(25));
        generator.randomClick(element.getHobby());
        element.getPhoneNumber().sendKeys(generator.getRandomNumber(10));
        element.getUsername().sendKeys(generator.getRandomString(10));
        element.getEMail().sendKeys(temporaryMail);
        String randomPass = generator.getRandomPassword(15);
        element.getPassword().sendKeys(randomPass);
        element.getConfirmPassword().sendKeys(randomPass);

    }
}