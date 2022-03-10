package test_data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DummyTestData {

   // Dinamik bir yapı oluşturdum, içlerindeki sayılar degişince elementlerimi degiştirmiş olacagım
    public HashMap<String, Object> setUpTestData() {

        // 40, 21 ve 19 yaşlarında çalışanlar olup olmadıgını
        List<Integer> yaslar=new ArrayList<>();
        yaslar.add(40);
        yaslar.add(21);
        yaslar.add(19);


        /*
         "id": 10,
        "employee_name": "Sonya Frost",
        "employee_salary": 103600,
        "employee_age": 23,
        "profile_image": ""
         */

        HashMap<String, Object> onuncu=new HashMap<>();
        onuncu.put("id" , 10);
        onuncu.put("employee_name" , "Sonya Frost");
        onuncu.put("employee_salary" , 103600);
        onuncu.put("employee_age" , 23);
        onuncu.put("profile_image" , "");


       /* Status kodun 200 olduğunu,
                14. Çalışan isminin "Haley Kennedy" olduğunu,
                Çalışan sayısının 24 olduğunu,
                Sondan 3. çalışanın maaşının 675000 olduğunu
        40,21 ve 19 yaslarında çalışanlar olup olmadığını
        */

        HashMap<String, Object> expectedData=new HashMap<>();
        expectedData.put("statusCode" , 200 );
        expectedData.put("ondorduncucalisan" , "Haley Kennedy" );
        expectedData.put("calisansayisi" , 24 );
        expectedData.put("sondanucuncucalisaninmaasi" , 675000 );
        expectedData.put("arananyaslar" , yaslar );
        expectedData.put("onuncucalisan" , onuncu );


        return expectedData;
    }



    //{
    //    "name":"Ali Can",
    //    "salary":"2000",
    //    "age":"40"
    //    }



    public HashMap<String , Object> setUpRequestBody() {

        HashMap<String , Object> requestBody=new HashMap<>();
        requestBody.put("name","Ali Can");
        requestBody.put("salary","2000");
        requestBody.put("age","40");

        return requestBody;
    }



    /*
    {
    "status": "success",
    "data": {
    "id":…
},
    "message": "Successfully! Record has been added."
}
     */


    public HashMap<String, Object> setUpExpectedData(){

        HashMap<String , Object> expectedData=new HashMap<>();

        expectedData.put("statusCode", 200);
        expectedData.put("status", "success");
        expectedData.put("message", "Successfully! Record has been added.");

        return expectedData;
    }









}
