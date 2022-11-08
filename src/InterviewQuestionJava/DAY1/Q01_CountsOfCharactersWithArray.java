package InterviewQuestionJava;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
     /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
     public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
         System.out.println("Bie String giriniz");
         String str=sc.nextLine();

         //split
         String [] arr=str.split("");//herbir karekteri ayırır
         System.out.println(Arrays.toString(arr));


         //sort
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));

         //count
         int counter=0;

         //karekterleri karşılastırmak için for loop

         for(int i=1;i<arr.length;i++){
             if(arr[i-1].equals(arr[i])){
                 counter++;
             }else {
                 System.out.println(arr[i-1]+"  sayısı  "+(counter+1));
                 counter=0;
             }
             if (i==arr.length-1){//EN SON KAREKTER İÇİN CALİSİR
                 System.out.println(arr[i]+" sayısı "+(counter+1));

             }

         }









}//main sonu
}