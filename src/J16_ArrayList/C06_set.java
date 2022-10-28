package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {

    //set();->  list in istenen index e istenen elemanı updata eder
    ArrayList<String> ListSehir=new ArrayList<>(List.of("Münih","Losangeles","Londra","Stocholm"));
        System.out.println(ListSehir.set(3, "Angara"));  //

        System.out.println(ListSehir);//


    }
}
