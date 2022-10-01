package Benimjava.j01_Veraibles.J09_SwitchStatement;

import java.util.Scanner;

public class C01_SwichCase {
    public static void main(String[] args) {
       /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */
       Scanner sc = new Scanner(System.in);
       System.out.print("lütfen bir rakam giriniz     :");
       int rakam = sc.nextInt();
       if (rakam == 0) {
           System.out.println("girilen rakam sıfır");
       } else if (rakam == 1) {
           System.out.println("girilen rakam bir");
       } else if (rakam == 2) {
           System.out.println("girilen rakam iki");
       } else if (rakam == 3) {
           System.out.println("girilen rakam üç");
       } else if (rakam == 4) {
           System.out.println("girilen rakam dört");
       } else if (rakam == 5) {
           System.out.println("girilen rakam beş");
       } else if (rakam == 6) {
           System.out.println("girilen rakam altı");
       } else if (rakam == 7) {
           System.out.println("girilen rakam yedi");
       } else if (rakam == 8) {
           System.out.println("girilen rakam sekiz");
       } else if (rakam == 9) {
           System.out.println("girilen rakam dokuz");
       } else
           System.out.println("lütfen rakam giriniz");


        System.out.println("******* switch case******");

        switch (rakam) {
            case 0:
                System.out.println("girilen rakam sıfır");
                break;
            case 1:
                System.out.println("girilen rakan bir");
                break;
            case 2:
                System.out.println("girilen rakam iki");
                break;
            case 3:
                System.out.println("girilen rakam üç");
                break;
            case 4:
                System.out.println("girilen rakam beş");
            case 6:
                System.out.println("girilen rakam altı");
                break;
            case 7:
                System.out.println("girilen rakam yedi");
                break;
            case 8:
                System.out.println("girilen rakam sekiz");
                break;
            case 9:
                System.out.println("girilen rakam dokuz");
                break;
            default:
                System.out.println("lütfen rakam giriniz");
        }
    }
}


