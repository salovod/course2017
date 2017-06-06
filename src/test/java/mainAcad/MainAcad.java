package mainAcad;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import preparation.DriverConfiguration;

import static org.testng.Assert.assertEquals;

/**
 * Created by gryzyuka on 06.06.2017.
 */
public class MainAcad extends DriverConfiguration {

    final String basicURL = "http://mainacad.com/";

    @BeforeMethod
    public void beforeMethod() {
//        driver.manage().window().setSize(new Dimension(800, 600));
        driver.get(basicURL);
    }

    @Test
    public void frontEnd() throws InterruptedException {
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        driver.findElement(By.cssSelector("#post-9018")).click();


    }

    @Test
    public void Basic() throws InterruptedException {
        String expectedText = "Колеблешься, ту ли специальность выбрал? Уверен в правильности выбора, но хочешь усилить свои позиции техническими знаниями?\nПредлагаем старт в программировании – с нуля, без отрыва от занятий, без лишней траты времени, без ненужной академичности.";
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        driver.findElement(By.cssSelector("#post-9450")).click();
        String actualText = driver.findElement(By.cssSelector("#forWho > div.container > div > div:nth-child(1) > p")).getText();
        assertEquals(actualText, expectedText);


    }
}
