package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FaqPage {
    private WebDriver driver;

    By question = By.xpath("//h6[text()='REPORTING & FINANCES']/parent::*");
    By answer = By.xpath("//h6[text()='REPORTING & FINANCES']/parent::*/following::ul");

    public void logoClick(){
        driver.findElement(By.xpath("//a[@class='header__logo']")).click();
    }

    public void clickQuestion(){
        driver.findElement(question).click();
    }

    public boolean isAnswerDisplay(){
        return driver.findElement(answer).isDisplayed();
    }

    public FaqPage(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }
}
