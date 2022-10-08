package L01_Forlopps;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        //Task-> girilen sayıdan yüze kadar  4 ün katı olan tamsayıları print eden code edini

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
         int sayı=sc.nextInt();

        if (sayı>100){
            System.out.println("lütfen 100 den küçük sayı giriniz");

        } else   {
            for (int i=sayı;i<100;i++){
                if(i%4==0){
                    System.out.print(i+" ");
                }
            }

        }
    }
}
