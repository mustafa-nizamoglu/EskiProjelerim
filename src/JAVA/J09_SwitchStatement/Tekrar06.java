package J09_SwitchStatement;

import java.util.Scanner;

public class Tekrar06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen Gün giriniz");
        String gün=sc.nextLine().toLowerCase();
        switch (gün){
            case "pazartesi":
            case "salı":
            case "çarsamba":
            case "persembe":
            case "cuma":
                System.out.println("Girilen gün hafata içine aittir");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Girilen gün hafta sonuna aittir");
                break;
            default:
                System.out.println("lütfen dogru giriş yapınız");



        }
    }
}
