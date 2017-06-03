package magento;

import org.testng.annotations.BeforeMethod;
import preparation.DriverConfiguration;

/**
 * Created by Sacred on 03.06.2017.
 */
public class SearchTest extends DriverConfiguration {

    final String baseURL = "";

    @BeforeMethod
    public void before() {
        driver.get(baseURL);
    }
}
