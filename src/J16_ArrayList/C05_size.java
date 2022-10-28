package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        // size(); -> listin eleman sayısını return eder

        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm"));
        System.out.println(ListSehir.size());  //4

    }
}
