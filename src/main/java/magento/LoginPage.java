package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by X230 on 03.06.2017.
 */
public class LoginPage {
    final String forgotPassword = ".f-left";
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnforgotPassword() {
        driver.findElement(By.cssSelector(forgotPassword)).click();
    }
}
