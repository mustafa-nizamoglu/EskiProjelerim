package Benimjava.j01_Veraibles.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOparator {
    public static void main(String[] args) {
        /*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen ürün miktarı giriniz");
        int urunmiktar=sc.nextInt();
        System.out.println("Lütfen fiyat giriniz");
        int urunfiyat=sc.nextInt();
      //double Fatura=( urunmiktar>100 ? (urunmiktar*urunfiyat-urunmiktar*urunfiyat*0.33):urunmiktar*urunfiyat);
       // System.out.println("Fatura = " + Fatura);
        if(urunmiktar>100)
            System.out.println((urunfiyat*urunmiktar)-(urunfiyat*urunmiktar*0.33));
        else
            System.out.println(urunfiyat*urunmiktar);









    }
}
