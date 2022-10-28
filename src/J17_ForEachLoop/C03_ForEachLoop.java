package J17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //Task->iki string elemanlarının ortak olmasını kontrol eden kode creat ediniz
        String arr1[]={"nazım","gülsü","dilek","erol","cüney","ciğde"};
        String arr2[]={"musty","gülsüm","ayse","enise","cüneyt","ciğdem"};
        List<String>ortakisim=new ArrayList<>();   //ortak isimlerin atanacagı bos list
        for (String s1:arr1){
            for (String s2:arr2){
                if (s1.equalsIgnoreCase(s2)){  // eşitlik kontrolü
                    ortakisim.add(s1);

                }



            }
        }
        if (ortakisim.isEmpty()) {
            System.out.println("ortak isim yok"+ortakisim);
        }else System.out.println("ortakisim = " + ortakisim);   //ortakisim = [gülsüm, cüneyt, ciğdem]
        }



    }

