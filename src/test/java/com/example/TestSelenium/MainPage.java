package com.example.TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "//a[@class='top-navigation__item-link' and text()='Services']")
    public WebElement servicesMenu;

    @FindBy(xpath = "//button[@class='location-selector__button']")
    public WebElement languageButton;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
