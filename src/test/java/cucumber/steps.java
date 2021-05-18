package cucumber;

import org.testng.annotations.AfterMethod;
import pages.*;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class steps {

    WebDriver driver;
    ConsultPage consultPage;
    FaqPage faqPage;
    HistoryPage historyPage;
    InsightsPage insightsPage;
    JobPage jobPage;
    MainPage mainPage;
    WebpageFactory webpageFactory;

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }

    @Given("open (.*) page")
    public void openPage(String webpage) {
        webpageFactory = new WebpageFactory();
        driver = webpageFactory.createPage(webpage, driver);
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

    @When("^scroll below the \"FILTER BY\"$")
    public void scrollToFilter(){
        insightsPage = new InsightsPage(driver);
        insightsPage.scrollFilter();
    }

    @Then("^the block \"FILTER BY\" fixed on top of the window$")
    public void isBlockFixed(){
        assert (insightsPage.isFixed());
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
