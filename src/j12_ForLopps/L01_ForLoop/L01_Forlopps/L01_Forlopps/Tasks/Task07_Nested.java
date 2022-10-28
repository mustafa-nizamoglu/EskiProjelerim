package j12_ForLopps.L01_ForLoop.L01_Forlopps.L01_Forlopps.Tasks;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {
        /*
        task-> girilen boyuttta bir kare için
        bir sayı giriniz :5
        10000
        01000
        00100
        00010
        00001
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int i=sc.nextInt();
        for (int j=1;j<=i;j++){

           for (int k=1;k<=i;k++){
               if(j==k){
               System.out.print("1 ");
               }else
                   System.out.print("0 ");

        }

            System.out.println("");

    }
}
    }
