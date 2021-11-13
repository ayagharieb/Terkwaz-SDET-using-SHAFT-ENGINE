package HerokuappBase;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.DynamicLoadingPage;
import pages.FileUploadPage;
import pages.HomePage;
import pages.searchPage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homepage;
    protected FileUploadPage fileUploadPage;
    protected DynamicLoadingPage dynamicLoadingPage;

    @BeforeClass
    public void setup() {
        driver= DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver,"https://the-internet.herokuapp.com/");
        homepage=new HomePage(driver);
        fileUploadPage=new FileUploadPage(driver);
        dynamicLoadingPage=new DynamicLoadingPage(driver);
    }

    @AfterClass
    public void TearsDown()
    {
        driver.quit();
    }

}
