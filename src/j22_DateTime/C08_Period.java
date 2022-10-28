package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {
          //Period->> iki tarih arasında gecen tekrarlanabilen zamanı tutar

        LocalDate bugün=LocalDate.now();
        LocalDate hmndgm=LocalDate.of(1984,7,17);

        Period fark=Period.between(hmndgm,bugün);
        System.out.println("fark = " + fark);         //fark = P-38Y-3M-9D

        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());  //fark.toTotalMonths() = 459   fark datasının ay cinsinden degeri

        System.out.println("fark.getDays() = " + fark.getDays());  //fark.getDays() = 9  fark datasının gün bilgisi

        System.out.println("fark.getChronology() = " + fark.getChronology());

        System.out.println("***** ");
        System.out.println("bugün = " + bugün);           //bugün = 2022-10-26

        Period period5Gün=Period.ofDays(5);               // 5 günde bir tekrarlanan period
        Period period7Ay=Period.ofMonths(7);              //7 ayda bir tekraralan period
        //Period periodX=Period.ofMonths(7).ofDays(21);     //
        Period periodX=Period.ofMonths(7).ofDays(21);     //
        
        //Trick--> period tanımlamada birden cok zaman parametresi tanımlanırsa son parametre çalısır

        bugün=bugün.plus(period5Gün);            //bugüne 5 günlük periyot eklendi

        System.out.println("bugün = " + bugün);   //bugün = 2022-10-31

        bugün=bugün.minus(period7Ay);            //bugüne 7 aylık periyot geri gidildi

        System.out.println("bugün = " + bugün);   //bugün = 2022-03-31

        bugün=bugün.plus(periodX);
        System.out.println("bugün = " + bugün);    //bugün = 2022-04-21
        
        
        //Task- >> 5.9.2022 baslayan kurs 9 ay olduguna göre bitiş tarihini print eden code create ediniz
        
        LocalDate baslangıç=LocalDate.of(2022,9,5);
        Period kurs=Period.ofMonths(9);
        LocalDate KursBitiş=baslangıç.plus(kurs);
        System.out.println("Bitiş = " + KursBitiş);  //Bitiş = 2023-06-05






    }
}
