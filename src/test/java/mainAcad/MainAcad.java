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
//        driver.manage().window().setSize(new Dimension(800, 600));
        driver.get(basicURL);
    }

    @Test
    public void frontEnd() throws InterruptedException {
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        driver.findElement(By.cssSelector("#post-9018")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#shortReiew")).isDisplayed());
        Assert.assertEquals("5 месяцев", driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(1) > div >p.sub")).getText());
        Assert.assertEquals("144 часа", driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(2) > div >p.sub")).getText());
        Assert.assertEquals("20 500 грн", driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(3) > div >p.sub")).getText());
        Assert.assertEquals("Junior FrontEnd Developer", driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(4) > div >p.sub")).getText());

    }
    @Test
    public void qA() throws InterruptedException {
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        driver.findElement(By.cssSelector("#post-7658")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(1) > div > p:nth-child(2)")).isDisplayed());
    }

    @Test
    public void basic() throws InterruptedException {
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        driver.findElement(By.cssSelector("#post-9450")).click();


    }
}
