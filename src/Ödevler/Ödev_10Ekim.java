package Ödevler;

import java.util.Scanner;

public class Ödev_10Ekim {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */


 //     System.out.println("Lütfen sayı giriniz");
 //     int sayiAdedi = 0;
 //     int toplam = 0;
 //     while (toplam <= 333) {
 //         System.out.print("Bir sayı giriniz :");
 //         int sayi = sc.nextInt();
 //         toplam += sayi;
 //         sayiAdedi++;
 //     }
 //     System.out.println("Sayı toplamları = " + toplam + " Sayı adedi = " + sayiAdedi);

         /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
//      System.out.print("Lütfen 1. sayıyı giriniz :");
//      int sayi1=sc.nextInt();
//      System.out.print("Lütfen 2. sayıyı giriniz  :");
//      int sayi2=sc.nextInt();
//      if(sayi1<sayi2) {
//          while (sayi1 <=sayi2) {
//              System.out.print(sayi1 + " ");
//              sayi1++;
//          }
//      }else {
//              for (int i = sayi2; i<=sayi1 ; i++) {
//                  System.out.print(i + " ");
//              }
//      }


        /*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
//       System.out.print("Lütfen bir sayı giriniz :");
//       int carpimTablosu = sc.nextInt();
//       int carpan = 1;
//       while (carpan <= 10) {
//           System.out.println(carpimTablosu + " X " + carpan + " = " + carpimTablosu*carpan + "  ");// ln kullanıldı estetik için
//           carpan++;
//        }

        /*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
//      int sayiAdedi = 1;
//      int sayi = 999;
//      while (sayi >= 100) {
//          if (sayi % 4 == 0 && sayi % 6 == 0) {
//              System.out.print(sayi + " ");
//              sayiAdedi++;
//          }
//          sayi--;
//      }
//      System.out.println("\nSayı Adedi = " + sayiAdedi);

        /*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
//       System.out.print("Lütfen isim  giriniz :");
//       String isim=sc.nextLine();
//       System.out.print("Lütfen Soyisminizi  giriniz :");
//       String soyisim=sc.nextLine();
//       int a = 0 , b=0;
//       while (a<=isim.length()-1) {
//           System.out.print(isim.charAt(a) + " ");
//           a++;
//       }
//       while (b<=soyisim.length()-1) {
//           System.out.print(soyisim.charAt(b) + " ");
//           b++;
//       }


        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
//        Scanner oku = new Scanner(System.in);
//        int count = 1;
//        int MaksSayi = 0;
//        System.out.println("5 adet sayıyı giriniz");
//        while (count <= 5) {
//            int Girilensayılar = sc.nextInt();
//            MaksSayi = Math.max(MaksSayi, Girilensayılar);
//            count ++;
//        }System.out.println("Maksimum sayı = " + MaksSayi);


        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
//       int a=1;
//       System.out.println("Lütfen bir sayı giriniz :");
//       int girilensayi = Math.abs(sc.nextInt());
//       while (a <= girilensayi) {
//           System.out.print(a + " ");
//           a+=2;
//        }


           /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */


//       int countadet = 1;
//       int ToplamSayi = 0;
//       System.out.print("Lütfen bir sayı giriniz = ");
//       int GirilenSayi = sc.nextInt();
//       while (GirilenSayi!= 0) {
//           countadet++;
//           ToplamSayi += GirilenSayi;
//           GirilenSayi = sc.nextInt();
//       }System.out.println("Toplam Sayi = " + ToplamSayi + " \nSayı Adedi = " + countadet);



    }
}
