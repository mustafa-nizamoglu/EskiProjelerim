package InterviewQuestionJava;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi=sc.nextInt();

        boolean flag=true;
        if (sayi>=2){
            for (int i=2;i<sayi;i++){
                if (sayi%i==0){
                    flag=false;
                    break;
                }
            }
            if (flag==true) System.out.println("sayi asaldır");
            else System.out.println("sayi asal değildir");
        }else System.out.println("sayi asal değildir");








}
}