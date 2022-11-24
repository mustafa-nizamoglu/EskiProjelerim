package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {

     // get():-> listede istenen elemanı return eder arr[3]->> arr'3 index deki elemanı verir

        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm"));
        System.out.println(ListSehir.get(1));//Losangeles
       // System.out.println(ListSehir.get(11));//olmaayan index elemanı Rte verir




    }
}
