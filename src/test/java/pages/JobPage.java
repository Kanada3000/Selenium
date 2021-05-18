package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class JobPage{
    private WebDriver driver;
    private WebDriverWait wait;

    By keyword = By.xpath("//input[@id='new_form_job_search_1445745853_copy-keyword']");
    By location = By.xpath("//div[@class='recruiting-search__location']");
    By country = By.xpath("//li[@class='select2-results__option' and @aria-label='Ukraine']/strong");
    By city = By.xpath("//li[@aria-label='Ukraine']/ul/li[text()='Kyiv']");
    By findButton = By.xpath("//button[@class='recruiting-search__submit']");
    By itemName = By.xpath("//a[@class='search-result__item-name']");

    public void enterKey(String key){
        driver.findElement(keyword).sendKeys(key);
    }

    public void enterLocation(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(location)).click().perform();
        action.moveToElement(driver.findElement(country));
        wait.until(ExpectedConditions.elementToBeClickable(country));
        action.moveToElement(driver.findElement(country)).click().perform();
        action.moveToElement(driver.findElement(city));
        wait.until(ExpectedConditions.elementToBeClickable(city));
        action.moveToElement(driver.findElement(city)).click().perform();
    }

    public void formSubmit(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(findButton)).click().perform();
    }

    public boolean isCorrectJob(String expectedString){
        try{
            wait.until(ExpectedConditions.textToBe(itemName, expectedString));
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public JobPage(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.wait = new WebDriverWait(this.driver, 10);
    }
}
