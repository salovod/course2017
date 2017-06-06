package mainAcad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by gryzyuka on 06.06.2017.
 */
public class PortfolioCoursesPage {
    final String course = "#post-";
    final String getTeachText = "#forWho > div.container > div > div:nth-child(1) > p";

    private final WebDriver driver;

    public PortfolioCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCourses(int courseNumber) {
        driver.findElement(By.cssSelector(course + courseNumber)).click();
    }


    public String getTeachText() {
        return driver.findElement(By.cssSelector(getTeachText)).getText();
    }

}
