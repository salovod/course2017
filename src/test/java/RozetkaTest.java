import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import preparation.DriverConfiguration;
import rozetka.HomePage;

import static org.testng.Assert.assertEquals;

/**
 * Created by X230 on 01.06.2017.
 */
public class RozetkaTest extends DriverConfiguration {

    final String basicURL = "http://rozetka.com.ua";

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(basicURL);
    }
    @Test
    public void firstTest3() {
        String expectedPrice = "399 999";
        HomePage homePage = new HomePage(driver);
        homePage.fillInSearchInputField();
        driver.findElement(By.cssSelector(".btn-link-i")).click();
        String actualPrice = driver.findElement(By.cssSelector("#js-product_670419-price")).getText();
        assertEquals(actualPrice, expectedPrice);
        driver.findElement(By.cssSelector("#block_with_search > div > div:nth-child(6) > div > div > div > div > div.g-i-tile-i-title.clearfix > a")).click();
        String actualPrice2 = driver.findElement(By.cssSelector("#price_label")).getText();
        assertEquals(actualPrice2, expectedPrice);
    }

    @Test
    public void findShirt() throws InterruptedException {
        String expectedPrice = "2 099";
        driver.findElement(By.cssSelector("[name =text]")).sendKeys("shirt");
        driver.findElement(By.cssSelector(".btn-link-i")).click();
        String actualPrice = driver.findElement(By.cssSelector("#js-product_9306798-price")).getText();
        assertEquals(actualPrice, expectedPrice);
        driver.findElement(By.cssSelector("#block_with_search > div > div:nth-child(2) > div > div > div > div > div.g-i-tile-i-title.clearfix > a")).click();
    }


    @Test
    public void checkMaskprice() {
        String expectedPrice = "11 015";
        driver.findElement(By.cssSelector("[name='text']")).sendKeys("Mask");
        driver.findElement(By.cssSelector(".btn-link-i")).click();
        String actualPrice = driver.findElement(By.cssSelector("#js-product_14429450-price")).getText();
        assertEquals(actualPrice, expectedPrice);
        driver.findElement(By.cssSelector("#block_with_search > div > div:nth-child(4) > div > div > div > div > div.g-i-tile-i-title.clearfix > a")).click();
    }
}