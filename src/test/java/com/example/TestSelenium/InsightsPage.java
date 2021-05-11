package com.example.TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsightsPage {

    @FindBy(xpath = "//div[@class='detail-pages-filter__top-panel-holder']/parent::*")
    public WebElement filterByButton;

    public InsightsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
