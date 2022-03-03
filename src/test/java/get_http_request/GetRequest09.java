package get_http_request;

import base_url.DummyBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest09 extends DummyBaseUrl {

    /*
  http://dummy.restapiexample.com/api/v1/employee/12 URL'E GiT.
  1) Matcher CLASS ile
  2) JsonPath ile dogrulayin.
 */

    @Test
    public void test08(){

        spec02.pathParams("birinci", "api", "ikinci", "v1", "ucuncu", "employees", "dorduncu", "12");

        Response response = given().spec(spec02).when().get("/{first}/{second}/{third}/{dorduncu}");














    }



}
