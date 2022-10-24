package Ödevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ödev19Ekim {

    /*
    ismi getCount() olan bir method oluşturun.
    Parametre olarak bir String ArayList  ve  bir tane String

    Return tipi int olmalı.

    ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
    Örneğin;
    ArrayList = Orange , Kiwi , Peach , Banana , Orange
    String Orange:
    Count = 2 olmalı. (Orange 2 kez yazılmış)
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { // main başı

        List<String> listIsim = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        System.out.println("Arraydeki hangi kelimenin kaç kez yazıldığını öğrenmek istiyorsunuz? ");
        String str = sc.nextLine();
        System.out.println(getCount(listIsim, str));
    }//main sonu

    public static Integer getCount(List<String> arr, String str) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equalsIgnoreCase(str))
                count++;
        }
        return count;


    }
}