package J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
TASK :
 Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı=sc.nextInt();
        //System.out.println ((sayı>999 && sayı<10000) ? "4 basmaklı":( sayı%2==0 ? "4 basamaklıolmayan çifolan sayı" :"4 basamaklı olmayan çifolmayan sayı"));
        if (sayı>999 && sayı<10000)
            System.out.println("4 basamaklı");
        else if (sayı%2==0) {
            System.out.println("4 basamaklıolmayan çifolan sayı");

        }
        else
            System.out.println("4 basamaklı olmayan çifolmayan sayı");

    }
}
