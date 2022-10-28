package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task04  {
    public static void main(String[] args) {
        // girilen bir int array

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen kaç elemalı array istiyorsunuz :");
        //int arrBoyut=sc.nextInt();

        int arr[]=new int[sc.nextInt()];
        for (int i=0; i<arr.length;i++){
            System.out.print(i+". index eleman giriniz :");
            arr[i]=sc.nextInt();
        }
        System.out.println("istediğiniz array :"+ Arrays.toString(arr));
        int arrtoplam = 0;
        for (int i = 0; i<=arr.length-1 ; i++) {
            arrtoplam+=arr[i];
        }System.out.println("Array toplam = " + arrtoplam);
        int ortalamaArr=arrtoplam/arr.length;
        int ortalamayıgecensayısı=0;
        for (int i=0; i<arr.length;i++){
            if(arr[i]>ortalamaArr){
                ortalamayıgecensayısı++;

            }
        }
        System.out.println("Girdiğin array elemanlarından ortalamayı gecen eleman sayısı:"+ortalamayıgecensayısı);












    }
}
