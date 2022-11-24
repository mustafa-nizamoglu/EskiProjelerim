package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String nome="hacı mustafa ";
        String soyad="nizamoğlu ";
        int k=7;
        int b=11;
        //birden strin veraible ile farklı data type veraibleler + işlemine alınırsa
        // java birleştirme yaparak yeni bir string oluşturur
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'a Concatenation yapılır.

        System.out.println(nome+soyad+k+b);//hacı mustafa nizamoğlu 711

        System.out.println(k+nome+soyad+b);//7hacı mustafa nizamoğlu 11

        System.out.println(k+b+nome+soyad);//18hacı mustafa nizamoğlu

        System.out.println(""+k+b);//711

        System.out.println(nome+soyad+(k+b));//hacı mustafa nizamoğlu 18

        System.out.println((k+b)+nome+soyad);//18hacı mustafa nizamoğlu

        System.out.println((k-b)+nome+(k-b));//-4hacı mustafa -4

        System.out.println(nome+(k-b)+(k-b));//hacı mustafa -4-4
        System.out.println(nome+((k-b)+(k-b)));//hacı mustafa -8

char ch='1';
        System.out.println(nome+ch);//hacı mustafa 1
        System.out.println(k+ch+nome);//56hacı mustafa
        System.out.println(nome+(ch+b));//hacı mustafa 60
        System.out.println(k+nome+ch);//7hacı mustafa 1
      /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
  eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
  */


    }
}
