package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HistoryPage {
    private WebDriver driver;
    By link = By.xpath(
            "//a[contains(@class, 'timeline-slider__switcher-button') and contains(@class, 'js-tabs-link') and @data-item='14']");
    By cookie = By.xpath("//div[@class='cookie-disclaimer__column']/button");
    By div = By.xpath("//span[@class='timeline-slider__slide-date' and text()='2020']/parent::*/parent::*/parent::*");

    public void closeCookies(){
        driver.findElement(cookie).click();
    }

    public void clickYear(){
        driver.findElement(link).click();
    }

    public boolean isCorrect(){
        return driver.findElement(div).getAttribute("class").contains("active");
    }

    public HistoryPage(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
}
