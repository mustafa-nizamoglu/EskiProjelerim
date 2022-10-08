package L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Task---> girilen sayı 17 den küçük ise kazandınız büyük ise kaybettiniz print eden code create ediniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz :");
        int sayı=sc.nextInt();
        do{
            System.out.println(sayı+" Kazandınız");

            sayı++;
        }while (sayı<=17);
        System.out.println(sayı+ "kaybettiniz");


    }
}
