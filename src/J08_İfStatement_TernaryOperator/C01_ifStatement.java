package Benimjava.j01_Veraibles.J08_İfStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
        int krmyas = 39;
        int ismlyas = 63;
        if (krmyas == ismlyas) {
            System.out.println("aynı yasdasınız güzel insanlar");
            System.out.println("yoksa siz ikizmisiniz");

        }
        if (krmyas >= 40)
            System.out.println("krm bey olgunluk yasındasınız");
            System.out.println("bu yazıyı okoduysanız 12. satırdaki bagımsız ");

        if (krmyas + ismlyas > 100) {
            System.out.println("kerm bey ve ismail bey yasları toplamı 100 den büyük");
        }
        System.out.println("selam javacanlar");
        /*
        bagımsız ıf statement yapıları sadece kendi scop(kapsamlarını) run eder.
        birden fazla bagımsız if statement yapıları hepsinin body calışabileceği gibi body
         */
    }

}
