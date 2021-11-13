package pages;

import com.shaft.api.RestActions;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.python.modules._json._json;

public class APIObjectsPage {
    private RestActions apiObject;
    public static final String Base_Url="https://cat-fact.herokuapp.com/";

    public APIObjectsPage(RestActions apiObject){this.apiObject=apiObject;}

    public Response getcatFacts()
    {
        return apiObject.buildNewRequest("facts", RestActions.RequestType.GET)
                .performRequest();
    }
    public String getRandomNumber() {
        Integer x = (int) ((Math.random() * (5 - 0)) + 0);
        return x.toString();
    }

}
