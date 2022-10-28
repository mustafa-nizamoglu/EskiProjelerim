package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String>listİsim=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String>aolmayanlist=new ArrayList<>();  // boş list
        for (int i=0;i<listİsim.size();i++){
            if (!listİsim.get(i).toLowerCase().contains("a")){
                aolmayanlist.add(listİsim.get(i));  //

            }
        }

        listİsim.clear(); // list işim boşaldı
        listİsim.addAll(aolmayanlist);
        System.out.println("listİsim = " + listİsim);  //listİsim = [Veli, Omer]









    }
}
