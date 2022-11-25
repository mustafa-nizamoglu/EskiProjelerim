package Lambda;

import Lambda.L01_LambdaExpression.C01_LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_filter {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        PrintCiftElStructured(sayi);//24 38 42 66 46 16
        System.out.println("\n   ***   ");
        printCiftElFunctional(sayi);//24 38 42 66 46 16
        System.out.println("\n   ***   ");
        printCiftElFunctional2(sayi);//24 16
        System.out.println("\n   ***   ");
        printCiftElFunctional3(sayi);//24 38 33 7 3 42 66 46 25 16

    }//main sonu
    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void PrintCiftElStructured(List<Integer>sayi){
        for(Integer w:sayi){
            if (w%2==0){
                System.out.print(w+" ");
            }

        }
    }

     public static void printCiftElFunctional(List<Integer>sayi){
        sayi.
                stream().                        //list elemanları akısa alındı
                filter(t->t%2==0).               //akısdaki list elemanları cift olma sartına göre filitrelendi akısdan cıkarıldı   //lambda exp...bad practice
                forEach(C01_LambdaExpression::yazdir);//C01 Class daki yazdır method refere(call) edildi
}

    public static void printCiftElFunctional1(List<Integer>sayi){
        sayi.
                stream().                        //list elemanları akısa alındı
                filter(C01_LambdaExpression::ciftMi). //akısdaki list elemanları cift olma sartına göre filitrelendi akısdan cıkarıldı//met. ref. best practice
                forEach(C01_LambdaExpression::yazdir);//C01 Class daki yazdır method refere(call) edildi
    }
 //Task : "Structured Programming":Amele code kullanarak list elemanlarının 35 den küçük çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElFunctional2(List<Integer>sayi){
        sayi.
                stream().
                filter(t->t%2==0).
                filter(t->t<35).

               // filter(t->t%2==0 && t<35).//2. yol olabilir

                forEach(C01_LambdaExpression::yazdir);

    }
//Task : "Structured Programming":Amele code kullanarak list elemanlarının 34 den büyük yada çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
public static void printCiftElFunctional3(List<Integer>sayi){
    sayi.
            stream().
            filter(t->t%2==0 || t<34).
            forEach(C01_LambdaExpression::yazdir);
}

}
