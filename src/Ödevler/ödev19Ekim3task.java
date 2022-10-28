package Ödevler;

import java.util.ArrayList;
import java.util.List;

public class ödev19Ekim3task {
     /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        ArrayList<String> listSehir = new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println("Element uzunlugu sirasiyla: "+getLength(listSehir));
    }//main disi

    public static ArrayList<Integer> getLength(ArrayList<String> listSehir) {
        ArrayList<Integer> lengthSehir = new ArrayList<>();
        for (String x : listSehir) {
            lengthSehir.add(x.length());
        }
        return lengthSehir;
    }
}

