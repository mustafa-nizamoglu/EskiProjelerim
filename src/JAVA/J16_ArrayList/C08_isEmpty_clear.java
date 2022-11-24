package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {
        
      //isEmpty(): -> listin boş olmasını kontrol eder  true ve folse return eder
        //clear(): -> listin tum elemanlarını siler

        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm","Angara","patGONYA"));
        System.out.println("ListSehir = " + ListSehir);//ListSehir = [Münih, Losangeles, Londra, Stocholm, Angara, patGONYA]
       //ListSehir.isEmpty() = false
        
        ListSehir.clear(); //
        System.out.println("ListSehir = " + ListSehir);//ListSehir = []
        ListSehir.isEmpty();   //
        System.out.println("ListSehir.isEmpty() = " + ListSehir.isEmpty()); //ListSehir.isEmpty() = true



    }
}
