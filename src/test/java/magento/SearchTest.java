package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import preparation.DriverConfiguration;

import java.util.concurrent.TimeUnit;

import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 * Created by Sacred on 03.06.2017.
 */
public class SearchTest extends DriverConfiguration {

    final String basicURL = "http://magento.brainacad.com/";

    @BeforeMethod
    public void beforeMethod() {
        driver.get(basicURL);
    }

    @Test
    public void searchBlouse() throws InterruptedException {
        driver.findElement(By.cssSelector("#search")).sendKeys("blouse");
        driver.findElement(By.cssSelector(".button.search-button")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("div.count-container")).isDisplayed());
    }

    @Test
    public void searchInvalidSymbols() throws InterruptedException {
        driver.findElement(By.cssSelector("#search")).sendKeys("@#$%^&*(");
        driver.findElement(By.cssSelector(".button.search-button")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("SEARCH RESULTS FOR '@#$%^&*('");
        driver.findElement(By.cssSelector(".note-msg")).getText().contains("Your search returns no results.");
        Assert.assertTrue(driver.findElement(By.cssSelector(".note-msg")).getText().contains("Your search returns no results."));
    }

    @Test
    public void searchInvalidNumbers() throws InterruptedException {
        driver.findElement(By.cssSelector("#search")).clear();
        driver.findElement(By.cssSelector("#search")).sendKeys("4356526272");
        driver.findElement(By.cssSelector(".button.search-button")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("SEARCH RESULTS FOR '4356526272'");
        Assert.assertTrue(driver.findElement(By.cssSelector(".note-msg")).getText().contains("Your search returns no results."));
    }

    @Test
    public void searchInvalidCyrillic() throws InterruptedException {
        driver.findElement(By.cssSelector("#search")).clear();
        driver.findElement(By.cssSelector("#search")).sendKeys("брюки");
        driver.findElement(By.cssSelector(".button.search-button")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("SEARCH RESULTS FOR");
        Assert.assertTrue(driver.findElement(By.cssSelector(".note-msg")).getText().contains("Your search returns no results."));
    }
}