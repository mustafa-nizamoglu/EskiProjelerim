package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        //king of Trick->> array den cevrilen list array kaynaklı oldugu için array davranışı gösterir 
        //boyut sabittir dolayısı ile remove add method çalışmaz
        
        
        String arrJavaCAN[]={"Akif","Gamze","Musty","SevdeNur"};
        List<String> listJavaTar= Arrays.asList(arrJavaCAN);  //aarJavaCAN degeri liste eleman olarak atandı
        System.out.println("listJavaTar = " + listJavaTar); //listJavaTar = [Akif, Gamze, Musty, SevdeNur]
        System.out.println("listJavaTar.size() = " + listJavaTar.size());// listJavaTar.size() = 4
       // listJavaTar.add("sefil mustafa");//array a eleman eklenmezzzzzz :((
                                           //RTE->unsupportedOperationExeption
        
        //ahanda kral trick ->< list data type tanımlanırsa rte vermez kaynagı array de olsa list davranır boyut esnekliği yapar


        ArrayList<String>listJavatar1=new ArrayList<>(Arrays.asList(arrJavaCAN));
        listJavatar1.add("sefil mustafa");
        System.out.println("listJavatar1 = " + listJavatar1);  //listJavatar1 = [Akif, Gamze, Musty, SevdeNur, sefil mustafa]






    }
}
