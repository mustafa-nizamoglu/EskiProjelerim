package j15_Arrays;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {

		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
        String str[]={"1","2","3"};
        String solayaz[]=new String[str.length];
        for (int i=0;i<str.length;i++){
            if (i==0){
                solayaz[i]=str[i+1];
            }else if (i==str.length-1) {
                solayaz[i] = str[0];
            }else solayaz[i] = str[i+1];
        }
        System.out.println(Arrays.toString(solayaz));






    }
}
