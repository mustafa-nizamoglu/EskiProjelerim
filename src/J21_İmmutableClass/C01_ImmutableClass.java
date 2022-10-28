package J21_İmmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1="mustafa"; //ilk degeri mustafa atanan str1 variable
        String str2="mustafa"; //str1 ve str2 aynı ilk degere sahip oldugu için String havuzunda ortak ref

        String str3=new String("mustafa");  //degerleri aynı ref farklı obj
        String str4=new String("mustafa");  //degerleri aynı ref farklı obj

        String str5=str1+"";


        System.out.println( str1==str2);          //true
        System.out.println( str1==str3);          //false
        System.out.println(str1.equals(str2));   //true
        System.out.println(str3==str4);          //false
        System.out.println(str1==str5);          //false
        System.out.println( str1.equals(str5));   //true











    }
}
