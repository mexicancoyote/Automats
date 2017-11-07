package demoqa.com;

import Tolls.DriverInstance;
import Tolls.ElementsLocations;
import Tolls.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HappyPath {


    public  void happyPath () throws InterruptedException{
        String demoqaURL = "http://demoqa.com/registration/";
        Main.driver = new FirefoxDriver();
        ElementsLocations element = new ElementsLocations();
        Functions method = new Functions();
        DriverInstance instance = new DriverInstance();

        //Opens temporary e-mail page, waits to load and copies mail name to String.

        instance.openTemporaryMailPage();
        instance.waitUntilPageLoad(By.id("mail"));
        String temporaryMail = element.getTemporaryMail().getAttribute("value");


        //Opens testing page, waits to load.
        instance.openTestingPage(demoqaURL);
        instance.waitUntilPageLoad(By.name("pie_submit"));

        //Clicks 'Submit' button so all the mandatory fields are shown.

        element.getSubmitButton().click();

        //Fills all the mandatory fields with proper values.

        element.getFirstName().sendKeys(method.getRandomString(25));
        element.getLastName().sendKeys(method.getRandomString(25));
        method.randomClick(element.getHobby());
        element.getPhoneNumber().sendKeys(method.getRandomNumber(10));
        element.getUsername().sendKeys(method.getRandomString(10));
        element.getEMail().sendKeys(temporaryMail);
        String randomPass = method.getRandomPassword(15);
        element.getPassword().sendKeys(randomPass);
        element.getConfirmPassword().sendKeys(randomPass);

    }
}