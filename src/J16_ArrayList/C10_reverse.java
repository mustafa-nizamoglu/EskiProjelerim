package J16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_reverse {
    public static void main(String[] args) {
          //Collections.sort(list);-> verilen list'i natural sıralama yapar
        // Collections.reverse(list);-> verilen listin ters sıralamasını return eder
        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm"));
        Collections.sort(ListSehir);  //sort(); method sout içinde çalışmaz
        System.out.println("ListSehir = " + ListSehir); //ListSehir = [Londra, Losangeles, Münih, Stocholm] a->z

        Collections.reverse(ListSehir);
        System.out.println("ListSehir = " + ListSehir); //ListSehir = [Stocholm, Münih, Losangeles, Londra] z->a

        ArrayList<String> ListÜlke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","İsveç"));
        System.out.println("ListÜlke = " + ListÜlke);  // ters sıra önce  ListÜlke = [Almanya, Amerigonya, ingiltere, İsveç]
        Collections.reverse(ListÜlke);
        System.out.println("ListÜlke = " + ListÜlke);  //ters sıra sonrası  ListÜlke = [İsveç, ingiltere, Amerigonya, Almanya]


    }
}
