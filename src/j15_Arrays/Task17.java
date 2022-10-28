package j15_Arrays;

public class Task17 {
    public static void main(String[] args) {
        //Task-->> sayı arry2indeki enbüyük elemanı print eden code ediniz
        int sayi[][]={{1,2,3},{19,-8},{24,0,-41}};
        int maxEleman=sayi[0][0];
        for(int kat=0;kat<sayi.length;kat++){
            for (int daire=0; daire <sayi[kat].length;daire++) {
                if(sayi[kat][daire]>maxEleman){
                    maxEleman=sayi[kat][daire];
                }

            }
        }
        System.out.println("maxEleman ="+maxEleman);  //24
















    }
}
