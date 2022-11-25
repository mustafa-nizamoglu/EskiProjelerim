package Lambda;

import Lambda.L01_LambdaExpression.C01_LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        ciftkarekçkbyksırala(sayi);//256 576 1444 1764 2116 4356
        System.out.println("\n   ***   ");
        tekkarebykkçksral(sayi);//5625 4489 3025 2401 2025 1225 1089 625 49 9
         System.out.println("\n   ***   ");






    }//mainsonu
    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftkarekçkbyksırala(List<Integer> sayi){
        sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                map(t->t*t).
                sorted().
                forEach(C01_LambdaExpression::yazdir);
        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
        //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.

    }
    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void tekkarebykkçksral(List<Integer> sayi){
        sayi.stream().
                filter(t->t%2==1).
                map(t->t*t).
                sorted(Comparator.reverseOrder()).
                forEach(C01_LambdaExpression::yazdir);
        //reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
        // bir Comparator (karşılaştırıcı) return eder.
    }

    

}
