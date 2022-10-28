package J18_Constructor;

public class C01_Constructor {

        /*
        1-constructor ismş class ismi ile aynı olmalı buyul harf ile başlamalı
        2-constructor create edildiiğinde name den sonra (){} mutlaka kullanılmalı
        3-eger p'li cons. create edildiğinde java default cons ezer(siler)
        4-cons return type olmaz method dan ayıran özelliğidir
        5-Class oluştuğunda java default cons. kendi create edilir
         */
    String str;
    String selam="güzel insan";

       // C01_Constructor   obj1   =    new         C01_Constructor();
        public static void main(String[] args) {

         //class name    obje name new keyword    default cons.
        C01_Constructor   obj1   =    new         C01_Constructor();
        C01_Constructor   obj2   =    new         C01_Constructor();
        C01_Constructor   obj3   =    new         C01_Constructor();
        C01_Constructor   obj4   =    new         C01_Constructor();
        C01_Constructor   obj5   =    new         C01_Constructor();

        obj1.str="javacan";   // str ins. veraible obj1 ile call edilerek degeri obj1 javacan
            obj2.str="Javatar"; //str ins. veraible obj2 ile call edilerek degeri obj2 javatar

            System.out.println(obj3.selam);  //güzel insan

            System.out.println(obj1.str);  //javacan
            System.out.println(obj2.str);  //Javatar
            System.out.println(obj4.str);  //null
            System.out.println(obj5.str);  //null

obj3.aga();   //agaya selam
obj2.aga();   //agaya selam


    }//main sonu

    public static void aga(){
        System.out.println("agaya selam");
    }
}
