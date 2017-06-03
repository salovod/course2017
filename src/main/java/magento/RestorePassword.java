package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

/**
 * Created by User on 03.06.2017.
 */
public class RestorePassword {
    final String emailRestoreField = ".input-text.required-entry.validate-email";
    final String submitButton = "[title='Submit']";
    final String basicURL = "http://magento.brainacad.com/";
    private final WebDriver driver;

    public RestorePassword(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(basicURL);
    }

    public void fillEmail(String email) {
        driver.findElement(By.cssSelector(emailRestoreField)).sendKeys(email);
    }

    public void clickOnSubmit() {
        driver.findElement(By.cssSelector(submitButton)).click();
    }

}
