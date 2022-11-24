package J06_Comparison_Karsılastırma_Operators;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*
        kullanıcıdan üc basamaklı bir sayı alın
        ve sayının sayının birler onlar ve yuzler basamagı olarak yazdırın

        ornek:inputs :853
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basan-maklı bir sayı giriniz:  ");
        int ucBasamaklıSayi=scan.nextInt();
        // birler basamagı alma bir sayının ona bölümünden kalan dır
       int birlerBasamagı= ucBasamaklıSayi%10;
       ucBasamaklıSayi/=10; //sayının 10 a bölümünden bölümü verir (85 i verir)
        int OnlarBasamagı=ucBasamaklıSayi%10;  // 85 in 10 bölümünden kalanı verir
        ucBasamaklıSayi/=10;
        int YüzlerBasamagı=ucBasamaklıSayi%10;
        System.out.println("Girdiginiz sayının birler basmagı:"+birlerBasamagı+"\nGirdiginiz sayının onlar basmagı : "
                +OnlarBasamagı+"\nGirdiginiz sayının yüzler basmagı :"+YüzlerBasamagı);






    }
}
