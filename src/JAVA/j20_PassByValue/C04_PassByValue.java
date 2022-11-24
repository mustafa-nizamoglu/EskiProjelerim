package j20_PassByValue;

public class C04_PassByValue {
    static double etiketFiyatı;
    static double indirimOranı;
    public static void main(String[] args) { //main bası
        /*
        eger bir methodda yapılan değişiklik kalıcı olsun istenirse 
        1. yol değişiklik yapılan veriable' static olarak tanımlanır
        2. yol atama yapılır
         */
        etiketFiyatı=100;
        System.out.println("etiketFiyatı = " + etiketFiyatı);

        indirimOranı=0.10;
        indir();//method call

        indirimOranı=0.10;
        indir();
        indirimOranı=0.10;
        indir();
        System.out.println("etiketFiyatı = " + etiketFiyatı);
        
    }//main sonu
    public static void indir(){
        etiketFiyatı*=(1-indirimOranı);
        System.out.println("etiketFiyatı = " + etiketFiyatı);
    }
}
