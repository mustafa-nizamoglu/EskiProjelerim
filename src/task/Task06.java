package task;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        girilen stringin son karakterini silen code create ediniz...
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz :");
        String kelime=sc.next();
        System.out.println(kelime.substring(0,kelime.length()-1));






















    }
}
