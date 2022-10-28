package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.ZoneId.of;

public class C05_ZonedDateTime {
    public static void main(String[] args) {
        //herhangi bir ulke sehir ->local tarih ve zaman bilgisi tutar
        LocalDate trhZone=LocalDate.now(of("America/New_York"));  //America-new york local inin tarih bilgis tanımlandı
        LocalDate trhZone1=LocalDate.now(of("Japan"));  //Japonya  local inin tarih bilgis tanımlandı

        System.out.println("trhZone = " + trhZone);      //trhZone = 2022-10-26
        System.out.println("trhZone1 = " + trhZone1);    //trhZone1 = 2022-10-27

        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));
        //  ZonedDateTime zdt3=ZonedDateTime.now(ZoneId.of("America"));//RTE-> yerel saat dilimi de tanımlanmalı
        ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("Japan"));

        System.out.println("zdt1 = " + zdt1);     //zdt1 = 2022-10-26T13:50:33.705823300-04:00[America/New_York]
        System.out.println("zdt2 = " + zdt2);
        // System.out.println("zdt3 = " + zdt3);  //zdt2 = 2022-10-27T02:50:33.705823300+09:00[Japan]



        
        
        
        
        
        
        
        
    }
}
