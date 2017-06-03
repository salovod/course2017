package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sacred on 03.06.2017.
 */
public class SearchResultPage {
    final String searchResultAmount = "div.count-container";
    final String noSearchResult = ".note-msg";
    final String noteMsg = "Your search returns no results.";
    private final WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean searchResultAmount() {
        return driver.findElement(By.cssSelector(searchResultAmount)).isDisplayed();
    }

    public String searchInvalidMsg() {
        return driver.findElement(By.cssSelector(noSearchResult)).getText();
    }
}
