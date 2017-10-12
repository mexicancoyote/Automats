import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Functions {


       protected String getRandomString(int x) {
        String lettrs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * lettrs.length());
            salt.append(lettrs.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    protected String getRandomNumber(int x) {
        String numbers = "1234567890";
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * numbers.length());
            salt.append(numbers.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    protected String getRandomEmail (int x) {
        String lettrs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * lettrs.length());
            salt.append(lettrs.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr.toLowerCase() + "@mail.com";
    }
    public String getRandomPassword (int x) {

        String lettrs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * lettrs.length());
            salt.append(lettrs.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    public void randomCheckboxClick (List<WebElement> elements) {
        Random random = new Random();
        int index = random.nextInt(elements.size());
        elements.get(index).click();
    }

    public void happyPathFunctionality (String cycki){

            System.out.println(cycki);

           }


}