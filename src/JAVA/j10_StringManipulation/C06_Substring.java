package j10_StringManipulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

    /*
   substring()
   Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
   substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
   substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
   indexi'e kadar parçayı return eder
   baslangic indexi ==> inclusive/dahil
   bitis indexi ==> eclusive/haric
   */
        String str="java bilen sırtı yere gelmez :)";
        System.out.println(str.length());
        System.out.println(str.substring(10));  // sırtı yere gelmez
        System.out.println(str.substring(str.length()-10)); //son on karakter
        System.out.println(str.substring(0,10));   //ilk karakter

// verilen kelimein tersini yazdırma
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen dört harfli kelime giriniz  =");
        String kelime=sc.nextLine();
        if(kelime.length()!=4){
            System.out.println("lütfen doğru giriş yapınız");
        }
        else{
            System.out.print(kelime.substring(kelime.length()-1));
            System.out.print(kelime.substring(2,3));
            System.out.print(kelime.substring(1,2));
            System.out.print(kelime.substring(0,1));
        }









    }
}
