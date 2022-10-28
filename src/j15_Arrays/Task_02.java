package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {

// Task->> girilen int array  elemanları toplamını print eden code create ediniz

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



        System.out.println("forEachLoop ile çözümü ");
        int toplam=0;
        for (int a:arr){
            toplam+=a;
        }
        System.out.println("toplam = " + toplam);
    }
}
