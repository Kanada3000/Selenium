package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class InsightsPage{
    private WebDriver driver;
    private WebDriverWait wait;

    By filterByButton = By.xpath("//div[contains(@class, 'detail-pages-filter__top-panel')]");
    By pagesList = By.xpath("//div[contains(@class, 'detail-pages-list--main')]");

    public void scrollFilter(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(pagesList));
    }

    public boolean isFixed(){
        wait.until(ExpectedConditions.attributeContains(filterByButton, "class", "pinned-filter--fixed"));
        String cssPosition = driver.findElement(filterByButton).getCssValue("position");
        return cssPosition.equals("fixed");
    }

    public InsightsPage(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        this.wait = new WebDriverWait(this.driver, 10);
    }
}
