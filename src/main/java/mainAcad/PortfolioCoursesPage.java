package mainAcad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by gryzyuka on 06.06.2017.
 */
public class PortfolioCoursesPage {
    final String course = "#post-";

    private final WebDriver driver;

    public PortfolioCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCourses(int a) {
        driver.findElement(By.cssSelector(course + a)).click();
    }
}
