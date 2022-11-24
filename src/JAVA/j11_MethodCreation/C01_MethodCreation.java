  package j11_MethodCreation;
  public class C01_MethodCreation {       /*
 code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tracih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/

    public static void main(String[] args) { // main açılış
        System.out.println("javacanlara selam");
    topla(); // parametresiz return type ı olmayan void bir method
        System.out.println("agam bu yazıyı okuduysan ahanda yukarıdaki method call oldu");
 topla2(34,43);   // parametreli method call
      System.out.println("agaya selam");
int maas=topla3();
        System.out.println("maas :"+maas);    //135
        System.out.println("ahanda topla3 çalıştı   :) "+topla3());  //135

        System.out.println("bahçe :"+topla4(35, 48));
        System.out.println("tarla:"+topla4(10, 20));
        System.out.println("arsa :"+topla4(5, 8));

        //Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
         //Method parantezinin icinde olusturulan variable'lara "parametre" denir.
        // Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
       //Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli

   }// main kapanış

      public static int topla4(int b, int a) {
         // System.out.println(str);

          return 2*(a+b);
      }

      public static int topla3() {  //parametresiz ama int return type method
        int a=72;
        int b=63;
          return a+b;
      }

      // bir method Class'in icinde ama  main method'un disinda  cereate edilir
      // Best practice-> method'lar main method'dan sonra create edilir.
      public static void topla() {  // parametresiz return type ı olmayan void bir method
        int a=33;
        int b=23;
    System.out.println(a+b);
    System.out.println("topla methodun dan selamlar  :) ");
}
public static void topla2 (int a,int b){// parametreli (2 int) void method
  System.out.println("bu method parametreli");
  System.out.println(a+b);
  System.out.println("topla2 çalıştı");

}


}// class kapanış

