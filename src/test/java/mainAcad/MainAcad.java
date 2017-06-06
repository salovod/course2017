package mainAcad;

import org.openqa.selenium.By;
import org.testng.Assert;
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
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(9018);
        Assert.assertTrue(driver.findElement(By.cssSelector("#shortReiew")).isDisplayed());
        Assert.assertEquals("5 месяцев", driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(1) > div >p.sub")).getText());
        Assert.assertEquals("144 часа", driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(2) > div >p.sub")).getText());
        Assert.assertEquals("20 500 грн", driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(3) > div >p.sub")).getText());
        Assert.assertEquals("Junior FrontEnd Developer", driver.findElement(By.cssSelector("#shortReiew > div > div > div:nth-child(4) > div >p.sub")).getText());

    }

    @Test
    public void Python() throws InterruptedException {
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        driver.findElement(By.cssSelector("#post-9840")).click();

    }

    @Test
    public void qA() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(7658);
        String expected = "";
        Assert.assertEquals(portfolioCoursesPage.getQACourseText(), expected);
    }


    @Test
    public void basic() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(9450);
        String expectedText = "Колеблешься, ту ли специальность выбрал? Уверен в правильности выбора, но хочешь усилить свои позиции техническими знаниями?\nПредлагаем старт в программировании – с нуля, без отрыва от занятий, без лишней траты времени, без ненужной академичности.";
        String actualText = driver.findElement(By.cssSelector("#forWho > div.container > div > div:nth-child(1) > p")).getText();
        assertEquals(actualText, expectedText);


    }
}
