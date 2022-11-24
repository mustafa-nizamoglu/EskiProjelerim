package j15_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan aşağıysa o günleri return yap.

     *
     */
    static ArrayList<String>gunler=new ArrayList<>(Arrays.asList("p.tesi","sali","çarsamba","persembe","cuma","cumartesi","pazar"));
    static ArrayList<Double> günlükkazanclar=new ArrayList<>();  //2. adım
    static Scanner sc=new Scanner(System.in);
    static  double haftaciro=0;

    public static void main(String[] args) {
        int gün=0;
        while (gün<7){
            System.out.print("Lütfen "+gunler.get(gün)+"gününün hasılatını giriniz : ");
            double günkazancı=sc.nextDouble();
            günlükkazanclar.add(günkazancı);
            haftaciro+=günkazancı;
            gün++;

        }


        getortalamanınUstundaKazanc();
        getOrtalamaninAltindaKazancGünleri();
       // getOrtalamakazanc();
        System.out.println("haftaciro = " + haftaciro);
        System.out.println("getOrtalamakazanc() = " + getOrtalamakazanc());
        System.out.println("Ortalama üstü günler ="+getortalamanınUstundaKazanc());
        System.out.println("Ortalama Altı Günler ="+getOrtalamaninAltindaKazancGünleri());



    }//main sonu

    private  static String getOrtalamaninAltindaKazancGünleri() {String ortalamaÜstüGün="";
        String ortalamaAltıGün="";
        for (int i=0;i<günlükkazanclar.size();i++){
            if (günlükkazanclar.get(i)<getOrtalamakazanc()){  //günlük kazanc hafta ortalaması ile karsılaştırıldı
                ortalamaAltıGün+=gunler.get(i);


            }
        }
        return ortalamaAltıGün;
    }

    private static String getortalamanınUstundaKazanc() {
        String ortalamaÜstüGün="";
        for (int i=0;i<günlükkazanclar.size();i++){
            if (günlükkazanclar.get(i)>getOrtalamakazanc()){  //günlük kazanc hafta ortalaması ile karsılaştırıldı
                ortalamaÜstüGün+=gunler.get(i);


            }
        }
        return ortalamaÜstüGün;
    }

    private static double getOrtalamakazanc() {
        double ortalama=haftaciro/7;
        return ortalama;

    }
}
