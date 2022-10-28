package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        //indexof();--> list içinde istenen elemanın index degerini return eder

        ArrayList<String> ListÜlke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","İsveç"));
        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm"));

        System.out.println(ListSehir.indexOf("Londra"));  //2
        System.out.println(ListSehir.indexOf("londra"));  //-1

        System.out.println(ListSehir.indexOf("Angara"));  //-1
        System.out.println(ListSehir.indexOf("Maraş"));  //-1  // olmayan elamnaın durumuna göre -1 yazar

        ListÜlke.add("Amerigonya");
        System.out.println(ListÜlke.indexOf("Amerigonya")); //1 tekarralı elemanlarda soldan ilk bulunan eleman index

        System.out.println(ListÜlke.lastIndexOf("Amerigonya"));  //4  sondan ilk buldugunun index ini verir


    }
}
