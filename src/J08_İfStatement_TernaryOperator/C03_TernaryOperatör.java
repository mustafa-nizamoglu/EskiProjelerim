package Benimjava.j01_Veraibles.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperatör {
    public static void main(String[] args) {

        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı=sc.nextInt();
       if (sayı%2==0)
           System.out.println("sayı çift");
       else
           System.out.println("sayı tek");
        String sonuc=(sayı%2==0 ? "çift sayı" : "sayı tek");
        System.out.println("sonuc = " + sonuc);
        System.out.println(sayı%2==0 ? "çift sayı" : "sayı tek");
        /*
        Trick ->> ternary operatör işlem sonucunda true ve folse göre bir çıktı verir
        eğer bu çıktı type göre bir veraibleye yazdırılmazsa doğrudan print edilmeli
         */
        // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.
        System.out.println("Task02");
        System.out.println(sayı<0 ? "sayın negatif" : "sayın negatif değil");


    }
}
