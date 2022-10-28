package Benimjava.j01_Veraibles.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /*
        Task->> girilen yasın 18 den büyük oldugunu kontrol eden code crate ediniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas= scan.nextInt();
        if (yas>=18){
            System.out.println("yasınız 18 den büyük," );
        }
         /*
        Task->> girilen yasın 18 den büyük oldugunu kontrol eden code crate ediniz 18 küçük ise ehliyet alamzsınız print ediniz

         */
       else
            System.out.println("ehliyet alamazsınız," );


    }
}
