package get_http_request.day10;

import base_url.HerOkuAppBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import test_data.HerOkuAppTestData;

import static io.restassured.RestAssured.given;

public class PostRequest01 extends HerOkuAppBaseUrl {
     /*
https://restful-booker.herokuapp.com/booking/47
       {
           "firstname": "Ali",
           "lastname": "Can",
           "totalprice": 500,
           "depositpaid": true,
           "bookingdates": {
               "checkin": "2022-02-01",
               "checkout": "2022-02-11"
          }
       }
1) JsonPhat
2) De-Serialization
*/

    @Test
    public void test01() {

        // 1) URL Oluştur

        spec05.pathParam("parametre1" , "booking");

        // Expected Data

        HerOkuAppTestData testData = new HerOkuAppTestData();
        JSONObject expectedRequestData=testData.setUpTestAndRequestData();
        System.out.println("expectedRequestData = " + expectedRequestData);
        
        // REQUEST VE RESPONSE

        Response response = given()
                .contentType(ContentType.JSON)
                .auth()
                .basic("admin","password123")
                .spec(spec05)
                .body(expectedRequestData.toString())
                .when()
                .post("/{parametre1}");

        response.prettyPrint();








    }


}
