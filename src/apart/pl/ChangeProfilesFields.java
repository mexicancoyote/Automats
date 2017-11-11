package apart.pl;

import Tools.DriverInstance;
import Tools.ElementsLocations;
import Tools.Functions;
import org.openqa.selenium.By;

public class ChangeProfilesFields {
    public void changeProfileFields () throws InterruptedException {
        ElementsLocations element = new ElementsLocations();
        Functions method = new Functions();
        DriverInstance instance = new DriverInstance();

        element.getMyAccount().click();
        element.getMyData().click();
        element.getChangeData().click();

        instance.waitUntilPageLoad(By.id("firstname"));

        element.getChangeFirstName().sendKeys(method.getRandomString(10));
        element.getChangeLastName().sendKeys(method.getRandomString(10));
        element.getChangeMobile().sendKeys(method.getRandomNumber(9));
        element.getChangeAddress().sendKeys(method.getRandomString(10));
        element.getChangeAddress2().sendKeys(method.getRandomString(10));
        element.getChangeCity().sendKeys(method.getRandomString(10));
        element.getChangePostcode().sendKeys(method.getRandomNumber(5));
        method.randomDropdownClick(element.getChangeCountry_id());
        element.getSafeChanges_id().click();

    }
}

