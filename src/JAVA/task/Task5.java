package task;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /*
        task ----> girilen bilgilerin ilk harflerini buyuk harf eden code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Adınızı giriniz :");
        String ad=sc.nextLine();



        System.out.println("Soyadınızı giriniz");
        String soyad=sc.nextLine();

        System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1));
        System.out.println(soyad.substring(0,1).toUpperCase()+soyad.substring(1));







    }
}
