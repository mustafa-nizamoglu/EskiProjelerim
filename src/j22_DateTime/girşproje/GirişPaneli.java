package j22_DateTime.girşproje;

import java.util.ArrayList;
import java.util.Scanner;

public class GirişPaneli {

    //public static void giris(){ //
        public  void giris(){    //
        Scanner sc=new Scanner(System.in);

        Kayıt yeniKayıt=new Kayıt();                                  //kayıt class a erişim içim parametresiz cons ile YeniKayıt obj üretildi
        //kayıt classtan obj olmadan method call edebilmek için methodlar static yapılırsa
        ArrayList<Kullanıcı> kişi=new ArrayList<>();                        //kullanıcı classtan üretilen obj tutulacağı bos list

        boolean cıkılsınmı=true;                                      //while döngü için sart tanımlandı

        while (cıkılsınmı){
            System.out.println("Ne istiyorsunuz \n1->Kayıt \n2->Sanslı Kişi bul \n3->Listele \n4->Çıkış \nSeçiminizi yapınız");
            int tercih=sc.nextInt();
            switch (tercih){
                case 1:
                    kişi=yeniKayıt.kayıtal();                              //kayıt classtan kayıtal obj method call edildi
                    break;
                case 2:
                    yeniKayıt.sanslıKullanıcı(kişi);
                    break;
                case 3:
                    yeniKayıt.Listele(kişi);
                    break;
                case 4:
                    cıkılsınmı=false;
                    break;
                default:
                    System.out.println("Lütfen doğru giriş yapınız  :(");
            }

        }













    }}
