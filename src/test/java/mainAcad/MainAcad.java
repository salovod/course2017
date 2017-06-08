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
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(9018);
        Assert.assertTrue(portfolioCoursesPage.frontEndDisplay());
        Assert.assertEquals("5 месяцев", portfolioCoursesPage.frontEndPeriod());
        Assert.assertEquals("144 часа", portfolioCoursesPage.frontEndPeriodHours());
        Assert.assertEquals("20 500 грн", portfolioCoursesPage.frontEndSum());
        Assert.assertEquals("Junior FrontEnd Developer", portfolioCoursesPage.frontEndPosition());

    }

    @Test
    public void php() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(9856);
        Assert.assertEquals("Программирование на PHP", portfolioCoursesPage.phpTitle());
    }

    @Test
    public void Python() throws InterruptedException {
        String expectedText = "Знакомство с языком программирования Python областями его использования.";
        driver.findElement(By.cssSelector("#menu-item-10452")).click();
        driver.findElement(By.cssSelector("#post-9840")).click();
        String actualText = driver.findElement(By.cssSelector("body > div.bg-overlay > div > div.content > div > div > div.content-column-content > div.ompf-portfolio-single.ompf-format-image.ompf-ratio-full.ompf-media-position-left > div.ompf-portfolio-single-description > div > div.omsc-full-width-section > div > div > div > div > div:nth-child(29) > ul:nth-child(1) > li")).getText();
        assertEquals(actualText, expectedText);

    }

    @Test
    public void qA() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(7658);
        String expected = "Длительность";
        Assert.assertEquals(portfolioCoursesPage.getQACourseText(), expected);
    }


    @Test
    public void basic() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(9450);
        String expectedText = "Колеблешься, ту ли специальность выбрал? Уверен в правильности выбора, но хочешь усилить свои позиции техническими знаниями?\nПредлагаем старт в программировании – с нуля, без отрыва от занятий, без лишней траты времени, без ненужной академичности.";
        String actualText = portfolioCoursesPage.getTeachText();
        assertEquals(actualText, expectedText);


    }

    @Test
    public void javaBasics() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(9012);
        Assert.assertEquals("Часть 1. Java Basics", portfolioCoursesPage.javaBasics());
    }

    @Test
    public void javaSE() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(9015);
        Assert.assertEquals("Часть 2. Java OOP & SE", portfolioCoursesPage.javaSE());
    }

    @Test
    public void frontEndJS() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.chooseCourse();
        PortfolioCoursesPage portfolioCoursesPage = new PortfolioCoursesPage(driver);
        portfolioCoursesPage.clickOnCourses(9024);
        Assert.assertTrue(portfolioCoursesPage.frontEndDisplay());
        Assert.assertEquals("Часть 2. JavaScript", portfolioCoursesPage.frontEndJS());
    }
}
