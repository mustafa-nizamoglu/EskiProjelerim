package Benimjava.j01_Veraibles.J10_StringManipulations;

public class C04_Containis {
    public static void main(String[] args) {

        //String içerisinde istene string in varlıgını return eder

        String s1="hacı bey basarılı bir Qa tester team lead  ";
        System.out.println(s1.contains("bey"));   //turue
        System.out.println(s1.contains(" "));   // turue


        String s2="Qa";
        System.out.println(s1.contains(s2));  //turue
        System.out.println(s2.contains(s1)); //false


        // task-->> girilen cümlede aranan kelimenin varlığını kontrol eden bir code yazınız


    }
}
