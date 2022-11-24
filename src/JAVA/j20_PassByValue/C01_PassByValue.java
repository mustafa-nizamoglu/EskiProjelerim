package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        java pass by Value bir programlama dilidir
        Bir primitive variable argument olarak bir method a call edildiğinde variable değil bir copy (vesikalık)(pointer)değeri gönderilir
         */


        //Task-> verilen fiyat için %24 arttırılmış fiyatı print eden method create ediniz
        double fiyat=100;
        System.out.println("ethod call öncesi fiyat = " + fiyat);  //100

        fiyatarttır(fiyat);   //fiyat veriable method'a paremetre call edildi

        System.out.println(" method call sonrası fiyat = " + fiyat);  //100

    } // main sonu
    
    public static void  fiyatarttır(double birsey){
        birsey=1.24;
        System.out.println("Arttırılmış fiyat = " + birsey);//124.0

    }
}
