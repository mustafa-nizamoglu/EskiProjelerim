package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replalaceAll_fill {
    public static void main(String[] args) {

        //replaceAll() ->listte belirli bir elemanı bir deger ile update eder
        ArrayList<Integer>Listsayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        System.out.println("Listsayi = " + Listsayi); // replaceAll önce  Listsayi = [1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38]

        Collections.replaceAll(Listsayi,1,20);  // sayı list inde 1 yerine 20 yazdırdı
        System.out.println("Listsayi = " + Listsayi);//replacaAll sonrası  Listsayi = [20, 24, 23, 14, 19, 60, 20, 55, 27, 20, 38]


        //fill()-> listte tüm elemanları belirli bir ddegere update eder

        Collections.fill(Listsayi,33);
        System.out.println("Listsayi = " + Listsayi);  //fill sonrası  Listsayi = [33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]







    }
}
