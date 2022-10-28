package J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class ödev01 {
    public static void main(String[] args) {
         /*
        TASK :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */
        {Scanner dat = new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz=  ");
        int yas = dat.nextInt();
        System.out.println("Lütfen Kilonuzu giriniz= ");
        int kilo = dat.nextInt();
        if (yas<18){
            System.out.println("Kan bagısı yapamaz!");}
        else if (yas>=18 && kilo<50){
            System.out.println("Kan bagısı yapamaz!");}
        else System.out.println("Kan bagısı yapabilir!");}

        /*
         * TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

            Scanner dat = new Scanner(System.in);
            System.out.println("müşteri kartınız var mı ? (E/H)= ");
            char k = dat.nextLine().charAt(0);
            System.out.println("kaç adet ürün aldınız=  ");
            int u= dat.nextInt();
            System.out.println("fiyat?= ");
            int f= dat.nextInt();
            double f1= ((u*f)*0.20);
            double f2= ((u*f)*0.15);
            double f3= ((u*f)*0.10);
            int subtotal= (u*f);
            if (k=='E' || k=='e'){
                if (u>10){
                    System.out.println("tutar= "+ (subtotal-f1));
                }else System.out.println("tutar= "+ (subtotal-f2));
            }
            if (k=='H' || k=='h'){
                if (u>10){
                    System.out.println("tutar= "+ (subtotal-f2));
                }else System.out.println("tutar= "+ (subtotal-f3));
            }

            /*   TASK :
            45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.
            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */
        double a = 45;
        if (a % 5 == 0 & a % 8 == 0) {
            System.out.println("able to divide by 5 and 8");
        } else if (a % 10 == 5 & a % 9 == 0) {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }
    }
}





