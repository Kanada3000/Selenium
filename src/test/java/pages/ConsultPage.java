package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class ConsultPage{
    private WebDriver driver;
    By soundButton = By.xpath("//div[contains(@class, 'background-video__sound-icon')]/*[1]");
    By cookie = By.xpath("//div[@class='cookie-disclaimer__column']/button");

    public void closeCookies(){
        driver.findElement(cookie).click();
    }

    public void clickSpeaker(){
        new Actions(driver).moveToElement(driver.findElement(soundButton)).click().perform();
    }

    public boolean isSounds(){
        String css = driver.findElement(soundButton).getCssValue("display");
        return css.equals("none");
    }

    public ConsultPage(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
}
