package Benimjava.j01_Veraibles.j02_DataTypes_WrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {


     /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */
        String name="mustafa ";
        //String yas="13";
        int tevellut=34;
        int yıl=22;
        boolean emeklimi=true;
        boolean atcı=false;
        char ch='$';
        //1999 yılında dünyaya gelen doğan beyin yaşını yazdırınız
        int dogumYılı=1999;
        int şimdikiYıl=2022;
        int yaşınız=şimdikiYıl-dogumYılı;
        System.out.println(yaşınız);
        float f1=12.45f;
        float f2=23.56f;
        double boy=1.85;
        System.out.println(f1*f2);
        //task--->> iki farklı bayt tanımlayıp print ediniz
        byte a=50;
        byte b=40;
        System.out.println(a-b);
        System.out.println(a+b);
        //task --<< iki tane farklı tamsayı degeri tanımlayıp toplamını alınız
        byte x=45;
        int y=100;
        System.out.println(x+y);//145
        // task-->> tamsayı ve ondalıklı sayı tanımlayıp toplamını alınız
        int c=100;
        double d=10.5;
        System.out.println(c+d);//110.5
        //task-->>> tsamsayı ve char data type iki veriable tanımlayıp
        char para='$';
        int sayi=63;
        System.out.println(para+sayi);//99 $ ascii degeri 36 olarak aritmelik işleme girdi
        String nome="hacı mustafa ";
        String soyad="nizamoğlu ";
        int yasınn=37;
        System.out.println(nome+" "+soyad+" "+yasınn);//task











}
}
