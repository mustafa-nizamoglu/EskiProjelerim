package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> kullanıcıdan alınan degerlerle bir int array elemanlarını büyükten küçüge  eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen kaç elemalı array istiyorsunuz :");
        int arrBoyut=sc.nextInt();

        int arr[]=new int[arrBoyut];
        for (int i=0; i<arrBoyut;i++){
            System.out.print(i+". index eleman giriniz :");
            arr[i]=sc.nextInt();
        }
        System.out.println("istediğiniz array :"+ Arrays.toString(arr));
        Arrays.sort(arr);    // arr  küçükten büyüge sıraalandı
        System.out.println(Arrays.toString(arr));

        for (int i=arr.length-1; i>=0;i-- ){
        System.out.print(arr[i]+ " ");}  // büyü

    }
}
