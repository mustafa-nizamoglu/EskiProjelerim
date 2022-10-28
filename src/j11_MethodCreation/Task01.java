package j11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayı1=sc.nextInt();

        System.out.println("2. sayıyı giriniz");
        int sayı2=sc.nextInt();

        System.out.println("esitkontrol(sayı1,sayı2) = " + esitkontrol(sayı1, sayı2));
        System.out.println("esitkontrol(3,5) = " + esitkontrol(3, 5));
        System.out.println("esitkontrol(33,33) = " + esitkontrol(33, 33));
        esitkontrol2(56,67);
        esitkontrol2(61,61);
        esitkontrol2(sayı1,sayı2);


        //girilen iki sayının eşitliğini kontrol eden method create ediniz


    }//main sonu

    public static boolean esitkontrol(int sayı1,int sayı2) {
        boolean esitmi=false;
        if (sayı1==sayı2){
            esitmi=true;

        }else esitmi=false;
        return esitmi;
    }
public static void esitkontrol2(int a,int b){
        if (a==b){
            System.out.println("agam sayılar eşit");
        }else
            System.out.println("agam sayılar eşit değil");



}

}
