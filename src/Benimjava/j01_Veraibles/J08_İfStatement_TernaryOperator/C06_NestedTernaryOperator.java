package Benimjava.j01_Veraibles.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı=sc.nextInt();
        System.out.println(sayı>=0 ? ( sayı<10? "Rakam":"Pozitif sayi") :"Negatif sayı");
    }
}
