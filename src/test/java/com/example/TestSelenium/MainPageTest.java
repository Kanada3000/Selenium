package com.example.TestSelenium;

import org.junit.jupiter.api.*;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private Actions action;


    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.epam.com");

        mainPage = new MainPage(driver);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void goToOptimizeLink() throws InterruptedException{
        Actions action = new Actions(driver).moveToElement(mainPage.servicesMenu);
        WebElement optimizeLink = driver.findElement(By.xpath("//a[@class='top-navigation__main-link' and text()='Optimize']"));
        action.click(optimizeLink).perform();
        Thread.sleep(10000);
        assertEquals("https://www.epam.com/services/optimize", driver.getCurrentUrl());
    }

    @Test
    public void changeLanguage() throws InterruptedException{
        mainPage.languageButton.click();
        WebElement ukraineLang = driver.findElement(By.xpath("//a[@class='location-selector__link' and @lang='uk']"));
        ukraineLang.click();
        Thread.sleep(10000);
        assertEquals("https://careers.epam.ua/", driver.getCurrentUrl());
    }
}
