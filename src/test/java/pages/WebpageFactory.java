package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageFactory {

    public WebDriver createPage(String webpage, WebDriver driver){
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        switch (webpage){
            case "main":
                driver.get("https://www.epam.com");
                break;
            case "consult":
                driver.get("https://www.epam.com/services/consult-and-design");
                break;
            case "faq":
                driver.get("https://investors.epam.com/investors/faq");
                break;
            case "history":
                driver.get("https://www.epam.com/about/who-we-are/history");
                break;
            case "job":
                driver.get("https://www.epam.com/careers/job-listings");
                break;
            case "insights":
                driver.get("https://www.epam.com/insights");
                break;
        }
        return driver;
    }
}
