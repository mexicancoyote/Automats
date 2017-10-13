import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class HappyPathWithNonMandtoryField {


    public void happyPathWithNonMandtoryField () throws AWTException {
        Registration element = new Registration();
        Functions generator = new Functions();

        generator.randomClick(element.getMaritalStatus());
        generator.randomDropdownClick(element.getCountry());
        generator.randomDropdownClick(element.getMonth());
        generator.randomDropdownClick(element.getDay());
        generator.randomDropdownClick(element.getYear());
        element.getYourProfilePictureButton().click();
        generator.uploadUserPicture();
        element.getAboutYourself().sendKeys(generator.getRandomString(1000));





    }







}
