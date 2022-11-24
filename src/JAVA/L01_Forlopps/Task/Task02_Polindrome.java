package j12_ForLopps.L01_ForLoop.L01_Forlopps.Task;

import java.util.Scanner;

public class Task02_Polindrome {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz
        polindrome:her iki yönde okundugunda eşit olan ifadeler
        ey edip adanada pide ye
         */

        System.out.println("lütfen bir metin giriniz");
        String str=sc.nextLine();
        polindrome(str);   // string parametreli method call

    }//main dışı

    private static void polindrome(String str) {
        String tersstr="";  // bos bir String kutu sonra
        for (int i=str.length()-1;i>=0;i--){
            tersstr+=str.charAt(i);

        }
        System.out.println("girilen ifadenin tersi :"+tersstr);
        if (str.equalsIgnoreCase(tersstr)){
            System.out.println("girilen ifade POLİNDROME");
        }else
            System.out.println("girilen ifede POLİNDROME < değil >");

    }
}
