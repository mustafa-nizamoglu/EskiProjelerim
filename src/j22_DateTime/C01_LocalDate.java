package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {


    public static void main(String[] args) {
        //Localdate ->sadece yıl ay gün degeri tutar
        LocalDate bugun=LocalDate.now();   //sistemden bugunun yıl ay gun degerini atama yapar

        System.out.println("bugun = " + bugun); //bugun = 2022-10-25
        System.out.println("bugun.getYear() = " + bugun.getYear());              //bugun.getYear() = 2022
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());  //bugun.getMonthValue() = 10
        System.out.println("bugun.getMonth() = " + bugun.getMonth());            //bugun.getMonth() = OCTOBER
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());    //bugun.getDayOfYear() = 298
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());    //bugun.getDayOfWeek() = TUESDAY
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());  //bugun.getDayOfMonth() = 25



        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1923, Month.OCTOBER,29);


        //verilen bir tarihin öncesi ve sonrasına gitme   minus()->önce tarih    plus()->>sonra tarih

        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));        //date1.plusDays(12) = 1923-11-10
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));    //date2.plusMonths(3) = 1924-01-29
        System.out.println("bugun.plusWeeks(6) = " + bugun.plusWeeks(6));        //bugun.plusWeeks(6) = 2022-12-06
        System.out.println("bugun.minusMonths(5) = " + bugun.minusMonths(5)); //bugun.minusMonths(5) = 2022-05-25
        System.out.println("bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2)); //bugun.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = 2020-10-28


    }
}
