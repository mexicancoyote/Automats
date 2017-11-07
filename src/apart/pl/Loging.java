package apart.pl;

import Tolls.DriverInstance;
import Tolls.ElementsLocations;
import Tolls.Functions;
import demoqa.com.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loging {
    public void loging () throws InterruptedException {
        ElementsLocations element = new ElementsLocations();
        Functions method = new Functions();
        DriverInstance instance = new DriverInstance();
        Register register = new Register();
        String apartUrl = "https://www.apart.pl/users/login";


        instance.openTestingPage(apartUrl);
        instance.waitUntilPageLoad(By.id("password"));
        element.getEmail().sendKeys(method.copyTempMail());
        //element.getPassword1().sendKeys(register.copyTempPass());
        element.getLog().click();

    }
}
