import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by X230 on 01.06.2017.
 */
public class RozetkaTest {

    WebDriver driver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void firstTest3() {
        String expectedPrice = "399 999";
        driver.get("http://rozetka.com.ua");
        driver.findElement(By.cssSelector("[name='text']")).sendKeys("TV");
        driver.findElement(By.cssSelector(".btn-link-i")).click();
        String actualPrice = driver.findElement(By.cssSelector("#js-product_670419-price")).getText();
        assertEquals(actualPrice, expectedPrice);
        driver.findElement(By.cssSelector("#block_with_search > div > div:nth-child(7) > div > div > div > div > div.g-i-tile-i-title.clearfix > a")).click();
    }


    @Test
    public void checkMaskprice() {
        String expectedPrice = "11 015";
        driver.get("http://rozetka.com.ua");
        driver.findElement(By.cssSelector("[name='text']")).sendKeys("Mask");
        driver.findElement(By.cssSelector(".btn-link-i")).click();
        String actualPrice = driver.findElement(By.cssSelector("#js-product_14429450-price")).getText();
        assertEquals(actualPrice, expectedPrice);
        driver.findElement(By.cssSelector("#block_with_search > div > div:nth-child(4) > div > div > div > div > div.g-i-tile-i-title.clearfix > a")).click();
    }

}