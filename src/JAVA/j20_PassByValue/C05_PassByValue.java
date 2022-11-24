package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) { //main başı
         /*
        eger bir methodda yapılan değişiklik kalıcı olsun istenirse
        2. yol atama yapılır
         */
        double etiketFiyatı=100;//primitive
        double indirimOranı=0.1;//primitive
        System.out.println("İndirim öncesi etiketFiyatı = " + etiketFiyatı);  //100

        etiketFiyatı=indirim(etiketFiyatı,indirimOranı); //90

        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı); //90

    } //main sonu
    public static double indirim(double fiyat,double oran){
       fiyat*=(1-oran);
        System.out.println("İndirimli fiyat = " + fiyat);
        return  fiyat;
    }

}
