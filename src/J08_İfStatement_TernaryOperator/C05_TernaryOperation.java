package Benimjava.j01_Veraibles.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperation {
    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı=sc.nextInt();
      //  String sonuc =sayı%2==0? "sayı/2 ":"Sayi iki veya daha fazla basamakli";
       // System.out.println(sonuc);
        /*
        trick--->> ternary ikidurum (t/f) için farklı type çıktısı veriyors averaible atama yapmamızlazım yada ternary çıktısı aynı data type cast edilmeli
         */
        System.out.println(sayı%2==0? sayı/2 :"Girilen sayı tek oldugu için yarısı tam sayı değildir");













    }
}
