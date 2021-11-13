package DynamicLoadingTest;

import HerokuappBase.BaseTests;
import com.shaft.validation.Validations;
import org.testng.annotations.Test;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void getTextAfterLoading()
    {
        homepage.ClickDynamicLoadingPage();
        dynamicLoadingPage.ClickDynamicLoadingExample2();
        dynamicLoadingPage.clickStart();
       String Text= dynamicLoadingPage.getLoadedText();
        Validations.assertThat().object(Text).isEqualTo("Hello World!").perform();
    }
}
