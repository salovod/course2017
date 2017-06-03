package magento;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import preparation.DriverConfiguration;

/**
 * Created by Sacred on 03.06.2017.
 */
public class SearchTest extends DriverConfiguration {

    final String baseURL = "http://magento.brainacad.com";
    final String searchInputField = "[name=\"q\"]";

@BeforeMethod
    public void SearchPants() {
        driver.getCurrentUrl()
    }
        driver.findElement(By.cssSelector(searchInputField)).sendKeys("TV");
}
