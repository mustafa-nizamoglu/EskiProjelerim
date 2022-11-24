package j12_ForLopps.L01_ForLoop.L01_Forlopps.L01_Forlopps.Tasks;

import java.util.Scanner;

public class Task08_Nested {
    public static void main(String[] args) {
        /*
        Task- girilen boyutta kare çarpım tablosu print eden çarpım tablosu create ediniz
        1 2 3 4 5
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("lütfen kare boyutu giriniz");
        int boyut=sc.nextInt();
        for (int j=1;j<=boyut;j++){
            for (int k=1;k<=boyut;k++){
                    System.out.print(j*k+" ");

            }
            System.out.println(" ");
        }

    }
}
