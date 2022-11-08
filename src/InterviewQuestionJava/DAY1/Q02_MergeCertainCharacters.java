package InterviewQuestionJava;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir String giriniz :");
        String str=sc.nextLine();
        System.out.print("Bir sayı giriniz :");
        Integer a=sc.nextInt();

        System.out.println( ilksonHarf(str, a));
        System.out.println("ilkSonHarfler(str,a) = " + ilkSonHarfler(str,a));  //ikinci çözüm


    }//main sonu

    private static String ilksonHarf(String str, Integer a) {
        String İlkSonHarfler=str.substring(0,1)+str.substring(str.length()-1);
        System.out.println("İlkSonHarfler = " + İlkSonHarfler);

        String output="";
        for (int i=0; i<a; i++){// birleşimden kactane yazdıracaksam onu verir
            output+=İlkSonHarfler;


        }
        return output;
    }
    public static String ilkSonHarfler(String s,int a){ // ikinci çözüm
        String yeni=(s.substring(0,1)+s.substring(s.length()-1)).repeat(a);
        return yeni;
    }







}
