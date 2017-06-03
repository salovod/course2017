package magento;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Sacred on 03.06.2017.
 */
public class CartTest {
    public WebDriver driver;

    @BeforeMethod
    public void before() {
        driver.get("http://magento.brainacad.com/");
    }

    @Test
    public void firstTest3() {

    }


}
