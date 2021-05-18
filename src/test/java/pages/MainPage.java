package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class MainPage{
    private WebDriver driver;
    private WebDriverWait wait;

    By servicesMenu = By.xpath("//a[@class='top-navigation__item-link' and text()='Services']");
    By optimizeLink = By.xpath("//a[@class='top-navigation__main-link' and text()='Optimize']");
    By languageButton = By.xpath("//button[@class='location-selector__button']");
    By ukraineLang = By.xpath("//a[@class='location-selector__link' and @lang='uk']");

    public void clickLink(){
        Actions action = new Actions(driver).moveToElement(driver.findElement(servicesMenu));
        action.click(driver.findElement(optimizeLink)).perform();
    }

    public void switchLocation(){
        driver.findElement(languageButton).click();
        driver.findElement(ukraineLang).click();
    }

    public boolean isRedirected(){
        try{
            wait.until(ExpectedConditions.urlToBe("https://careers.epam.ua/"));
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.wait = new WebDriverWait(this.driver, 10);
    }
}
