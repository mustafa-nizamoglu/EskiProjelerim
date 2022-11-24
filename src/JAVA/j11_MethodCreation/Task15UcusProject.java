package j11_MethodCreation;

import java.util.Scanner;

public class Task15UcusProject {
    /*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("javaAirlines'e hos geldini :) \n B C D rotalarından Birini seciniz");
        String rota=sc.next().toUpperCase();
        System.out.println("Lütfen yünü icin \ntek yon ->1\ncift yön ->2 seciniz");
        int ucusYonü=sc.nextInt();
        System.out.println("lütfen yasınızı giriniz");
        int yas=sc.nextInt();

        double fiyatB=500*0.10 ;//A dan B ye ucus fiyatı
        double fiyatC=700*0.10 ;//A dan B ye ucus fiyatı
        double fiyatD=900*0.10 ;//A dan B ye ucus fiyatı

        if(rota.equals("B")||rota.equals("C")||rota.equals("D")){  //rota kontrolü
            if(yas>65){   //yas kontrolü
                if (rota.equals("B")) { //rota b
                    if(ucusYonü==1){    //cift yönü
                        System.out.println("   *****   ");
                        System.out.println("65 yas üstü B sehrine Cift yön ucus toplam fiyati  :"+(fiyatB*0.7*0.8)+"$");

                    } else if (ucusYonü==0) {
                        System.out.println("   *****   ");
                        System.out.println("65 yas üstü B sehrine Tekyön yön ucus toplam fiyati   :"+(fiyatB*0.7)+"$");

                    }else
                        System.out.println("hatalı giriş yaptınız");
                } else if (rota.equals("c")) {

                } else if (rota.equals("D")) {

                }else
                    System.out.println("hatalı giris yaptınız");
            }
            else if (yas<24&& yas>12) {

            }
            else if (yas<12) {

            }
            else
                System.out.println("İndirimsiz ucus");


        }else
            System.out.println("yanlıs secim yaptınız ");


    }//maine dışı
}
