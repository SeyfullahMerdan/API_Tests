package get_http_request;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {

    @Test
    public void test01(){

        String url= "https://restful-booker.herokuapp.com/booking";

        Response response = given().when().get(url); // url deki bilgileri getirdim ve bir konteynıra atadım.
        // bu şekilde yazdırarak terminalimde görebilirim. Atama yaparak bilgileri bir variablea almış oluyorum.

        response.prettyPrint();  // atadıgım variablei prettyPrint ile yazdırdım.

        // statusCode her zaman 200 olması lazım. Database ile iletişim sıkıntısız ve sorunsuz olarak
        // API sorunsuz çalışıyor demektir.
        System.out.println("Status Code: "+   response.statusCode());  // integer olarak döner.
        System.out.println("Content Type: "+  response.contentType());
        System.out.println("Status Line: " + response.statusLine());
        System.out.println("Test Zamanı: " +  response.time());

        Assert.assertEquals(200,response.statusCode()); // integer olarak geldigi için iki degerde int. olmalı.
        Assert.assertEquals("application/json; charset=utf-8",response.contentType());
        Assert.assertEquals("HTTP/1.1 200 OK",response.statusLine());


        response.
                then().
                assertThat().
                statusCode(200).
                contentType("application/json; charset=utf-8").
                statusLine("HTTP/1.1 200 OK");




    }


}
