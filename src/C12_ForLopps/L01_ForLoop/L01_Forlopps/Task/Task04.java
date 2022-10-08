package L01_Forlopps.Task;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
/*
girilen iki sayı arasındaki cift sayıları print eden code creat ediniz
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen 1.  sayıyı giriniz");
        int sayı1=sc.nextInt();
        System.out.println("lütfen 2. sayıyı giriniz");
        int sayı2=sc.nextInt();

        if(sayı1<sayı2){
            for (int i=sayı1; i<sayı2; i++){
                if (i%2==0){
                    System.out.println("cift sayılar"+i);
                }
            }



        }//else System.out.println("hatalı giriş yaptınız");
        if(sayı1>sayı2){
            for (int i=sayı2; i<sayı1; i++){
                if (i%2==0){
                    System.out.println("cift sayılar"+i);
                }
            }



        }











    }//main dışı
}
