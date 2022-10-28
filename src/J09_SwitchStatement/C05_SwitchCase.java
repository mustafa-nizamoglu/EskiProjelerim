package J09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
                */
   //int bakiye = 1000;
   //System.out.println("Bakiyeniz :" + bakiye);
   //Scanner sc = new Scanner(System.in);
   //System.out.print("para yatirmak icin 2 ye basın: "+"\nPara cekmek icin 1 ye basin: ");
   //int sayi = sc.nextInt();
   //switch (sayi) {
   //    case 1:
   //        System.out.println("Cekeceginiz para miktarini giriniz : ");
   //        int cekilen_Miktar = sc.nextInt();
   //        System.out.println("Güncel hesap bakiyeniz = " + (bakiye - cekilen_Miktar));
   //        break;
   //    case 2:
   //        System.out.println("Yatiracaginiz para miktarini girin : ");
   //        int yatirilan_Miktar = sc.nextInt();
   //        System.out.println(" Güncel bakiyeniz = " + (bakiye + yatirilan_Miktar));
   //        break;
   //    default:
   //        System.out.println(" Lütfen doğru giriş yapınız");

   //}


        Scanner sc = new Scanner(System.in);
        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");

        System.out.println("Bakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        int seçim = sc.nextInt();int  bakiye=1000;

        switch (seçim) {

            case 1:
                System.out.println("agam bakıyen :" + bakiye);

                break;
            case 2:
                System.out.print("agam ne hadar yatıcaksın :");
                int yatırılanMiktar = sc.nextInt();
                bakiye += yatırılanMiktar;
                System.out.println("agam bakıyenin güncalhali :" + bakiye);

                break;
            case 3:
                System.out.println("agam ne kadar cekecen : ");
                int cekilenMiktar = sc.nextInt();
                if (cekilenMiktar > bakiye) {
                    System.out.println("agam niddin olmayan parayımı cekecen :(");
                    System.out.println("ahan da bakıyen  " + bakiye);
                } else {
                    bakiye -= cekilenMiktar;
                    System.out.println("agam bakıyenin güncalhali :" + bakiye);
                }
          break;
            case 4:
                System.out.println("agam  çıkışın yapıldı selametle");
                break;
            default:
                System.out.println("hatalı şecim girdiniz tekrar deneyiniz");


        }

    }
}



