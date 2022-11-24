package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
        Treemap
        1treeMap keylerde null değer tanımlanmaz
         */
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(101,"ugur");
        tm.put(102,"mustaf");
        tm.put(103,"aysun");
        tm.put(104,"serra");
        tm.put(105,"hüseyin");
        System.out.println("tm = " + tm);// = {101=ugur, 102=mustaf, 103=aysun, 104=serra, 105=hüseyin}

        //tm.put(null,"serra");//key değeri null olamaz NullPointerException
        tm.put(104,"hüma");
        tm.put(106,null);
        tm.put(107,null);
        System.out.println("tm = " + tm);//tm = {101=ugur, 102=mustaf, 103=aysun, 104=hüma, 105=hüseyin, 106=null, 107=null}


        HashMap<String,String>hm=new HashMap<>();
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");



        TreeMap<String,String>tm1=new TreeMap<>(hm);//
        System.out.println("tm1 = " + tm1);//tm1 = {Amazon=296 Euro, Apple store=333 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Saturn=300 Euro, Vatan=111 Euro}

        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));//method paremetre olarak girilen key değer ömp de varsa  return eder
        //yoksa paremetreden buyuk enkucuk key değerini return eder
        //parametre mapde yok ve parametreden  buyuk enkuçük keyde yoksa null return eder
        //tm.ceilingKey(key)->en küçük abi abla

        System.out.println("tm.ceilingKey(108) = " + tm.ceilingKey(108));//tm.ceilingKey(108) = null

        System.out.println("tm.ceilingKey(100) = " + tm.ceilingKey(100));//tm.ceilingKey(100) = 101
        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1));//tm.ceilingKey(100) = 101


        //ascending order-> artan sıralama
        //descending order-> azalan sıralama

        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());//tm.descendingKeySet() = [107, 106, 105, 104, 103, 102, 101]
        System.out.println("tm.keySet() = " + tm.keySet());//tm.keySet() = [101, 102, 103, 104, 105, 106, 107]
        System.out.println("tm.lastKey() = " + tm.lastKey());//tm.lastKey() = 107
        System.out.println("tm.firstKey() = " + tm.firstKey());//tm.firstKey() = 101





    }
}
