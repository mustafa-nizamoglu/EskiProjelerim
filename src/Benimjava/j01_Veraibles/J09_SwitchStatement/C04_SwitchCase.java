package Benimjava.j01_Veraibles.J09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // girilen ayın hangi mevsimde olduğunu create eden code yazınız
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen ay no giriniz");
        int ayNo=sc.nextInt();
        switch (ayNo){
            case 1:
            case 2:
            case 12:
                System.out.println("girilen ay kıştır");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("girilen ay ilkbahardır");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("girilen ay yazdır");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("girilen ay sonbahardır");
                break;
            default:
                System.out.println("lütfen doğru bir ay no giriniz");

        }
    }
}
