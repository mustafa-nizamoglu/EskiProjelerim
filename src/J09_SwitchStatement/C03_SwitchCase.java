package Benimjava.j01_Veraibles.J09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
       //Task-->> girilen ay numarasına göre kac gün cektiğini print eden kod created ediniz
        Scanner sc = new Scanner(System.in);
        System.out.print("lütfen bir aynumarısı giriniz     :");
        int ayNo = sc.nextInt();
        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("bu ay 31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("bu ay 30 gündür ");
                break;
            case 2:
                System.out.println("yılınızı giriniz");
                int yıl=sc.nextInt();
                if (yıl%4==0){
                    System.out.println("bu ay şabat ayıdır 29 gündür");
                    break;
                }else
                    System.out.println("girilen ay şubat ayı 28 gündür");
            default:
                System.out.println("lütfen doğru ay no giriniz");
        }

    }
}
