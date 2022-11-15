package J32_Abstract;

public class C01_Abstract {
    /*
    1-bazı durumlarda child class lar parent class daki medhodların genellikle bodylerine değiştirerek override ederler
    bu gibi durumlard a parent clasdaki method'a body tanımlamak ram ve memory açısından gereksizdir
    çözüm olarak java parent class a body siz ->abstract(soyut) mehodlar tanımlanır

    2-parent class daki abstract methodlar app güvenliği açısından class da override
    3-abstract method tanımlamak için
    a-{} body olmaz
    b-acces modiefden sonra abstract keyword kullanılmalı
    c-abs method içinde abs keyword ve {} body bir arada kullanılamaz aksi halde CTE verir

    abstract class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı
    4- abs method sadece abs clasda tanımlana bilir kesinlikle concrete class da abs method tanımlanamaz
    ama abs class da method tanımlana bilir
    5-abs class içinde hem abs method hemde concrete method ve veriable tanımlana bilir
    6-bir concrete child class parent abs class extend ettiğinde abs methodları implement etmek zorunda
    ama concrete methodlar isteğe göre override edilir
    7-parent child ilşkisi olan abstract class lar abs methodları implemet etmek zorunda değildir
    8-parent olan abstract clas birden cok concrete  veya abs child clas s extend edbilir
    ancak child class birden cok abs parent class da extend edemez
    9-abstrac class da final abstarct method tanımlanamaz yoksa CTE verir
    10-abtract class da private method tanımlanamaz cte verir  final method override edilemez
    11-private abstract void PriveteMethod();//abract ila private bir arada olamaz
    12-abstract
    13-nda obj=new Honda();//melekler doğurmaz abs class obje üretmez

    ******************* ABSTRACT CLASS ASLA VESİNLİKLE OBJE ÜRETEMEZ     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    TRİCK->abstract class lar referansı child classın obj sini tutabilir (polimorphism)




     */



}