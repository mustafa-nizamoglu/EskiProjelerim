package task;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */
        System.out.println("lütfen password giriniz :");

        Scanner sc=new Scanner(System.in);
        String password =sc.nextLine();

      // if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&(password.charAt(password.length()-1)>='0'&&
      //         password.charAt(password.length()-1)<='9')&&(password.length()>=6)) {
      //     System.out.println("password geçerli");
      // }else System.out.println("password geçersiz");
      if((password.charAt(0)>='A'&&password.charAt(0)<='Z')&&(password.charAt(password.length()-1)>='0'
              &&password.charAt(password.length()-1)<='9')&&(password.length()>=6)){
          System.out.println("pasaport gecerli");
      }else {
          System.out.println("password geçersiz");
      }

      // if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
      //     System.out.println("ilk şartımız sağlandı");
      //     System.out.println(password);
      //     if (password.charAt(password.length()-1) >= '0' && password.charAt(password.length()-1) <='9') {
      //         System.out.println("ikinci şartımız sağlandı");
      //         if (password.length()>=6) {
      //             System.out.println("üçüncü şartımız sağlandı");
      //         }

      //     }
      // }else {
      //     System.out.println("şifre geçersizdir.");
      // }

























    }
}
