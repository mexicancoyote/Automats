import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{
        driver = new FirefoxDriver();
        Registration element = new Registration();
        Functions generator = new Functions();
        DriverInstance instance = new DriverInstance();

        instance.openTemporaryMailPage();
        instance.waitUntilMailPageLoad();

        String temporaryMail = element.getTemporaryMail().getAttribute("value");

        instance.openTestingPage();
        instance.waitUntilTestingPageLoad();


        element.getSubmitButton().click();
        element.getFirstName().sendKeys(generator.getRandomString(25));
        element.getLastName().sendKeys(generator.getRandomString(25));
        generator.randomCheckboxClick(element.getHobby());
        element.getPhoneNumber().sendKeys(generator.getRandomNumber(10));
        element.getUsername().sendKeys(generator.getRandomString(10));
        element.getEMail().sendKeys(temporaryMail);
        String randomPass = generator.getRandomPassword(15);
        element.getPassword().sendKeys(randomPass);
        element.getConfirmPassword().sendKeys(randomPass);
        element.getSubmitButton().click();

        String cycki = element.getMessage().getText();
        generator.happyPathFunctionality(cycki);


    }
}