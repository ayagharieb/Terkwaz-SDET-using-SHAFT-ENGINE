package pages;

import com.shaft.gui.element.ElementActions;
import com.shaft.gui.element.WebDriverElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));
    private By startButton = By.cssSelector("#start button");
    private By loadedText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public void ClickDynamicLoadingExample2 (){
        ElementActions.click(driver,link_Example2);
    }

    public void clickStart() {
        ElementActions.click(driver,startButton);
       }


    public String getLoadedText(){
        WebDriverElementActions.waitForElementToBePresent(driver,loadedText,5,true);
        return   ElementActions.getText(driver,loadedText);
    }
}
