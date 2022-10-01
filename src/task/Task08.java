package task;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
String pickName="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   // hacı  yazdırıyorum

        //1 yol

        char h=pickName.charAt(pickName.indexOf("H"));
        char a=pickName.charAt(pickName.indexOf("A"));
        char c=pickName.charAt(pickName.indexOf("C"));
        char ı=pickName.charAt(pickName.indexOf("I"));

        System.out.println(h+a+c+ı);  //277
        System.out.println(""+h+a+c+ı); //HACI

        //2. yol

        System.out.println(""+pickName.charAt(pickName.indexOf("H"))+pickName.charAt(pickName.indexOf("A"))
                +pickName.charAt(pickName.indexOf("C"))+pickName.charAt(pickName.indexOf("I")));




















    }
}
