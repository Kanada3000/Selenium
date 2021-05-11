package com.example.TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultPage {

    @FindBy(xpath = "//div[contains(@class, 'background-video__sound-icon')]/*[1]")
    public WebElement soundButton;

    @FindBy(xpath = "//div[contains(@class, 'background-video__sound-icon')]")
    public WebElement soundDiv;

    @FindBy(xpath = "//div[@class='cookie-disclaimer__column']/button")
    public WebElement cookie;

    public ConsultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
