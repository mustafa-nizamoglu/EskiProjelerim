package j13_Brek_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        // girilen sayının asal olmasını kontrol eden code creat ediniz
        Scanner sc=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz :");
        int sayı=sc.nextInt();
        boolean asalmı=true;
        for(int i=2;i<sayı;i++){
            if(sayı%i==0){
                asalmı=false;
                break;
            }

        }
       if (asalmı){
           System.out.println("girilen sayı ASAL");
       }else System.out.println("girilen sayı ASAL değil");


    }
}
