package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {


        //Task -> verilen fiyat için %11  %22  %33 indirimli fiyatı print eden methodlar create ediniz
        double fiyat = 100;
        System.out.println("ethod call öncesi fiyat = " + fiyat);  //100

        System.out.println("indir11(fiyat) = " + indir11(fiyat));  //89

        System.out.println("indir22(fiyat) = " + indir22(fiyat));   //78

        System.out.println("indir33(fiyat) = " + indir33(fiyat));   //67
        
        System.out.println("fiyat = " + fiyat);                      //100
     }

    private static double indir11(double fiyat) { // girilen fiyatın %11 indirimli hali=fiyatın %89 return eden method
        return fiyat*=0.89;
        
        
    }

    private static double indir22(double fiyat) {// girilen fiyatın %22 indirimli hali=fiyatın %78 return eden method
        return fiyat*=0.78;

    }

    private static double indir33(double fiyat) {// girilen fiyatın %33 indirimli hali=fiyatın %67 return eden method
        return fiyat*=0.67;

    }
}