import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 * Created by X230 on 27.05.2017.
 */
public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void firstTest() throws InterruptedException {

        driver.findElement(By.cssSelector("#search")).sendKeys("PC games");
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
    /*@AfterMethod
    public void after() {
        driver.close();
    }*/
}