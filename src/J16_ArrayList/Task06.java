package J16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
/* TASK :
 Kullanıcıdan alacağınız 6 elemanlı bir dizinin
 sadece tek elemanlarını ayrı diziye bir metodda atayarak
  yazdırınız.

 */

        Scanner sc=new Scanner(System.in);

        int sayiarr[]=new int[6];
        for (int i=0;i<sayiarr.length;i++){
            System.out.println(i+1+" . elamnı  giriniz ");
            sayiarr[i]=sc.nextInt();
        }
        System.out.println("tekElemanlar(sayiarr) = " + tekElemanlar(sayiarr));




    }//main sonu

    private static ArrayList<Integer> tekElemanlar(int[] sayiarr) {
        ArrayList<Integer> tekSayılar=new ArrayList<>();  //. tek sayıların atanacagı bos list
        for (int i=0;i<sayiarr.length;i++){
            if (sayiarr[i]%2==1){
                tekSayılar.add(sayiarr[i]);

            }
            }
        return tekSayılar;
        }
    }

