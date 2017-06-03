package magento;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import preparation.DriverConfiguration;

/**
 * Created by gryzyuka on 03.06.2017.
 */
public class PasswordReset extends DriverConfiguration {
    final String basicURL = "http://magento.brainacad.com/english/customer/account/login/";

    @BeforeMethod
    public void beforeMethod() {
        driver.get(basicURL);
    }

    @Test
    public void passwordReset() throws InterruptedException {

    }
}
