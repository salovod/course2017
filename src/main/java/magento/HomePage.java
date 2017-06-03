package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sacred on 03.06.2017.
 */
public class HomePage {

    final String searchInputField = "#search";
    final String searchIcon = ".button.search-button";
    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInSearchInputField(String value) {
        driver.findElement(By.cssSelector(searchInputField)).sendKeys(value);
    }

    public void clickOnSearchIcon() {
        driver.findElement(By.cssSelector(searchIcon)).click();
    }

}
