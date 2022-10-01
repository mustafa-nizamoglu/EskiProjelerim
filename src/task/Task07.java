package task;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        girilen string in içindeki istenen index deki karekteri print eden code creat ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz :");
        String kelime=sc.next();

        System.out.println("istenen karakterin index gir");
        int index=sc.nextInt();

        if(kelime.length()>index){
            System.out.println(kelime.substring(index,index+1));
            System.out.println(kelime.charAt(index));
        }else{
            System.out.println("girilen mkelimede olmayan index istiyorsunuz");
        }











    }
}
