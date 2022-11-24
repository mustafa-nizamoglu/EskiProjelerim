package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate Falangün=bugun.minusDays(24);
        LocalDate fesmakangün=bugun.plusDays(3);

        System.out.println("bugun = " + bugun);                // bugun = 2022-10-26
        System.out.println("Falangün = " + Falangün);          // Falangün = 2022-10-24
        System.out.println("fesmakanlangün = " + fesmakangün); // fesmakanlangün = 2022-10-29

         //Trick-->>
        System.out.println("bugun.isBefore(Falangün) = " + bugun.isBefore(Falangün));               //bugun.isBefore(Falangün) = false
        System.out.println("bugun.isBefore(fesmakangün) = " + bugun.isBefore(fesmakangün));         //bugun.isBefore(fesmakangün) = true
        System.out.println("Falangün.isBefore(fesmakangün) = " + Falangün.isBefore(fesmakangün));   //Falangün.isBefore(fesmakangün) = true


        System.out.println("bugun.isAfter(fesmakangün) = " + bugun.isAfter(fesmakangün));           //bugun.isAfter(fesmakangün) = false
        System.out.println("bugun.isAfter(Falangün) = " + bugun.isAfter(Falangün));                 //bugun.isAfter(Falangün) = true


        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());                           //bugun.isLeapYear() = false



        int fark=bugun.compareTo(Falangün);
        System.out.println("fark = " + fark);   //fark = 24

        int fark1=Falangün.compareTo(fesmakangün);
        System.out.println("fark1 = " + fark1);    //fark1 = -27

        int fark2=fesmakangün.compareTo(Falangün);
        System.out.println("fark2 = " + fark2);     //fark2 = 27






        /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için
          */



    }
}
