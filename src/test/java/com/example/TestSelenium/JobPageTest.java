package com.example.TestSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobPageTest {
    private WebDriver driver;
    private JobPage jobPage;
    private Actions action;


    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.epam.com/careers/job-listings");

        jobPage = new JobPage(driver);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void chosenJob() throws InterruptedException{
        jobPage.keyword.sendKeys("Senior Full Stack Java");
        Actions action = new Actions(driver);
        action.moveToElement(jobPage.location).click().perform();
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//li[@aria-label='Ukraine']")));
        Thread.sleep(5000);
        action.moveToElement(jobPage.country).click().perform();
        Thread.sleep(1500);
        action.moveToElement(jobPage.city).click().perform();
        action.moveToElement(jobPage.findButton).click().perform();
        Thread.sleep(1500);
        assertEquals("Senior Full Stack Java Software Engineer (Angular)", driver.findElement(By.xpath("//a[@class='search-result__item-name']")).getText());
    }
}
