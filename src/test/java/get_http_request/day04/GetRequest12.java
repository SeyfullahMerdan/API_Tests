package get_http_request.day04;

import io.restassured.response.Response;
import org.junit.Test;
import utilities.Authentication;

import static io.restassured.RestAssured.given;

public class GetRequest12 extends Authentication {

    // Authentication Class'ın içerisindeki generatToken methodu kullanılacak.

    String endPoint = "http://www.gmibank.com/api/tp-customers";

    @Test
    public void test12(){

        Response response = given()
                .header("Authorization" , "Bearer " + generateToken())
                .when()
                .get(endPoint).then().extract().response();




    }





}
