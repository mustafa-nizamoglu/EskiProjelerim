package j22_DateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı> Kullanıcıkisiler=new ArrayList<>();             //kullanıcı class dan olusturulacak objelerin tutulacıgı list
      //Task 2. step
    public ArrayList<Kullanıcı> kayıtal(){                               //kullanıcı classtan obj uretmek için const.a gereken name ve
                                                                         // kayıt zamanı bilgilerini oluşturup oluşan abj yı liste ekler
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen Adınızı Giriniz");
        String ad=sc.nextLine();                                        //kullanıcı objesi için name alındı
        Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());            //k1 obj name kullanıcıdan kayıtZamanı alacak
        Kullanıcıkisiler.add(k1);                                       //oluşturulan k1 objesi liste eklendi

        return Kullanıcıkisiler;                                        //kullanıcı kişiler list'i method cıktısı return olarak tanımlandı
    }
    //3. step
    public  void  sanslıKullanıcı(ArrayList<Kullanıcı> kllobj){             //kullanıcı list deki obj lerin kayıtzamanı 10 saniye den
                                                                        // az olup olmamasını göre sanslı kullanıcı return edecek
      for(Kullanıcı k:kllobj){                                          //kullanıcı classtan kayıtal ile  üretilip liste atılan objeler döngüye alındı
          if(k.KayıtZamanı.getSecond()<=10){                            //Döngüye giren her bir obj nın kayıt zamanına bakıldı
              System.out.println(k.name+" Şanslı Kullanıcısınız Bir kangal sucuk kazandınız :) sisteme giriş zamanınız :"+k.KayıtZamanı);
          }else
              System.out.println(k.name+" Şanslı Kullanıcı Değilsiniz  :( sisteme giriş zamanınız :"+k.KayıtZamanı);
      }
    }
    public  void Listele(ArrayList<Kullanıcı> kllobj){
        System.out.println(kllobj); //Obj leri kullanıcı classtaki toString print eder

    }





}
