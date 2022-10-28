package Benimjava.j01_Veraibles.j02_DataTypes_WrapperClass;

import java.util.Scanner;

public class ugula {
    public static void main(String[] args) {
        // trick bir variable bir kez tanımlanır ama birden çok değer atanabilir

        int a=5,b=10,c=2,d=75;
        System.out.println(a+b+c+"d");   //17d


        System.out.println("lütfen bir sayı giriniz :");
        int x;

        //1999 yılında dünyaya gelen doğan beyin yaşını yazdırınız
        int dogumtarihi=1999;
        int bulundugumuzyıl=2022;
        int yas=bulundugumuzyıl-dogumtarihi;
        System.out.println(yas);

        //task--->> iki farklı bayt tanımlayıp print ediniz
        byte w=10;
        byte q=8;
        System.out.println(w+q);
        System.out.println(w-q);
        System.out.println(w*q);
        System.out.println(w/q);
        //task-->>> tsamsayı ve char data type iki veriable tanımlayıp
        int e=6;
        char data='+';
        System.out.println(e+data);

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=sc.nextLine();
        System.out.println("isminizin ilk harfi :"+isim.charAt(0));

        //task kullanıcının girdiğideğere göre kere alanı ve cevresini hesaplayan code

        System.out.print("karenin kenar uzunlugunu giriniz");
        int kenear=sc.nextInt();
        int çevre=kenear*4;
        int alan=kenear*kenear;
        System.out.println("karenin alanı :"+alan+"\nkarenin çevresi : "+çevre);


        /*
kullanıcının günlük içtiği çaymiktarını hesaplayan  code creat ediniz
 */
        System.out.println("içtiğiniz çaymiktarını giriniz");
        int çay=sc.nextInt();
        System.out.println("lütfen şeker sayısını giriniz");
        int seker=sc.nextInt();
        int toplamşeker=çay*seker;
        System.out.println("toplamşeker = " + toplamşeker);



                }
}
