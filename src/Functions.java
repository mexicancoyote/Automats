import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

public class Functions {


    protected String getRandomString(int x) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return randomString(x, str);
    }

    protected String getRandomNumber(int x) {
        String str = "1234567890";
        return randomString(x, str);
    }

    public String getRandomPassword(int x) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        return randomString(x, str);

    }

    public void randomClick(List<WebElement> elements) {
        Random random = new Random();
        int index = random.nextInt(elements.size());
        elements.get(index).click();
    }
    public void randomDropdownClick (WebElement element){
        Select oSelect = new Select(element);
        List<WebElement> oSize = oSelect.getOptions();
        randomClick(oSize);
    }
    public String randomString(int x, String str) {
        StringBuffer salt = new StringBuffer();
        Random rnd = new Random();
        while (salt.length() < x) { // length of the random string.
            int index = (int) (rnd.nextFloat() * str.length());
            salt.append(str.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public void happyPathFunctionality(String mess) {
        if (mess.equals("Thank you for your registration")) {
            System.out.println("Happy path works great ");
        } else {
            System.out.println("Something goes wrong");
        }

    }
    public void clipboardData (String string) throws AWTException {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
    public void uploadUserPicture () throws AWTException {
        clipboardData("C:\\Users\\mex\\IdeaProjects\\Automats\\palczak.jpg");
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


}