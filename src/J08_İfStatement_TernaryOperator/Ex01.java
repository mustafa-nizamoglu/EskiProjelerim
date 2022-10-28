package Benimjava.j01_Veraibles.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
          /*
        Task->> girilen girilen sayının negatiflik pozitifliğini kontrol ediniz

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = scan.nextInt();
        if (sayı > 0) {                         // sayının sıfırdan büyük olması durumu sarta baglandı
            System.out.println("girilen sayı pozitif");
        } else if (sayı < 0) {                //sayının sıfırdan küçük olması durumu sarta bağlandı
            System.out.println("girilen sayı nagatif");


        } else                               //sayının sıfıra esit olması sarta baglandı
            System.out.println("girilen sayı sıfır");
    }
}
