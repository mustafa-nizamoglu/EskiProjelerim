package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        // list' i Array a cevirme ->toArray()

        //1. çözüm ->>toArray(); parametre olarak String[0] olarak yapılır
        ArrayList<String> ListÜlke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","İsveç"));
        String arrÜlke[]=ListÜlke.toArray(new String[0]);  // ülke listi aarÜlke olarak atandı

        System.out.println("ListÜlke = " + ListÜlke);  //ListÜlke = [Almanya, Amerigonya, ingiltere, İsveç]
        System.out.println("Arrays.toString(arrÜlke) = " + Arrays.toString(arrÜlke));//Arrays.toString(arrÜlke) = [Almanya, Amerigonya, ingiltere, İsveç]


        //2. yöntem ->> oluşturulan Array'in data type Object olarak atanır

        //Trick->> Object class java'da tüm class ların parent(atası:hz ADEM)

        // Object Clas javada parent i olmayan tek Class tır (vagonları ceken ama cekilemez lokomotif)
        // String Integer Claslar Object Class Child i oldugu için istenen durumlarda data type olarak
        Object arrUlkeler[]= ListÜlke.toArray();
        System.out.println("arrUlkeler = " +Arrays.toString(arrUlkeler) );  //arrUlkeler = [Almanya, Amerigonya, ingiltere, İsveç]









    }
}
