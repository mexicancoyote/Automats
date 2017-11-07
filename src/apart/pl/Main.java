package apart.pl;

import Tolls.DriverInstance;
import Tolls.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, AWTException {
        demoqa.com.Main.driver = new FirefoxDriver();
        Functions method = new Functions();
        DriverInstance instance = new DriverInstance();
        Register register = new Register();
        Loging loging = new Loging();


        register.register();
        instance.waitUntilPageLoad(By.id("more-secondrow"));
        method.logOut();
        loging.loging();




    }
}