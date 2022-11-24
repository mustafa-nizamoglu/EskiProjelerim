package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        //remove(); ->> listden istenen elmanı siler
        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm"));
        ListSehir.remove("angara"); //felse
        ListSehir.remove("Londra"); //true
        ListSehir.remove(1);      //LosAngeles
        System.out.println("ListSehir = " + ListSehir);  //ListSehir = [Münih, Stocholm]

      //  ListSehir.remove(11);      //olmayan index silinmesi istenirse RTE verir

        ListSehir.add("Münih");
        ListSehir.add("Angara");
        ListSehir.add("Münih");
        System.out.println("ListSehir = " + ListSehir); //ListSehir = [Münih, Stocholm, Münih, Angara, Münih]
        ListSehir.remove("Münih"); // tekraralı eleman vars ailk ini siler gerisini bırakır
        System.out.println("ListSehir = " + ListSehir); //ListSehir = [Stocholm, Münih, Angara, Münih]







    }
}
