package J09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        //Task->>kullanıcıdan yılın aysırasına göre
        Scanner sc = new Scanner(System.in);
        System.out.print("lütfen bir ay giriniz     :");
        int ay = sc.nextInt();
        switch (ay) {
            case 0:
                System.out.println("girilen girilen ay ocak");
                break;
            case 1:
                System.out.println("girilen ay şubat");
                break;
            case 2:
                System.out.println("girilen ay mart");
                break;
            case 3:
                System.out.println("girilen ay nisan");
                break;
            case 4:
                System.out.println("girilen mayıs");
            case 6:
                System.out.println("girilen haziran");
                break;
            case 7:
                System.out.println("girilen temmuz");
                break;
            case 8:
                System.out.println("girilen ağustos");
                break;
            case 9:
                System.out.println("girilen eylül");
                break;
            case 10:
                System.out.println("girilen ekim");
                break;
            case 11:
                System.out.println("girilen kasım");
                break;
            case 12:
                System.out.println("girilen aralık");
                break;
            default:
                System.out.println("lütfen düzgün ay  giriniz");
        }
    }
}