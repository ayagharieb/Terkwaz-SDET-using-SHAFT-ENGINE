package pages;

import com.shaft.cli.FileActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.gui.element.WebDriverElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By choosefile = By.id("file-upload");
    private By Upload = By.xpath("//form/input[@class='button']");
    private By Text = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void FileUploadInput(String path) {
        ElementActions.typeFileLocationForUpload(driver, choosefile, getabsoulutepath(path));

    }

    public void clickUpload() {

        ElementActions.click(driver, Upload);
    }

    public String getabsoulutepath(String path) {
        return FileActions.getAbsolutePath( path);
    }

    public String getUploadedfilename() {
        WebDriverElementActions.waitForElementToBePresent(driver, Text, 5, true);
        return ElementActions.getText(driver, Text);
    }
}