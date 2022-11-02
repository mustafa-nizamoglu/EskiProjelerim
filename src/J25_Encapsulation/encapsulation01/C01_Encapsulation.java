package J25_Encapsulation;

import J25_Encapsulation.encap.C02_Encapsulution;

public class C01_Encapsulation {
    /*
   1) Encapsulation kisaca "data hiding" demektir

   2) Basarili bir Encapsulation için :
      a)Nasil kullanilacagi ve hedefi net iolmalidir.(Direksiyon gibi)
      b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
       karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
      c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

   3) Encapsulation yapısı  tanımlanması için
      a)Access modifier'lari private tanımlanmalı
      b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
       update edilebilmeli(setter)    .
       c) uygun constructor tanımlanmalı.
       d) toString() method tanımlanmalı


   4) Encapsulation'in faydalari
      a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
      b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
        tum classlar'dan istenildiği kadar kullanabiliri.
      c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
       hale getirebilir.
      d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
       (setter() olusturma) yapabilir.
       Not : Tum variable'lar private ve sadece getter() method tanımlanan  class'da
        data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

   5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

 */
    public static void main(String[] args) {

        C02_Encapsulution obj1=new C02_Encapsulution("dilek hanım",11);
        C02_Encapsulution obj2=new C02_Encapsulution();
        System.out.println("obj1.idver() = " + obj1.getId());//obj1.idver() = 11
        System.out.println("obj1.İsimver() = " + obj1.getName());//obj1.İsimver() = dilek hanım

        obj1.setName("dilek team lead");//dilek hanım ismi dilek hanım team lead olarak değiştirildi
        System.out.println("obj1.İsimver() = " + obj1.getName());//obj1.İsimver() = dilek team lead

        System.out.println("obj2.idver() = " + obj2.getId());//obj2.idver() = 1001
        System.out.println("obj2.isimver() = " + obj2.getName());//obj2.isimver() = Gamze Hanım

        obj2.setName("gamze scrum master");
        System.out.println("obj2.isimver() = " + obj2.getName());//obj2.isimver() = gamze scrum master



    }



}
