package L01_Forlopps.Task;

import java.util.Scanner;

public class tasak07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen kare için boyut giriniz");
        int boyut = sc.nextInt();
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= boyut; j++) {
                if (i == j) {
                    System.out.println("1 ");
                } else System.out.println("0 ");


            }
            System.out.println();

        }
         /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1

            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */



        System.out.println("kare için boyut giriniz : ");
        //int boyut=sc.nextInt();

        for (int i = 1; i <=boyut ; i++) {//apt döngü
            for (int j = 1; j <=boyut ; j++) {//daire döngü

                if (i==j){
                    System.out.print("1  ");
                }else System.out.print("0  ");

            }
            System.out.println();
        }

    }
}