package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        //contains ();->> mehod listde istenen elemanın varlığını kontrol eder true/false return

        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm"));
        System.out.println("ListSehir.contains(\"angara\") = " + ListSehir.contains("angara"));  //false
        System.out.println("ListSehir.contains(\"Münih\") = " + ListSehir.contains("Münih"));    //true


    }
}
