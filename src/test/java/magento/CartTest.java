package magento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Sacred on 03.06.2017.
 */
public class CartTest {
    public WebDriver driver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void firstTest3() {
        driver.get("http://magento.brainacad.com/");

    }


}
