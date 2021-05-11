package com.example.TestSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsultPageTest {
    private WebDriver driver;
    private ConsultPage consultPage;
    private Actions action;


    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.epam.com/services/consult-and-design");

        consultPage = new ConsultPage(driver);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void enableSound() throws InterruptedException{
        Thread.sleep(4000);
        consultPage.cookie.click();
        Thread.sleep(1000);
        new Actions(driver).moveToElement(consultPage.soundButton).click().perform();
        Thread.sleep(1000);
        assertEquals("none", consultPage.soundButton.getCssValue("display"));
    }
}
