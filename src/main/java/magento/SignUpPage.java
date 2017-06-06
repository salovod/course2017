package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by gryzyuka on 03.06.2017.
 */
public class SignUpPage {

    final String firstName = "#firstname";
    final String lastName = "#lastname";
    final String emailAddress = "#email_address";
    final String password = "#password";
    final String confirmation = "#confirmation";
    final String signUpBtn = "div.buttons-set > button";
    private final WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInFirstNameField(String value) {
        driver.findElement(By.cssSelector(firstName)).clear();
        driver.findElement(By.cssSelector(firstName)).sendKeys(value);
    }

    public void fillInLastNameField(String value) {
        driver.findElement(By.cssSelector(lastName)).clear();
        driver.findElement(By.cssSelector(lastName)).sendKeys(value);
    }

    public void fillInEmailField(String value) {
        driver.findElement(By.cssSelector(emailAddress)).clear();
        driver.findElement(By.cssSelector(emailAddress)).sendKeys(value);
    }

    public void fillInPasswordField(String value) {
        driver.findElement(By.cssSelector(password)).clear();
        driver.findElement(By.cssSelector(password)).sendKeys(value);
    }

    public void fillInConfirmationField(String value) {
        driver.findElement(By.cssSelector(confirmation)).clear();
        driver.findElement(By.cssSelector(confirmation)).sendKeys(value);
    }

    public void clickOnSignUpButton() {
        driver.findElement(By.cssSelector(signUpBtn)).click();
    }
}
