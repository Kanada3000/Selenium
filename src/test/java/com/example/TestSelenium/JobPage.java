package com.example.TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPage {

    @FindBy(xpath = "//input[@id='new_form_job_search_1445745853_copy-keyword']")
    public WebElement keyword;

    @FindBy(xpath = "//div[@class='recruiting-search__location']")
    public WebElement location;

    @FindBy(xpath = "//li[@aria-label='Ukraine']/strong")
    public WebElement country;

    @FindBy(xpath = "//li[@aria-label='Ukraine']/ul/li[text()='Kyiv']")
    public WebElement city;

    @FindBy(xpath = "//button[@class='recruiting-search__submit']")
    public WebElement findButton;

    public JobPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
