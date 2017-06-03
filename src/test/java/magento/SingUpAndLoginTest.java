package magento;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import preparation.DriverConfiguration;

import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 * Created by X230 on 27.05.2017.
 */
public class SingUpAndLoginTest extends DriverConfiguration {


    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/search/?section_id=&section=&text=tv&rz-search-button=");
        driver.findElement(By.cssSelector("#block_with_search > div > div:nth-child(6) > div > div > div > div > div.g-i-tile-i-title.clearfix > a")).click();
        Thread.sleep(5000);
    }

    @Test
    public void firstTest1() {
        driver.get("http://magento.brainacad.com/english/customer/account/create/");
        driver.findElement(By.cssSelector("#firstname")).sendKeys("July");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Trachova");
        final String email = random(10) + "@gmail.com";
        driver.findElement(By.cssSelector("#email_address")).sendKeys(email);
        System.out.println(email);
        driver.findElement(By.cssSelector("#password")).sendKeys("631329");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("631329");
        driver.findElement(By.cssSelector("div.buttons-set > button")).click();

    }

    @Test
    public void firstTest2() {
        driver.get("http://magento.brainacad.com/english/customer/account/login/");
        driver.findElement(By.cssSelector("#email")).sendKeys("0.1926362042845149@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("631329");
        driver.findElement(By.cssSelector("#send2")).click();

    }

    @Test
    public void firstTest3() throws InterruptedException {
        driver.get("http://rozetka.com.ua");
        driver.findElement(By.cssSelector("#")).sendKeys("TV");
        Thread.sleep(5000);
    }
}