package apart.pl;

import Tolls.DriverInstance;
import Tolls.ElementsLocations;
import Tolls.Functions;
import demoqa.com.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register {

    public void register() throws InterruptedException {
        String apartUrl = "https://www.apart.pl/bizuteria";
        ElementsLocations element = new ElementsLocations();
        Functions method = new Functions();
        DriverInstance instance = new DriverInstance();

        //Opens temporary e-mail page, waits to load and copies mail name to String.

        instance.openTemporaryMailPage();
        instance.waitUntilPageLoad(By.id("mail"));
        String tempMail = method.copyTempMail();


        //Opens testing page, waits to load.
        instance.openTestingPage(apartUrl);
        instance.waitUntilPageLoad(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/li[3]/a"));

        element.getMyApart().click();
        instance.waitUntilPageLoad(By.id("new_email"));
        element.getEmailField().sendKeys(tempMail);
        element.getRegisterButton().click();

        String randomPass = method.getRandomPassword(15);
        element.getPassword2().sendKeys(randomPass);
        element.getConfirmedPassword2().sendKeys(randomPass);
        method.randomClick(element.getTytuł());
        element.getImię().sendKeys(method.getRandomString(10));
        element.getNazwisko().sendKeys(method.getRandomString(10));
        element.getAdres().sendKeys(method.getRandomString(10));
        element.getAdres2().sendKeys(method.getRandomString(10));
        element.getKodPocztowy().sendKeys(method.getRandomNumber(5));
        element.getMiejscowość().sendKeys(method.getRandomString(10));
        element.getTelefon().sendKeys(method.getRandomNumber(9));
        element.getCard().click();
        element.getRegulamin().click();
        element.getNewsleter().click();
        element.getNastepny1().click();

    }
}