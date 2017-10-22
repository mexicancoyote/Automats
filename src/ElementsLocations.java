import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsLocations extends DriverInstance{

    //These methods bellow gets webelements location.

    public WebElement getFirstName(){
        return driver.findElement(By.id("name_3_firstname"));
    }

    public WebElement getLastName(){
        return driver.findElement(By.id("name_3_lastname"));
    }
    public List<WebElement> getHobby(){
        return driver.findElements(By.name("checkbox_5[]"));
    }
    public WebElement getCountry(){return driver.findElement(By.id("dropdown_7")); }
    public WebElement getMonth(){return driver.findElement(By.id("mm_date_8")); }
    public WebElement getDay(){return driver.findElement(By.id("dd_date_8")); }
    public WebElement getYear(){return driver.findElement(By.id("yy_date_8")); }
    public WebElement getPhoneNumber(){
        return driver.findElement(By.id("phone_9"));
    }

    public List<WebElement> getMaritalStatus (){return driver.findElements(By.name("radio_4[]")); }

    public WebElement getUsername(){
        return driver.findElement(By.id("username"));
    }

    public WebElement getEMail(){
        return driver.findElement(By.id("email_1"));
    }

    public WebElement getAboutYourself(){
        return driver.findElement(By.id("description"));
    }

    public WebElement getPassword(){
        return driver.findElement(By.id("password_2"));
    }

    public WebElement getConfirmPassword(){
        return driver.findElement(By.id("confirm_password_password_2"));
    }

    public WebElement getYourProfilePictureButton(){
        return driver.findElement(By.id("profile_pic_10"));
    }

    public WebElement getSubmitButton(){
        return driver.findElement(By.name("pie_submit"));
    }
    public WebElement getTemporaryMail(){
        return driver.findElement(By.id("mail"));
    }

    public WebElement getMessage () {return  driver.findElement(By.className("piereg_message"));}


}