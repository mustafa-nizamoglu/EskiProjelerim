package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDAteTime {
    public static void main(String[] args) {


    //LocalDAteTime -->>tarih(yıl ay gün)  ve zaman (saat dakika saniye mlsaniye) bilgilerini tutar


    LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);//ldt = 2022-10-25T23:02:33.778930300

        LocalDate d=LocalDate.of(2016,3,13);   //tarih ataması yapıldı
        LocalTime t=LocalTime.of(14,45,38);       //saat ataması yapıldı
        
        
        LocalDateTime trhzmn=LocalDateTime.of(d,t);
        System.out.println("trhzmn = " + trhzmn);      //trhzmn = 2016-03-13T14:45:38


        LocalDateTime ldt1=LocalDateTime.of(2018, Month.MAY,19,20,30);
        System.out.println("ldt1 = " + ldt1);  //ldt1 = 2018-05-19T20:30


        System.out.println("trhzmn.getDayOfMonth() = " + trhzmn.getDayOfMonth());   //trhzmn.getDayOfMonth() = 13
        System.out.println("trhzmn.getDayOfWeek() = " + trhzmn.getDayOfWeek());     //trhzmn.getDayOfWeek() = SUNDAY
        System.out.println("trhzmn.getHour() = " + trhzmn.getHour());               //trhzmn.getHour() = 14


        System.out.println("trhzmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = " + trhzmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72));


    }
}