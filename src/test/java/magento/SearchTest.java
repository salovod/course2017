package magento;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import preparation.DriverConfiguration;

/**
 * Created by Sacred on 03.06.2017.
 */
public class SearchTest extends DriverConfiguration {

    final String basicURL = "http://magento.brainacad.com/";

    @BeforeMethod
    public void beforeMethod() {
        driver.get(basicURL);
    }

    @Test
    public void searchBlouse() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.fillInSearchInputField("blouse");
        homePage.clickOnSearchIcon();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.searchResultAmount() == true);
    }

    @Test
    public void searchInvalid() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.fillInSearchInputField("@#$%^&*(");
        homePage.clickOnSearchIcon();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertEquals(searchResultPage.searchInvalidMsg(), searchResultPage.noteMsg);
        homePage.fillInSearchInputField("4356526272");
        homePage.clickOnSearchIcon();
        Assert.assertEquals(searchResultPage.searchInvalidMsg(), searchResultPage.noteMsg);
        homePage.fillInSearchInputField("брюки");
        homePage.clickOnSearchIcon();
        Assert.assertEquals(searchResultPage.searchInvalidMsg(), searchResultPage.noteMsg);
    }

    @Test
    public void searchVase() throws InterruptedException {
        driver.findElement(By.cssSelector("#search")).clear();
        driver.findElement(By.cssSelector("#search")).sendKeys("vase");
        driver.findElement(By.cssSelector(".button.search-button")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("SEARCH RESULTS FOR");
        Assert.assertTrue(driver.findElement(By.cssSelector("div.count-container")).isDisplayed());
    }

    @Test
    public void searchVasePOP() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.fillInSearchInputField("vase");
        homePage.clickOnSearchIcon();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.searchResultAmount() == true);
    }

    @Test
    public void searchMediaPlayer() throws InterruptedException {
        String searchInputField = ("#search");
        driver.findElement(By.cssSelector(searchInputField)).sendKeys("Media player");
        driver.findElement(By.cssSelector(".button.search-button")).click();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.searchResultAmount() == true);
    }
}
