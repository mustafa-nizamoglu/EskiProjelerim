package Ödevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class kasım24 {
    public static void main(String[] args) {
        /*  task->
   Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz

    */

        List<Integer> output = new ArrayList<>(Arrays.asList(15,18,46,27,43,11,40,36,81,92,78,34));
        ListIterator<Integer> it = output.listIterator();

        while (it.hasNext()){
            int a=it.next();
            if (a<20 || a>40){
                it.remove();
            }
        }
        System.out.println("output = " + output);





    }
}
