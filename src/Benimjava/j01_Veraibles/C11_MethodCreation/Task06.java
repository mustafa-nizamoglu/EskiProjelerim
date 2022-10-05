package Benimjava.j01_Veraibles.C11_MethodCreation;


import java.util.Scanner;

public class Task06 {
    /*
 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
 ve iki sayı seçmesini söyleyin.
       Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
*/
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("paralelkenar , kare ve üçgen birini seciniz ");
        String secim=sc.next().toLowerCase();
        System.out.println("1. sayıyı giriniz");
        int sayi1=sc.nextInt();
        System.out.println("2. sayıyı giriniz");
        int sayi2=sc.nextInt();
        secim(secim,sayi1,sayi2);



    }//main sonu
    public static void secim(String str,int sayi1,int sayi2){
        switch (str){
            case "kare":
                sayi2=sayi1;
                kareAlan( sayi1, sayi2);
                kareCevre(sayi1,sayi2);

                break;
            case  "dikdörtgen":
                dikdörtgenAlan(sayi1,sayi2);
                dikdörgenCevre(sayi1,sayi2);
                break;

            case "ücgen":
                sayi2=sayi1;
                ücgenAlan(sayi1);
                ücgenCevre(sayi2,sayi1);


               break;
            default:
                System.out.println("hatalı secim yaptınız");
        }
    }

    private static void ücgenCevre(int sayi1, int sayi2) {
        System.out.println("ücgen cevre :"+(sayi1*3));
    }

    private static void ücgenAlan(int sayi1) {
        System.out.println("ücgenin yüksekligini giriniz :");
        int yksklk=sc.nextInt();
        System.out.println("ücgenin alanı :"+((yksklk*sayi1)/2));


    }

    private static void dikdörgenCevre(int sayi1, int sayi2) {
        System.out.println("Dikdörtgen Cevere :"+(sayi1+sayi2)*2);
    }

    private static void dikdörtgenAlan(int sayi1, int sayi2) {
        System.out.println("Dikdörtgenin Alanı :"+(sayi1*sayi2));

    }

    private static void kareCevre(int sayi1, int sayi2) {
        System.out.println("kare cevre  :"+(sayi1*4));
    }

    private static void kareAlan(int sayi1, int sayi2) {
        System.out.println("kare Alan :"+(sayi1*sayi1));
    }
}
