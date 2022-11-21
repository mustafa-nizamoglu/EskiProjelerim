package j35_Collection.C02_Set;

import java.util.*;

public class C02_Task {
    public static void main(String[] args) {


    /*
    değer ataması yapılan array in arraylist e ceviren method create ediniz
    main içerisinde meth return ettiği Arraylist hashset linkedHashSet ve TreeSett e atayınız
     */

    String arr[]={"muharrem","sinan","nihan","umit"};
    arrayListeCevir(arr);
    HashSet<String>hs=new HashSet<>(arrayListeCevir(arr));
    LinkedHashSet<String> lhs=new LinkedHashSet<>(arrayListeCevir(arr));


   TreeSet<String> ts=new TreeSet<>(arrayListeCevir(arr));


        System.out.println("hurra set :  " + hs);//hurra set :  [sinan, muharrem, umit, nihan]
        System.out.println("erken gelen girer set = " + lhs);//erken gelen girer set = [muharrem, umit, sinan, nihan]
        System.out.println("alfabetik sıra= " + ts);//alfabetik sıra= [muharrem, nihan, sinan, umit]


    }//main sonu

    private static ArrayList<String> arrayListeCevir(String[] arr) {
        ArrayList<String>arList=new ArrayList<>(List.of(arr));
        return arList;
    }
}