package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_sublist {
    public static void main(String[] args) {
        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm","Angara","patGONYA"));
        //sublist(); list den istenen list parçasını return eder
        System.out.println("ListSehir.subList(3,5) = " + ListSehir.subList(3, 5));//3 ve 4 index elemanları listi verir ListSehir.subList(3,5) = [Stocholm, Angara]

        ArrayList<String> city=new ArrayList<>(ListSehir.subList(2,5));
        System.out.println("city = " + city); // city = [Londra, Stocholm, Angara]


    }
}
