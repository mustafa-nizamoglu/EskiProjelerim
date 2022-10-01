package Benimjava.j01_Veraibles.J10_StringManipulations;

import java.util.Scanner;

public class ödev {


    // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
   System.out.println("lutfen bir cümle giriniz");
   String cümle=sc.nextLine();
    System.out.println(cümle.contains(" ")?"boşluk var":"boşluk yok");
  //  if(cümle.contains(" ")) {
  //    System.out.println("Girdiğiniz Cümle Boşluk Vardır");
  //  }else System.out.println("Girdiğiniz Cümle Boşluk Yoktur ");








    /* TASK :
     * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
     * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
     * Test data: ali eme all
     */
  //Scanner sc=new Scanner(System.in);
  //System.out.println("lutfen bir İsim giriniz");
  //String isim=sc.nextLine();
  //System.out.println(isim.length()!=3 ? "Yanlış girdiniz" :isim.charAt(0)==isim.charAt(2)|| isim.charAt(0)==isim.charAt(2)||
  //        isim.charAt(2)==isim.charAt(1) ? "Aynı harfleri kullandınız" : "Harfler farklıdır");




    /*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

   // Scanner sc=new Scanner(System.in);
   // System.out.println("Lütfen bir cümle giriniz ");
   // String cümle=sc.nextLine();
   // System.out.println(cümle.substring(0,cümle.length()/2));


      // Scanner sc=new Scanner(System.in);
     // System.out.println("Lütfen bir cümle giriniz ");
     // String cümle=sc.nextLine();
     // System.out.println(cümle.contains(" "));

      //Task -->> girilen e mail hesabının gmail.com içermiyorsa lütfen gmail hesabı giriniz"
      // gmail.com ile bitiyorsa "hesabınız onaylandı"aksi durum da "gecerli hesap giriniz " print eden end code creat ediniz

      //  Scanner sc=new Scanner(System.in);
  //  System.out.println("Lütfen @gmail adresi giriniz ");
  //  String email=sc.nextLine();

  //    if(email.contains("@gmail.com")) {

  //        System.out.println("Hesabınız onaylandı " + email.endsWith("@gmail.com"));

  //   }else if (!email.contains("@gmaill.com")) {
  //        System.out.println("Lütfen gmail hesbı giriniz " + email.endsWith("@gmail.com"));

  //    }else
  //        System.out.println("Geçerli bir hesap giriniz ");

    // task-->> girilen cümlede aranan kelimenin varlığını kontrol eden bir code yazınız

    // Scanner sc=new Scanner(System.in);
    // System.out.println("Lütfen bir cümle giriniz ");
    // String cümle=sc.nextLine();
    // System.out.println("Lütfen bir kelime giriniz ");
    // String kelime=sc.nextLine();
    // System.out.println(cümle.contains(kelime));






  }

    }

