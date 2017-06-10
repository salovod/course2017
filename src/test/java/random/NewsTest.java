package random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import preparation.DriverConfiguration;

import java.util.ArrayList;

/**
 * Created by Sacred on 10.06.2017.
 */
public class NewsTest extends DriverConfiguration {

    @Test
    public void tdf() {
        driver.get("http://news.liga.net/all/");
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println("~~~~~~~~~~~~Get 20 news from web-site ~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 20; i++) {
            String news = driver.findElements(By.cssSelector("div.title > a")).get(i).getText();
            arrayList.add(news);
            System.out.println(arrayList.get(i));
        }
    }

    @Test
    public void dumskaya() {
        driver.get("http://dumskaya.net/");
        System.out.println("~~~~~~~~~~~~Get 20 news from web-site ~~~~~~~~~~~~~~~~~~~~");
        for (int i = 1; i <= 20; i++) {
            String news = driver.findElements(By.cssSelector(
                    "[id*='newstr'] >td:not(.newsdatetd):not(.newsdateline"))
                    .get(i).getText();
            System.out.println(news);
        }

    }

}
