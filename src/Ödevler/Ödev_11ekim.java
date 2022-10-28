package Ödevler;

import java.util.Scanner;

public class Ödev_11ekim {
    static int üst = 0;

    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Lütfen bir sayı giriniz :");
//       int i = sc.nextInt();
//       System.out.println(powersofTwo(i) ? i + " -> 2 nin " + üst + ". Kuvvetidir" : i + " 2 nin kuvveti değildir.");
//   }
//   public static boolean powersofTwo(int i) {
//       boolean result;
//       if (i % 2 == 0) {
//           while (i % 2 == 0) {
//               i /= 2;
//               üst++;
//           }
//           if (i == 1) result = true;
//           else result = false;
//       } else result = false;
//       return result;

        // tas >makas
        // makas >kagit
        //kagit >tas

//      int numberOfFirstWin=0;
//      int numberOfSecondWin=0;
//      int numberOfComWin =0;
//      int gameOver=3;


    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        System.out.println("Lütfen \ntas icin 1'i seciniz \nmakas icin 2'yi seciniz  \nkagıt icin 3'ü seciniz");
        System.out.print("birinci kişi için secim yapınız :");
        int secım1 = scanner.nextInt();
        System.out.print("ikinci kşi için secim yapınız :");
        int secımB1 = scanner.nextInt();
        if (1 == secım1 && 1 != secımB1) {
            System.out.println("birinci kişi kazandı ");
        } else if (1 == secımB1 && 1 != secım1) {
            System.out.println("ikinci kişi kazandı  ");
        } else if (2 == secım1 && 2 != secımB1) System.out.println("birinci kişi kazandı");
        else if (2 == secımB1 && 2 != secım1) {
            System.out.println("ikinci kişi kazandı");
        } else System.out.println("berabere ");

    }







         /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */



    }
}