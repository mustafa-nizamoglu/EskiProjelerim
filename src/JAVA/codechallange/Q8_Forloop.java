package codechallange;

import java.util.Scanner;

public class Q8_Forloop {
    // Kullanicidan iki sayi isteyin.
// Girilen sayilar ve aralarindaki tum
// tamsayilari toplayip, sonucu yazdiran bir program yaziniz
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen 1. sayı giriniz :");
        int sayi1=sc.nextInt();
        System.out.println("lütfen 2. sayı giriniz :");
        int sayi2=sc.nextInt();
        int toplam=0;
        if(sayi1<sayi2){
        for (int i=sayi1;i<=sayi2; i++){
            toplam+=i;

        }
            System.out.println(toplam);
        }else if(sayi1>sayi2){
            for (int i=sayi2;i<=sayi1;i++){
                toplam+=i;
                System.out.println(toplam);
            }

        }else {
            System.out.println("sayılar eşittir");
        }


  //cüneyt beyin cözümü
 //      Scanner sc=new Scanner(System.in);
 //      int num1=sc.nextInt();
 //      int num2=sc.nextInt();
 //      int tpl=0;
 //      for (int i =(num1<num2?num1:num2)+1; i <(num1>num2?num1:num2) ; i++) {
 //          System.out.println(" "+i);
 //          tpl+=i;

 //      }
 //      System.out.println("toplam= "+tpl);

// elly hocanın çözümü
//      Scanner scanner = new Scanner(System.in);
//      int sayi1 = scanner.nextInt();
//      int sayi2 = scanner.nextInt();
//      int toplam = 0;
//      if(sayi1<sayi2){
//          for (int i = sayi1; i <=sayi2 ; i++) {
//              toplam+=i;
//          }
//          System.out.println(sayi1 +  " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
//      }else if(sayi1>sayi2){
//          for (int i = sayi2; i <=sayi1; i++) {
//              toplam+=i;
//          }
//          System.out.println(sayi1 +  " ile " + sayi2 + " arasindaki sayilarin toplami :" + toplam);
//      }else{
//          System.out.println("sayilar esittir" );








    }
}



