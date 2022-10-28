package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen kaç elemalı array istiyorsunuz :");
        int arrBoyut=sc.nextInt();

        int arr[]=new int[arrBoyut];
        for (int i=0; i<arrBoyut;i++){
            System.out.print(i+". index elemanı giriniz :");
            arr[i]=sc.nextInt();
        }
        System.out.println("İstediğiniz array :"+ Arrays.toString(arr));
        int kactaneTek=0;
        for(int i=0;i<7;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+"---");
                kactaneTek++;
            }
        }
        System.out.println("Toplamda : "+kactaneTek+" Elamani tektir");
        sc.close();
    }
}
