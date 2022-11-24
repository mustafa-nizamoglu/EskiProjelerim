package j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //Array elemanı varlığını kontroletme
        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};
        int sayi=33;
        boolean flag=false;  //bayrak
        for(int i=0;i<arr.length;i++){
            if (arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("aradığınız sayı array de VAR");
        }else {
            System.out.println("aradığınız sayı array de YOK");
        }
        Arrays.sort(arr);//array elemanları sıralandı
        System.out.println(Arrays.toString(arr));    //[7, 16, 17, 20, 24, 34, 43, 54, 55, 63, 67, 97]
        System.out.println(Arrays.binarySearch(arr, 34));//5  method aranan elemanı array de arayıp index  return eder
        System.out.println(Arrays.binarySearch(arr, 16));//1   method aranan elemanı array de arayıp index  return eder
        System.out.println(Arrays.binarySearch(arr, 21));// -5  method aranan elemanı array de arayıp index  return eder
        System.out.println(Arrays.binarySearch(arr, 99));// -13  method aranan elemanı array de arayıp index  return eder
        System.out.println(Arrays.binarySearch(arr, 46));// -8  method aranan elemanı array de arayıp index  return eder

// Trick -->> binrysearch metodu arrayde çalısırsa olmayan elemanı çalışırsa sonuç olarak ::::::::::::::::::: eger bu eleman array de olsaydı konumunu















    }
}
