package j10_StringManipulation;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da
         * metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
         */
        String str="javaCAN'lara selam olsun java ile bolcana offer ";
        System.out.println(str.replace('a','@'));  //j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer
        System.out.println(str.replace("can","kan")); // javaCAN'lara selam olsun java ile bolkana offer

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println(str.replaceFirst("a","@")); // j@vaCAN'lara selam olsun java ile bolcana offer


      // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
      //1-replace() methodu char kabul eder ama replaceAll kabul etmez
      //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str="    JavaCAN'lara selam olsun :) java ile 12345554 ***   ";
        System.out.println(str.replaceAll("\\s","+"));   //++++JavaCAN'lara+selam+olsun+:)+java+ile+12345554+***+++

        System.out.println(str.replaceAll("\\S","+"));   // ++++++++++++ +++++ +++++ ++ ++++ +++ ++++++++ +++

        System.out.println(str.replaceAll("\\w","+"));   //+++++++'++++ +++++ +++++ :) ++++ +++ ++++++++ ***

        System.out.println(str.replaceAll("\\W","+"));   //++++JavaCAN+lara+selam+olsun++++java+ile+12345554+++++++

        System.out.println(str.replaceAll("\\d","+"));   //JavaCAN'lara selam olsun :) java ile ++++++++ ***

        System.out.println(str.replaceAll("\\D","+"));    //+++++++++++++++++++++++++++++++++++++++++12345554+++++++

 //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
 // isim-soyisim : M***** B*******
 // kart no : **** **** **** 1234
        String isim="Mustafa ";
        String soyisim="Nizamoglu";
        String kartno="1234567890123456";
        String yeniAd=isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yeniSoyisim=soyisim.charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
        String yeniKArt="**** **** **** ****"+kartno.substring(12);
        System.out.println("isim-soyisim: "+yeniAd+yeniSoyisim+" kartno: "+yeniKArt);  //isim-soyisim: M******N******** kartno: **** **** **** ****3456




























    }
}
