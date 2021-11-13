package FileUploadTest;

import HerokuappBase.BaseTests;
import org.testng.annotations.Test;


public class fileUploadTests extends BaseTests {

    @Test
    public void uploadFile()
    {
        homepage.ClickFileUploadPage();
        fileUploadPage.FileUploadInput("src\\main\\resources\\10440964_1613974605524418_5426798511651274387_n.jpg");
        fileUploadPage.clickUpload();
        fileUploadPage.getUploadedfilename();
    }
}
