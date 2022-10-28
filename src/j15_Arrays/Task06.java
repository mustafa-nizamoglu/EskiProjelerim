package j15_Arrays;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        buyukucuksirala(arr);
        System.out.println(Arrays.toString(buyukucuksirala(arr)));  //[45, 25, 9, 9, 6, 5, 4, 3, 1, 0]
    }
    public static int[] buyukucuksirala(int arr[]){
        int buyukkucArr[]=new int[arr.length];
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            buyukkucArr[i]=arr[arr.length-i-1];
        }
        return buyukkucArr;
    }

    }

