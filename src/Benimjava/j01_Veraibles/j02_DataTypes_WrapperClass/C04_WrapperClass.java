package Benimjava.j01_Veraibles.j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Mustafa";
        int yas=33;

        System.out.println(name.toUpperCase());//MUSTAFA YAPAR HEPSİNİ BÜYÜK HARF YAPAR

// non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
// ancak primitive data turlerinin boyle bir ozelligi yoktur
// primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
//Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
// olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
// ara çözüm imkanı sunmuştur.

        String tc="123456";
        String id="98765";
        int yid=Integer.valueOf(id);

        int ytc=Integer.valueOf(tc);

        System.out.println("ytc = " + ytc);


        System.out.println("yid = " + yid);

        System.out.println(ytc+yid);

        String okulNo="234543l";
        //int yokulNo=Integer.valueOf(okulNo);//run time exception -> çalışma zamanı hatası
       // System.out.println("yokulNo = " + yokulNo);

        System.out.println( "madem geldin dünyaya otur çalış javaya");

        // task--> byte short int maximum ve minimum değerelerini print eden code yazınız
        byte maxbyt=Byte.MAX_VALUE;
        byte minbyt=Byte.MIN_VALUE;
        System.out.println(maxbyt);
        System.out.println(minbyt);
        System.out.println("Integer.MAX_VALUE = " +Integer.MAX_VALUE);
        System.out.println(" Integer = " + Integer.MIN_VALUE);


    }
}
