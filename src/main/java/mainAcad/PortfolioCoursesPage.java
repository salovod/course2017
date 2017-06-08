package mainAcad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by gryzyuka on 06.06.2017.
 */
public class PortfolioCoursesPage {
    final String course = "#post-";
    final String getTeachText = "#forWho > div.container > div > div:nth-child(1) > p";
    final String fePeriod = "#shortReiew > div > div > div:nth-child(1) > div >p.sub";
    final String fePeriodHours = "#shortReiew > div > div > div:nth-child(2) > div >p.sub";
    final String feSum = "#shortReiew > div > div > div:nth-child(3) > div >p.sub";
    final String fePosition = "#shortReiew > div > div > div:nth-child(4) > div >p.sub";
    final String feDisplay = "#shortReiew";
    final String getPythonText = ".page-title";
    final String phpTitleText = ".page-title";

    private final WebDriver driver;

    public PortfolioCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean frontEndDisplay() {
        return driver.findElement(By.cssSelector(feDisplay)).isDisplayed();
    }

    public void clickOnCourses(int courseNumber) {
        driver.findElement(By.cssSelector(course + courseNumber)).click();
    }


    public String getTeachText() {
        return driver.findElement(By.cssSelector(getTeachText)).getText();
    }

    public String getQACourseText() {
        return driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(1) > div > p:nth-child(2)")).getText();
    }

    public String getPythonText() {
        return driver.findElement(By.cssSelector(getPythonText)).getText();
    }


    public String frontEndPeriod() {
        return driver.findElement(By.cssSelector(fePeriod)).getText();
    }

    public String frontEndPeriodHours() {
        return driver.findElement(By.cssSelector(fePeriodHours)).getText();
    }

    public String frontEndSum() {
        return driver.findElement(By.cssSelector(feSum)).getText();
    }

    public String frontEndPosition() {
        return driver.findElement(By.cssSelector(fePosition)).getText();
    }


    public String phpTitle() {
        return driver.findElement(By.cssSelector(phpTitleText)).getText();
    }

}
