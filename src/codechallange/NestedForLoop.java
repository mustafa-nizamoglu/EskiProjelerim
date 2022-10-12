package codecalence;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen Satır sayısı giriniz :");
        int satır=sc.nextInt();
        System.out.println("lütfen sutun sayısı giriniz :");
        int sutun=sc.nextInt();
         for (int i=1; i<=satır; i++){
             for(int j=1;j<=sutun; j++){
                 System.out.print(" *");
             }
             System.out.println("");// bu bos olmaz sa hepsini yan yana yazar
         }

    }
}
