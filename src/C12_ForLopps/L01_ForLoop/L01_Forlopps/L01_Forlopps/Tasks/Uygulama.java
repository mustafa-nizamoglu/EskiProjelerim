package C12_ForLopps.L01_ForLoop.L01_Forlopps.Task;

import java.util.Scanner;

public class Uygulama {
     static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //Task-> girilen sayıdan yüze kadar  4 ün katı olan tamsayıları print eden code ediniz


      // System.out.print("lütfen bir sayı giriniz:");
      // int sayı=sc.nextInt();
      //if(sayı<100) {
      //    for (int i = sayı; i < 100; i++) {
      //        if(i%4==0){
      //        System.out.print(i+" ");}
      //    }


      //}else
      //    System.out.println("lütfen dogru giriş yapınız");
        /*
             Interview Question

                     Girilen  100’den kucuk bir tamsayi için
                     1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
                    - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
                    - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
                  - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz

                */
        System.out.println("lütfen bir sayı giriniz");
        int sayı=sc.nextInt();
        if(sayı<100){
            for(int i=1; i<=sayı;i++){
                if(i%3==0&&i%5==0){
                    System.out.println("JavaCAN");
                } else if (i%3==0) {
                    System.out.println("Java");

                } else if (i%5==0) {
                    System.out.println("CAN'dır");

                }else
                    System.out.println(i);
            }
        }else
            System.out.println("lütfen doğru giriş yapınız");


    }
}
