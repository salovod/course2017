package rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sacred on 03.06.2017.
 */
public class HomePage {

    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInSearchInputField() {
        driver.findElement(By.cssSelector("[name='text']")).sendKeys("TV");
    }
}
