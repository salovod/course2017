import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    public void firstTest3() throws InterruptedException {
        driver.get("http://rozetka.com.ua");
        driver.findElement(By.cssSelector(".rz-header-search-input-text.passive")).sendKeys("TV");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".btn-link-i")).click();
        driver.findElement(By.cssSelector("#block_with_search > div > div:nth-child(6) > div > div > div > div > div.g-i-tile-i-title.clearfix > a")).click();
    }
    /*@AfterMethod
    public void after() {
        driver.close();
    }*/
}