package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
         // bir list de istenen sayının varlığını control eden code create ediniz
        ArrayList<Integer> Listsayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen aradığınız  sayıyı giriniz = ");
        int ara=sc.nextInt();

        boolean varmı=false;
        for(int i=0;i<Listsayi.size();i++){
            if (Listsayi.get(i)==ara){
                varmı=true;
                System.out.println("Aradınız sayı vardır = ");
                break;
            }

        }
        if (!varmı){
            System.out.println("Aradığınız sayı yoktur");
        }

 //cüneyt beyin cözümü
 //      boolean flag=false;
 //      for (int i = 0; i < listSayi.size(); i++) {
 //          flag=listSayi.get(i)==sayi;
 //          if(flag)
 //              break;
 //      }
 //      System.out.println(flag);





    }
}
