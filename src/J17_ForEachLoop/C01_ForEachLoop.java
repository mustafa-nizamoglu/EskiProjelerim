package J17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        for each loop for loop un gelişmiş halidir
        1.clean code yazım kolaylığı
        2. code okuma kolaylıgı
        3. hata yapma riskini azltır
         */

        List<Integer>sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        
        // Task-> list elemanlarını ayrı satırlara prınt ediniz
        
        for (int i=0;i<sayiList.size();i++){
            System.out.println("sayiList.get(i) = " + sayiList.get(i));
            
        }
        
        
        
        for (Integer a:sayiList){
            System.out.println("a = " + a);

        }
        //Task-> list elemanlarını ilk üç eleman hariç tek olanlarını yazdırınız
        
      
        for (Integer b:sayiList.subList(3,sayiList.size())){
            if (b%2==1){
                System.out.println("b = " + b); //b = 33  b = 27  b = 41
            }
            
        }
        
        //Task->list elemanlarının 2 ile 5 index elemanlarının toplamını prınt edeniz
        int toplam=0;
        for (Integer c:sayiList.subList(2,6)){
            if(c%2==0){
            toplam+=c;}
            
            }
        System.out.println("toplam = " + toplam);
        }
        
    }

