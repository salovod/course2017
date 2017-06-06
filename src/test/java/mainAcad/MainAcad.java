package mainAcad;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import preparation.DriverConfiguration;

/**
 * Created by gryzyuka on 06.06.2017.
 */
public class MainAcad extends DriverConfiguration {

    final String basicURL = "http://mainacad.com/";

    @BeforeMethod
    public void beforeMethod() {
        //river.manage().window().setSize(new Dimension(800, 600));
        driver.get(basicURL);
    }

    @Test
    public void frontEnd() throws InterruptedException {
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        driver.findElement(By.cssSelector("#post-9018")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#shortReiew")).isDisplayed());
    }

}
