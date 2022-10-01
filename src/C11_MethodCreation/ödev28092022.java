package C11_MethodCreation;

import java.util.Scanner;

import static java.lang.Math.random;

public class ödev28092022 {
    public static void main(String[] args) {
         /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */
     //   Scanner scan = new Scanner(System.in);
     //   System.out.print("bir sayı giriniz : ");
     //   int max = scan.nextInt();
     //   System.out.println(randomNum(max));


        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
      //Scanner scanner = new Scanner(System.in);
      //System.out.print("Lütfen saat giriniz: ");
      //int saat = scanner.nextInt();
      //System.out.print("Lütfen kara mili giriniz: ");
      //int mil = scanner.nextInt();
      //System.out.print("Lütfenkilogram giriniz: ");
      //int kg = scanner.nextInt();
      //ceviren(saat, mil, kg);

        /*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
        /*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
       //Scanner scanner = new Scanner(System.in);
       //System.out.print("paralelkenar için p, dikdörtgen için d ve üçgen için ü harflerinden  birini seçiniz: ");
       //String secim = scanner.next().trim().toLowerCase().substring(0,1);
       //int a=0, b=0;

       //if (secim.equals("p")) {
       //    paralelKenar(a, b);
       //}else if (secim.equals("ü")) {
       //    ucgen(a, b);
       //}else if (secim.equals("d")) {
       //    dikdörtgen(a, b);
       //}else System.out.println("Hatalı giriş ");

         /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
    //   Scanner scanner = new Scanner(System.in);
    //   System.out.print("Lütfen 1. sayıyı giriniz: ");
    //   int a = scanner.nextInt();
    //   System.out.print("Lütfen 2. sayıyı giriniz: ");
    //   int b = scanner.nextInt();
    //   System.out.print("Lütfen 3. sayıyı giriniz: ");
    //   int c = scanner.nextInt();

    //   enkücük(a,b,c);

          /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
//Scanner sc=new Scanner(System.in);
//        System.out.println("lütfen bir yıl giriniz");
//        int yıl=sc.nextInt();
//        System.out.println(artıkyıl(yıl));

          /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen saat giriniz");
        int st=sc.nextInt();
        howManySeconds(st);






    } //main sonu
    public static void howManySeconds(int st ){
        System.out.println(st*3600);
    }

  // public static boolean artıkyıl(int yıl) {
  //     boolean artıkyıl = yıl % 4 == 0 ? (yıl % 400 == 0 ? true : (yıl % 100 == 0 ? false : true)) : false;
  //     return artıkyıl;
  // }

  // public static void enkücük(int a,int b,int c) {
  //     String enkucuk = a<b && a<c ? "enkücük "+a : (b<c && b<a ? "enkücük "+b : (c<a && c<b ? "enkücük "+c : ("girdiğiniz sayılarda birden fazla en küçük değer var. ")));
  //     System.out.println(enkucuk);
  // }


    //public static int randomNum(int max){

   //    double max1=Math.random()*max;
   //    return (int) max1;
  //public static void ceviren(int s, int m, int k) {
  //    int saniye = s * 3600;
  //    int salise=s*3600*60;
  //    double km = m * 1.609344;
  //    int gram = k * 1000;

  //    System.out.println("" + s + " saat = " + saniye + " saniye\n" + m +
    //    " kara mili = " + km + " kilometre\n" + k + " kg = " + gram + " gram");

//  public static void paralelKenar(int paralelh, int paralelt) {
//      Scanner scanner = new Scanner(System.in);
//      System.out.print("Lütfen paralelkenarın yüksekliğini giriniz: ");
//      paralelh = scanner.nextInt();
//      System.out.print("paralelkenarın taban uzunluğunu giriniz: ");
//      paralelt = scanner.nextInt();
//      System.out.println("paralelkenarın alanı = "+(paralelh * paralelt));
//  }
//    public static void ucgen(int ucgenh, int ucgent) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("üçgenin yüksekliğini giriniz: ");
//        ucgenh = scanner.nextInt();
//        System.out.print("üçgenin taban uzunluğunu giriniz: ");
//        ucgent = scanner.nextInt();
//        System.out.println("üçgenin alanı = "+(ucgenh * ucgent/2));
//    }
//    public static void dikdörtgen(int dik1, int dik2) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("dikdörtgenin kısa kenar uzunluğunu giriniz: ");
//        dik1 = scanner.nextInt();
//        System.out.print("dikdörtgenin uzun kenar uzunluğunu giriniz: ");
//        dik2 = scanner.nextInt();
//        System.out.println("dikdörtgenin alanı = "+(dik1 * dik2)+"\ndikdörtgenin çevresi = "+((dik2 + dik1)*2));
 //   }


   }



