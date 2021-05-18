package cucumber;

import org.testng.annotations.AfterMethod;
import pages.*;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class steps {
    String path = "./driver/chromedriver.exe";
    WebDriver driver;
    ConsultPage consultPage;
    FaqPage faqPage;
    HistoryPage historyPage;
    InsightsPage insightsPage;
    JobPage jobPage;
    MainPage mainPage;

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }

    @Given("^page https://www.epam.com/$")
    public void MainPage(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.epam.com");
    }

    @When("^hover link Services and click on Optimize$")
    public void hoverServices(){
        mainPage = new MainPage(driver);
        mainPage.clickLink();
    }

    @Then("^get redirected to the Optimize page$")
    public void isRedirectedOptimize(){
        assertEquals("https://www.epam.com/services/optimize", driver.getCurrentUrl());
    }

    @When("^switch location to Ukraine$")
    public void switchLocation(){
        mainPage = new MainPage(driver);
        mainPage.switchLocation();
    }

    @Then("^get redirected to https://careers.epam.ua/$")
    public void isRedirectedCareers(){
        assert (mainPage.isRedirected());
    }

    @Given("^page https://investors.epam.com/investors/faq$")
    public void FaqPage(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://investors.epam.com/investors/faq");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @When("^click \"epam\" logo$")
    public void backToHome(){
        faqPage = new FaqPage(driver);
        faqPage.logoClick();
    }

    @Then("^get redirected to the main page$")
    public void isRedirectedHome(){
        assertEquals("https://www.epam.com/", driver.getCurrentUrl());
    }

    @When("^click on title of question$")
    public void clickTitle(){
        faqPage = new FaqPage(driver);
        faqPage.clickQuestion();
    }

    @Then("^an expanded list of questions and answers should appear$")
    public void questionsList(){
        assert (faqPage.isAnswerDisplay());
    }

    @Given("^page https://www.epam.com/insights$")
    public void InsightsPage(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.epam.com/insights");
    }

    @When("^scroll below the \"FILTER BY\"$")
    public void scrollToFilter(){
        insightsPage = new InsightsPage(driver);
        insightsPage.scrollFilter();
    }

    @Then("^the block \"FILTER BY\" fixed on top of the window$")
    public void isBlockFixed(){
        assert (insightsPage.isFixed());
    }

    @Given("^page https://www.epam.com/services/consult-and-design$")
    public void ConsultPage(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.epam.com/services/consult-and-design");
    }

    @When("^click on crossed out picture with speaker$")
    public void clickSpeaker(){
        consultPage = new ConsultPage(driver);
        consultPage.closeCookies();
        consultPage.clickSpeaker();
    }

    @Then("^this video make sounds$")
    public void isSounds(){
        assert (consultPage.isSounds());
    }

    @Given("^page https://www.epam.com/careers/job-listings$")
    public void JobPage(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.epam.com/careers/job-listings");
    }

    @When("^fill and submit a form$")
    public void fillForm(){
        jobPage = new JobPage(driver);
        jobPage.enterKey("Senior Full Stack Java");
        jobPage.enterLocation();
        jobPage.formSubmit();
    }

    @Then("^get a list of chosen jobs$")
    public void jobList(){
        assert (jobPage.isCorrectJob("Senior Full Stack Java Software Engineer (Angular)"));
    }

    @Given("^page https://www.epam.com/about/who-we-are/history$")
    public void HistoryPage(){
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.epam.com/about/who-we-are/history");
    }

    @When("^click on white dots left from picture$")
    public void clickDots(){
        historyPage = new HistoryPage(driver);
        historyPage.closeCookies();
        historyPage.clickYear();
    }

    @Then("^see history in chosen year$")
    public void isCorrectYear(){
        assert (historyPage.isCorrect());
    }
}
