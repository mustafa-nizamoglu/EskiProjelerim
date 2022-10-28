package codechallange;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
      //  _ForLoop
/*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=4
  Kareler toplamı=14
   */
        Scanner sc=new Scanner(System.in);
        System.out.print("lütfen 1 dden büyük bir sayı giriniz :");
        int sayi=sc.nextInt();
        int karetoplam=0;

        for (int i=0; i<sayi; i++){
            karetoplam+=i*i;

        }
        System.out.println("kare toplam :"+karetoplam);



    }
}
