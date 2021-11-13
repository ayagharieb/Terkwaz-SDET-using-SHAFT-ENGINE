package pages;

import com.shaft.gui.element.ElementActions;
import com.shaft.gui.element.WebDriverElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class searchPage {
    private WebDriver driver;
    private By searchinput=By.xpath("//input[@name='q']");
    private By result=By.xpath("//a//h3[contains(text(),'What is Selenium Web Driver?')]");

    public searchPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void searchforitems(String Text)
    {
         new ElementActions(driver)
                 .type( searchinput, Text)
                 .keyPress(searchinput, Keys.ENTER);
    }

    public By GetThirdElement()
    {
        return result;
    }
}
