package Benimjava.j01_Veraibles.J09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    // task-->> girilen haftanın gününü hafat içi yada hafta sonu yada hafta içine ait olduğunu belirten code creat ediniz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen gün güriniz: ");
        String gun=sc.next().toLowerCase();
        switch (gun) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
            System.out.println("Girilen gün hafat içine ait");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("girilen gün hafata sonuna aittir");
                break;
            default: // hiç birine eşleşme olmazsa çalışır
                System.out.println("lütfen dogru giriş yapınız");


        }
    }
}
