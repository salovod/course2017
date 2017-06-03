package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

/**
 * Created by User on 03.06.2017.
 */
public class RestorePassword {
    final String basicURL = "http://magento.brainacad.com/";
    private final WebDriver driver;

    public RestorePassword(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(basicURL);
    }

    public void fillEmail() throws InterruptedException {
        driver.findElement(By.cssSelector("")).sendKeys("");
    }

    public void clickOnSubmit() throws InterruptedException {
        driver.findElement(By.cssSelector("")).click();
    }

}
