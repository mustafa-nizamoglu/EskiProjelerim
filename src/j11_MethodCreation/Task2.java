package Benimjava.j01_Veraibles.C11_MethodCreation;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //girilen ad ve soy adın ilk harflari büyük diğerleri küçük yapan method create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String ad = sc.nextLine();

        System.out.println("soyadınızı giriniz");
        String soyad = sc.nextLine();
        buyukYapmak(ad, soyad);


    }//main sonu

    private static void buyukYapmak(String ad, String soyad) {
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
        System.out.println("ad soyad = " + ad + " " + soyad);

    }

    private static String isimSoyisimHarfKontrol2(String ad, String soyad) {//return typle method

        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();

        return ad + " " + soyad;


    }
}


