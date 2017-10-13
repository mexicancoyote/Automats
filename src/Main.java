import org.openqa.selenium.WebDriver;

import java.awt.*;

public class Main {
    public static WebDriver driver;



    public static void main(String[] args) throws InterruptedException, AWTException {
        RegisterValidation confirm = new RegisterValidation();
        HappyPath happyPath = new HappyPath();
        HappyPathWithNonMandtoryField happyPathWithNonMandtoryField = new HappyPathWithNonMandtoryField();
        happyPath.happyPath();
        happyPathWithNonMandtoryField.happyPathWithNonMandtoryField();

        confirm.register();

    }
}
