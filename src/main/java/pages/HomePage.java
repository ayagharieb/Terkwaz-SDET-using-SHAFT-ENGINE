package pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private  WebDriver driver;

    public  HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void ClickFileUploadPage()
    {
        clicklink("File Upload");
    }
    public void ClickDynamicLoadingPage()
    {
        clicklink("Dynamic Loading");
    }
    private void clicklink(String linkText)
    {
        ElementActions.click(driver,By.linkText(linkText));

    }
}
