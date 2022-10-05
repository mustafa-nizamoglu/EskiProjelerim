package L01_Forlopps.Task;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
         //Task-> /*
        //       Interview Question
        //
        //               Girilen  100’den kucuk bir tamsayi için
        //               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
        //              - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
        //              - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
        //              - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz
        //
        //*/
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı=sc.nextInt();
        if(sayı>=100) {
            System.out.println(sayı+ "lütfen 100 den küçük bir sayı giriniz");
        }else {
            for (int i=1; i<sayı;i++){
                if(i%3==0&& i%5==0){
                    System.out.println(i+ "JavaCAN");
                } else if (i%3==0) {
                    System.out.println(i+ "Java");

                } else if (i%5==0) {
                    System.out.println(i+ "CAN'dır");

                }else System.out.println(i+ "hiçbir şartı saglamadı");

            }
        }
    }
}
