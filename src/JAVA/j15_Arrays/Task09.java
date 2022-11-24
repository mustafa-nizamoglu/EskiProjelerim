package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];
        int kacinciArr=0;
        while (kacinciArr<=4){
            System.out.println((kacinciArr+1)+". Sayiyi giriniz");
            arr[kacinciArr]=scan.nextInt();
            kacinciArr++;
        }
        int tersten[]=new int[5];
        for (int i=0;i<arr.length;i++){
            tersten[i]=arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(tersten));
        scan.close();
    }
}
