package j12_ForLopps.L01_ForLoop.L01_Forlopps.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop->önce şart kontrol edilir eger sart true alınırsa body action çalısır
        do-While loop-> önce bady action çalışır sonra şart kontrol edilir sart true ise döngü devam eder sart false ise döngü kırılır ve döngüden sonraki ilk satır çalısır
        do-While loop -> game app. de daha çok kullanılır

        Trick-->> while loop sart sağlanmasa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
en az bir kez çalışır..
         */
        int yas=31;
        while (yas<33){
            System.out.println("agam yas"+yas+"gayet basarılı :");
            System.out.println("while bady action....");
            yas++;
        }
        do{
            System.out.println("agam yas :"+yas);
            System.out.println("do while body action ");
            yas++;
        }while (yas<33);











    }
}
