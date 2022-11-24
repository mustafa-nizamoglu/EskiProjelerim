package j11_MethodCreation;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
// task-> girilen iki sayının seçilen dört işleme göre hesaplayan method create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz");
        double sayı1=sc.nextDouble();

        System.out.print("2. sayıyı giriniz");
        double sayı2=sc.nextDouble();

        System.out.print("işlem giriniz");
        char islem=sc.next().charAt(0);
        ilemMenü(islem,(int) sayı1,(int) sayı2);

    }// main sonu
    public  static void ilemMenü(char ch,int x,int y){
        switch (ch){
            case '+':
                topla(x,y);
                break;
            case '-':
                cıkar(x,y);
                break;
            case '*':
                carp(x,y);
                break;
            case '/':
                böl(x,y);
                break;
        }
    }
    public static void topla(int a,int b){
        System.out.println("a+b  = " +(a+b));
    }
    public static void cıkar(int a,int b){
        System.out.println("a-b  = " +(a-b));}
    public static void carp(int a,int b){
        System.out.println("a*b  = " +(a*b));}
    public static void böl(int a,int b){
        System.out.println("a/b  = " +(a/b));}
}
