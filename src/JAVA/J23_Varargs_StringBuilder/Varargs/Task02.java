package J23_Varargs_StringBuilder.Varargs;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

//Task-> girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan method create ediniz

        System.out.println("sonuç ="+(toplaÇarp(2,36,25,32,12,3)));  //sonuç =216
        int arr []={24,42,33,19,34,45,58,38};
        System.out.println("toplaÇarp(2,arr) = " + toplaÇarp(2,arr));           //toplaÇarp(2,arr) = 586

    }//main sonu
    public static int toplaÇarp(int carpılacak,int ... toplanacak){
        int toplam=0;
        for (int a:toplanacak){
            toplam+=a;

        }
        return carpılacak*toplam;



    }
}
