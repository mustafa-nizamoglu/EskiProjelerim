package j10_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        charAt() methodu parametre int olarak girilen index deki char değerini return eder.
        index değeri 0 dan başlar
         */

        String sehir="İstanbul";
        System.out.println("sehir.charAt(5)"+sehir.charAt(5));
        char besinciİndexKrktr=sehir.charAt(5);
        System.out.println(besinciİndexKrktr);

        //son index nasıl bulunur ----->>length

        System.out.println(sehir.charAt(sehir.length() - 1)); // l

        //ilk index nasıl buluur

        System.out.println(sehir.charAt(0));


        //sehir.charAt(18);  //rte verir
        // trick ->> charAt() index boyutunu geçertse rte verir
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime=sc.nextLine();
        if(kelime.length()%2!=0) {
            System.out.println(kelime.charAt((kelime.length() -1) / 2));
        }else
            System.out.println("Girilen sayının orta karakteri yoktur");

        }


    }

