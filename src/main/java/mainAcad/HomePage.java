package mainAcad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by X230 on 06.06.2017.
 */
public class HomePage {
    final String courses = "#menu-item-10452";
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseCourse() {
        driver.findElement(By.cssSelector(courses)).click();
    }
}
