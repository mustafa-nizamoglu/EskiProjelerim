package J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class OgrenciNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz :");
        int Not = scan.nextInt();
        if (Not < 0 || Not > 100) {
            System.out.println("lütfen doğru not giriniz");
        }
        else if (Not < 50)
            System.out.println("\"D\"");
        else if (Not < 60)
            System.out.println("\"C\"");
        else if (Not < 80)
            System.out.println("\"B\"");
        else if (Not<=100)
            System.out.println("\"A\"");


    }
}