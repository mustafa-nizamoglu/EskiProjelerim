package j15_Arrays;

public class Task16 {
    public static void main(String[] args) {
        int sayi[][]={{1,2,3},{9,8},{24,0,4}};
        int çarpım=1;
        for(int kat=0;kat<sayi.length;kat++){                       //kat kontrolü

                çarpım*=sayi[kat][sayi[kat].length-1];


        }
        System.out.println("arr deki tüm elemanların çarpımı :"+çarpım);
    }
}
