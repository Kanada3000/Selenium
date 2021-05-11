package com.example.TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaqPage {

    @FindBy(xpath = "//a[@class='header__logo']")
    public WebElement logoImg;

    @FindBy(xpath = "//h6[text()='REPORTING & FINANCES']/parent::*")
    public WebElement question;

    @FindBy(xpath = "//h6[text()='REPORTING & FINANCES']/parent::*/following::ul")
    public WebElement answer;

    public FaqPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
