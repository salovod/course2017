package mainAcad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by X230 on 06.06.2017.
 */
public class HomePage {
    final String courses = "#menu-item-10452";
    final String basic = "#post-9450";
    final String getTeachText = "#forWho > div.container > div > div:nth-child(1) > p"
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void courses() {
        driver.findElement(By.cssSelector(courses)).click();
    }

    public void basic() {
        driver.findElement(By.cssSelector(basic)).click();
    }

    public String getTeachText() {
        return driver.findElement(By.cssSelector(getTeachText)).getText();
}
