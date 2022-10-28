package Benimjava.j01_Veraibles.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperatör {
    public static void main(String[] args) {
        // TASK-> girilen bir pozitif tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı=sc.nextInt();
        //System.out.println(sayı>9 ?"girdiğin sayı iki veya daha fazla basmaklı":"sayı iki basaklı değil");
       // String sonuc = sayı>9 ?"girdiğin sayı iki veya daha fazla basmaklı":"sayı iki basaklı değil";
       // System.out.println(sonuc);
       // if(sayı<0){
         //   System.out.println("Lütfen pozitif bir sayı giriniz");}
       // else
       // System.out.println(sayı>9 ?"girdiğin sayı iki veya daha fazla basmaklı":"sayı iki basaklı değil");
        String sonuc = (sayı>=10 || sayı<=-10) ? "Sayi iki veya daha fazla basamakli" :  "Tek basamakli";
        System.out.println(sonuc);
    }
}
