package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // Array copy... copy0f(arr,newLength); --> girilen arr'yin newLength kadar ilk elemanını copyalar
int sayi[]={63,21,47,27,35,12,36,31,46,24};
int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("sayıdan ilk beş i kopyalanan yeniArr ="+Arrays.toString(yeniArr)); //sayıdan ilk beş i kopyalanan yeniArr =[63, 21, 47, 27, 35]


        int BaskaArr[]=Arrays.copyOfRange(sayi,3,8);
        System.out.println("sayıarr den özel kopyalan baskaArr = "+Arrays.toString(BaskaArr));  //sayıarr den özel kopyalan baskaArr = [27, 35, 12, 36, 31]


        // Array i belirli bir eleman ile update(set) etme... fill(arr,value);

        Arrays.fill(sayi,99);
        System.out.println("sayı arr fulllemiş hali ="+Arrays.toString(sayi));  //sayı arr fulllemiş hali =[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]


        Arrays.fill(sayi,3,7,33);
        System.out.println("özel seçilmiş  update= "+Arrays.toString(sayi));  //özel seçilmiş  update= [99, 99, 99, 33, 33, 33, 33, 99, 99, 99]









    }
}
