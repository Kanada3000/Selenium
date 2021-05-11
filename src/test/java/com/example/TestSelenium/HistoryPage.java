package com.example.TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryPage {

    @FindBy(xpath = "//a[contains(@class, 'timeline-slider__switcher-button') " +
                    "and contains(@class, 'js-tabs-link') " +
                    "and @data-item='14']")
    public WebElement link;

    @FindBy(xpath = "//div[@class='cookie-disclaimer__column']/button")
    public WebElement cookie;

    @FindBy(xpath = "//span[@class='timeline-slider__slide-date' and text()='2020']/parent::*/parent::*/parent::*")
    public WebElement div;

    public HistoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
