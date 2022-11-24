package J16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> ListÜlke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","İsveç"));
        ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm"));

        //nCopies(int,obj); ->> int elemanlı birbir obj den oluşan list ataması yapar
        ArrayList<String>Yenilist=new ArrayList<>(Collections.nCopies(7,"javaCAN")); //Yenilist = [javaCAN, javaCAN, javaCAN, javaCAN, javaCAN, javaCAN, javaCAN]
        System.out.println("Yenilist = " + Yenilist);  //Yenilist = [javaCAN, javaCAN, javaCAN]


        //addAll(); -> bir liste diğer listi olduğu gibi ekler

        ListÜlke.addAll(ListSehir);  // Listülke sonuna sehirlist tamemen ekllendi
        System.out.println("ListÜlke = " + ListÜlke); //ListÜlke = [Almanya, Amerigonya, ingiltere, İsveç, Münih, Losangeles, Londra, Stocholm]
        ListSehir.addAll(3,ListÜlke);
        System.out.println("ListSehir = " + ListSehir); //ListSehir = [Münih, Losangeles, Londra, Almanya, Amerigonya, ingiltere, İsveç, Münih, Losangeles, Londra, Stocholm, Stocholm]




        //Task ->> 1 den 10 A kadar sayıları atayan ve print eden code create ediniz
        ArrayList<Integer>Listsayi=new ArrayList<>();
        for (int i=1;i<11;i++){
            Listsayi.add(i);


        }
        System.out.println("Listsayi = " + Listsayi);   //Listsayi = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]









    }

}
