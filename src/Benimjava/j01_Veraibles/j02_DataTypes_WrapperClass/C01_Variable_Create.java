package Benimjava.j01_Veraibles.j02_DataTypes_WrapperClass;

public class C01_Variable_Create {
    public static void main(String[] args) {
        //birinci yol best practice (tavsiye edilen uygulama)
        int yas=38;
        int maas=33000;
        System.out.println("yas");//yas
        System.out.println(yas);//37
        System.out.println(maas);
        System.out.println("mustafa başlangıç maası:"+maas);
      //ikinci yol
        int boy;// degeri olmadan bir int atandı
        System.out.println("boy");//degeri atanmamış değişkeni hiç bir aksiyonda kullanılmız
        boy=177;
        System.out.println(boy);
        //3. yol
        int yevmiye,age,kilo;//birden çok aynı tipte değişken tanımladık
        age=37;
        yevmiye=1000;
        kilo=72;//tanımlanan değişkenlere değere atandı
        int günlük=1500, yıl=2022,agırlık=72;
        günlük=1800;
        System.out.println("günlük sondeğeri: "+günlük+ yıl+ yas+
                yevmiye);
        // trick bir variable bir kez tanımlanır ama birden çok değer atanabilir

        int a=34;
        int b=20;
        int temp=a;

        System.out.println("swap öncesi=" +a+","+"b="+b);
    }
}
