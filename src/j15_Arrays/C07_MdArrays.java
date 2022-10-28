package j15_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
//Task ->> arr elemanlarını toplayan
        int arr[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt
        System.out.println(arr[0][0]+arr[0][1]+arr[0][2]+arr[1][0]+arr[1][1]+arr[2][0]);

        int toplam=0;
        for(int kat=0;kat<arr.length;kat++){
            for (int daire=0; daire <arr[kat].length;daire++){
                toplam+=arr[kat][daire];
            }
        }
        System.out.println("arr deki tüm elemanlar toplamı :"+toplam);














    }
}
