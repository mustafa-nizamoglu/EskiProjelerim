package J21_İmmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C05_OCA_İmmutableClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);  CTE verir

        for (String s : list) System.out.println(s);
    }
}
