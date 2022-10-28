package j12_ForLopps.L01_ForLoop.L01_Forlopps.L01_Forlopps.Tasks;

import java.util.Scanner;

public class Task09_Nested {
    public static void main(String[] args) {
         /*
        task->> girilen boyutta aşagıdaki şekli print eden codecreate ediniz
        örnek ekran cıkrısı
        *
        * *
        * * *
        * * * *

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("kare boyut giriniz  :");
        int boyut = sc.nextInt();
        for (int i=1; i<=boyut;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
