package JAVA.j13_Brek_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        //Task->> girilen bir ifade deki c karakterine kadar a karakter sayısını prınt eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.print("lütfen bir cümle giriniz :");
        String cümle=sc.nextLine();
        int asayısı=0;
        for (int i=0;i<cümle.length();i++){
            if(cümle.charAt(i)=='a'){
                asayısı++;

            } else if (cümle.charAt(i)=='c') {
                break;

            }
            System.out.println("döngüde işleme giren karaekterler :"+cümle.charAt(i));

        }System.out.println("a sayısı :"+asayısı);
    }
}
