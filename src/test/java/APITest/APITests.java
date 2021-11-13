package APITest;

import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;

import com.shaft.validation.Validations;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.APIObjectsPage;

import static io.restassured.RestAssured.given;


public class APITests {
    private RestActions baseurl;
    private APIObjectsPage apiObjectsPage;

    @BeforeClass
    public void Setup()
    {
        baseurl= DriverFactory.getAPIDriver(APIObjectsPage.Base_Url);
        apiObjectsPage=new APIObjectsPage(baseurl);
   }


   @Test
    public void TestRandomCatFacts()
   {
       Response res= apiObjectsPage.getcatFacts();
       String RandomNo = apiObjectsPage.getRandomNumber();
       String Text = RestActions.getResponseJSONValue(res, "text[" + RandomNo + "]");
       Validations.assertThat().object(Text).isNotNull().perform();
      System.out.println("Random No Choosen is:" + RandomNo +" And the Text is: \n"+Text);

   }

}



