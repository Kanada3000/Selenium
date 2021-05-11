package com.example.TestSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaqPageTest {
    private WebDriver driver;
    private FaqPage faqPage;
    private Actions action;


    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://investors.epam.com/investors/faq");

        faqPage = new FaqPage(driver);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void backToHome() throws InterruptedException{
        faqPage.logoImg.click();
        Thread.sleep(10000);
        assertEquals("https://www.epam.com/", driver.getCurrentUrl());
    }

    @Test
    public void openQuestion() throws InterruptedException{
        faqPage.question.click();
        assertEquals("block", faqPage.answer.getCssValue("display"));
    }
}
