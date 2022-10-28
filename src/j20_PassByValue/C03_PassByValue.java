package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive data türlerinde obj nin kendisi degilde dataları değisirse obj refarans ve kendisi değişmediği
        için dataları  değişikliğini kalıcı yapar
         */

        //Task->> list elemanları 24,20,87 iki farklı method ile list elemanlarını update edip edip print eden code create ediniz
        //1. method with for each
        //2. method set()

        List<Integer>List=new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("method öncesi List = " + List);  //[24, 20, 87]

        listupdate1(List);  //
        listupdate2(List); //

        System.out.println("method sonrası List = " +List);//method sonrası List = [48, 40, 174]
    }//main sonu
    public static void listupdate1(List<Integer>list){
        for (Integer v:list){
            v*=2;

        }

        System.out.println( list);

    }
    public static void listupdate2(List<Integer>list){
        for (int i=0;i<list.size();i++) {
            list.set(i, list.get(i) * 2);
        }
        System.out.println("list update 2= " + list);


    }

}
