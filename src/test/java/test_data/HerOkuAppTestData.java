package test_data;

import java.util.HashMap;

public class HerOkuAppTestData {

    public HashMap<String, Object> setUpTestData () {

        HashMap<String, Object> bookingDates= new HashMap(); // Map oluşturdum. Nested Map olacak
        bookingDates.put("checkin","2022-02-01");
        bookingDates.put("checkout","2022-02-11");

        HashMap<String, Object> expectedData= new HashMap(); // Ana Map'imi oluşturdum, ana mapimin içerisindeki
        // bilgilerden birisinin altında da ekstradan iki bilgi oldugu için yukarıda bir map daha oluşturdum
        // ve NestedMAp yapısı kurdum.
        // o mapi buradaki key olarak girecegim objenin valuesi olarak girecem.
        expectedData.put("firstname" , "Ali");
        expectedData.put("lastname" , "Can");
        expectedData.put("totalprice" , 500);
        expectedData.put("depositpaid" , true);
        expectedData.put("bookingdates" , bookingDates);

        return expectedData;
    }


}
