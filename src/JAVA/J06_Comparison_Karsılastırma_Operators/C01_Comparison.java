package J06_Comparison_Karsılastırma_Operators;

public class C01_Comparison {
    public static void main(String[] args) {
        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */
        int hmn=37;
        int aysn=32;
        System.out.println("hmn işitmi aysn  " +(hmn==aysn));  //false
        System.out.println("hmn eşit değil aysn  " +(hmn!=aysn));  //true
        System.out.println("hmn küçük mü aysn  " +(hmn<aysn));  //false
        System.out.println("hmn büyük mü aysn  " +(hmn>aysn));  //true

       /* s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
                s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
        Böylece ekrana TRUE yazdırır.
        */

        String s1="hacı mustafa";
        String s2="hacı mustafa";
        System.out.println(" s1 eşitmi s2  " + (s1==s2));// true

        String s3="Hacı mustafa";   // küçük harf ascii değeri ile büyük harf ascii degri farklı
        String s4="hacı mustafa";
        System.out.println(" s3 eşitmi s4  " + (s3==s4));// false



    }
}
