package j12_ForLopps.L01_ForLoop.L01_Forlopps.L01_Forlopps.Tasks;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {
        /*
        girilen bir ifadenin harfsayısını print eden code create ediniz
        input:selam javaCAN'lar
        output: a sayısı :3
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle= sc.nextLine();
        System.out.println("lütfen harfi giriniz");
        char harf=sc.next().charAt(0);

        int harfsayısı=0;  //ilk deger 0 atandıki sayma etki etmesin


        for (int i=0;i<=cümle.length()-1;i++){
            if(cümle.charAt(i)==harf){
                harfsayısı++;
            }
        }
        System.out.println("girdiğiniz cümle :"+cümle+"de istediginiz harf :"+harf+harfsayısı);

    }
}
