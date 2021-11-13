package searchTest;

import HerokuappBase.BaseTests;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Validations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.searchPage;

public class searchTests {
    private WebDriver driver;
    protected searchPage SearchPage;


    @BeforeClass
    public void setup() {
        driver = DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver, "https://www.google.com/ncr");
        SearchPage = new searchPage(driver);
    }

    @Test
    public void searchGoogle() {
        SearchPage.searchforitems("selenium webdriver");
        Validations.verifyThat()
                .element(driver, SearchPage.GetThirdElement())
                .exists().withCustomReportMessage("third result text contains 'What is Selenium WebDriver?'")
                .perform();
    }

    @AfterClass
    public void TearsDown() {
        driver.quit();
    }
}