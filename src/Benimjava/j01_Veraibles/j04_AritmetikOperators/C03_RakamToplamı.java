package Benimjava.j01_Veraibles.j04_AritmetikOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

        // kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden code create edin
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basan-maklı bir sayı giriniz:  ");
        int ucBasamaklıSayi=scan.nextInt();
        // birler basamagı alma bir sayının ona bölümünden kalan dır
        int birlerBasamagı= ucBasamaklıSayi%10;
        ucBasamaklıSayi/=10; //sayının 10 a bölümünden bölümü verir (85 i verir)
        int OnlarBasamagı=ucBasamaklıSayi%10;  // 85 in 10 bölümünden kalanı verir
        ucBasamaklıSayi/=10;
        int YüzlerBasamagı=ucBasamaklıSayi%10;
        //System.out.println(birlerBasamagı+OnlarBasamagı+YüzlerBasamagı);
        int sayıToplamı=birlerBasamagı+OnlarBasamagı+YüzlerBasamagı;
        System.out.println("sayıToplamı = " + sayıToplamı);
    }
}
