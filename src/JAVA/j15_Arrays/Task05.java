package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen kaç elemalı array istiyorsunuz :");
        int arrBoyut=sc.nextInt();

        int arr[]=new int[arrBoyut];
        for (int i=0; i<arrBoyut;i++){
            System.out.print(i+". index elemanı giriniz :");
            arr[i]=sc.nextInt();
        }
        System.out.println("İstediğiniz array :"+ Arrays.toString(arr));
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);}
    }
}
