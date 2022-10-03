package Benimjava.j01_Veraibles.C11_MethodCreation;

import java.util.Scanner;

public class Task04 {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */
 // static Scanner sc=new Scanner(System.in);
 // static int bakiye=1000;

    public static void main(String[] args) {
        System.out.println("    ***   " );
        System.out.println("MÖNÜ  :) \n  ***  ATM ye hoş geldiniz   ***"); System.out.println("Bakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        Task04AtmMethod.secim();





    }// main dışı
 //private static void secim (){
 //    System.out.println("agam yapacagın işlemi seç");
 //    int secim=sc.nextInt();
 //    switch (secim){
 //        case 1:
 //            bakiye();

 //            break;
 //        case 2:
 //            paraYatrir();

 //            break;
 //        case 3:
 //            paraÇek();

 //            break;
 //        case 4:
 //            cıkısYap();

 //            break;
 //        default:
 //            System.out.println("agam daha secim yapamirsen di de para istirsen");

 //    }

 //}

 //private static void bakiye() {
 //}

 //private static void cıkısYap() {
 //    System.out.println("agam yine bekleriz cıkısın yapılmıstır selametle güzel insan :)");
 //}

 //private static void paraÇek() {
 //    System.out.println("agam nekadar para cekeceksin");
 //    int cekilecekMiktar=sc.nextInt();
 //    if (cekilecekMiktar<=bakiye){
 //        bakiye-=cekilecekMiktar;
 //        System.out.println("agam para cebinde gözün aydın :)");
 //        System.out.println("agam yeni bakiyen :"+bakiye);

 //    }else
 //        System.out.println("agam nettin olmayan parayı mı istiyorsun  :( ");
 //    karar();
 //}

 //private static void paraYatrir() {
 //    System.out.println("agam elin tutulmaz yatırcenmi :");
 //    int yatırılacakMiktar=sc.nextInt();

 //    bakiye+=yatırılacakMiktar;
 //    System.out.println("agam para hesabında ahan da yeni bakiyen :"+bakiye);
 //    karar();
 //}

 //private static void bakiyeVer() {
 //    System.out.println("agam bakiyen :"+bakiye);
 //    karar();
 //}
 //public static void karar(){
 //    System.out.println("agam işleme \ndevam ise 1\nyeter ->0");
 //    int karar=sc.nextInt();
 //    if (karar==1){
 //       secim();
 //    }else if (karar==0) {
 //        cıkısYap();

 //    }else
 //    secim();


}