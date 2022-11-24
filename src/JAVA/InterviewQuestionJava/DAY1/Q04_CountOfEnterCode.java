package JAVA.InterviewQuestionJava;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        String pin="mustafa2246";
        int girishakkı=4;
        System.out.println(" Hoş geldiniz ");
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("pinkodo giriniz");
            String girilenpin = sc.nextLine();
            if (pin.equals(girilenpin)){
                System.out.println("Basarılı giriş yaptınız");
                break;

            }else {
                System.out.println("yanlış pin kodu");
                girishakkı--;
                System.out.println("kalan giriş hakkı : " + girishakkı);

            }if (girishakkı==0){
                System.out.println("giriş hakkınız kalmadı sim kartınız bloke oldu ");
                break;
            }

        }











    }
}
