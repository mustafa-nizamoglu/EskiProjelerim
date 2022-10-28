package Benimjava.j01_Veraibles.j03_DataTypes_wrapperClass;

import java.util.Scanner;

public class C01_ScannerCLass {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için şu üç adım takip edilir
        // 1. adım-- scanner classtan abj creat edilir
       // Scanner scan= new Scanner(System.in);//scanner classından scan isminde değeri system için de olan bir obj
        //2. adım-kullanıcıdan istenen veri için bildirimde bildirimde

      //  System.out.println("adınızı giriniz");

        //3. adım kullanıcınınn girdiği
       // String isim=scan.nextLine();
      //  System.out.println("isim = " + isim);

        //task kullanıcının girdiğideğere göre kere alanı ve cevresini hesaplayan code
        // Scanner scanner=new Scanner(System.in);


        //System.out.println("karenin kenarını giriniz");

        //int kenar= scanner.nextInt();

       // System.out.println("alan: "+(kenar*kenar)+"  çevre : "+(kenar*4) );


/*
kullanıcının günlük içtiği çaymiktarını hesaplayan  code creat ediniz
 */
      //  System.out.println("günlük sayısını  giriniz");
      //  int caySayısı= scanner.nextInt();

       // System.out.println("şeker sayısını   giriniz");
        //int şekersayısı= scanner.nextInt();

        //System.out.println("caySayısı = " + (caySayısı*1.7*365)/100);;
        //System.out.println("şeker sayısını = " + (caySayısı*1.7*365)/100);;


/*
kullanıcının isminin ilk karakterini yazan code creat ediniz
 */

        Scanner scanner=new Scanner(System.in);

       Scanner sc=new Scanner(System.in);


        System.out.println("isminizi giriniz: ");

        char ch;// kullanıcıdan gelen string ifadesinin 0. index ilk karekterini laır

        ch = scanner.nextLine().charAt(0);

        System.out.println("isminizin ilk karakteri:"+ch);

        String isim=sc.next();
        System.out.println("isim = " + isim);


    }
}
