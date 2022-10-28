package J09_SwitchStatement;

import java.util.Scanner;

public class SwitchÖdev {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..
    // VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
    /*
		TASK :
		Girilen not değerini aşağıdaki tabloya göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.


		 */


// Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
// 1.gün Pazartesi alınız
public static void main(String[] args) {
  //Scanner sc=new Scanner(System.in);
  //System.out.println("pazartesi için->1 \nsalı için ->2 \nçarşamba için ->3 \nperşembe için ->4 \ncuma için->5 \ncumartesi için ->6 \npazar için ->7 \nGiriniz");
  //int gün=sc.nextInt();
  //switch (gün){
  //    case 1:
  //        System.out.println("Girilen gün PAZARTESİ ");
  //        break;
  //    case 2:
  //        System.out.println("Girilen gün SALI");
  //        break;
  //    case 3:
  //        System.out.println("Girilen gün ÇARŞAMBA ");
  //        break;
  //    case 4:
  //        System.out.println("Girilen gün PERŞEMBE ");
  //        break;
  //    case 5:
  //        System.out.println("Girilen gün CUMA ");
  //        break;
  //    case 6:
  //        System.out.println("Girilen gün CUMARTESİ");
  //        break;
  //    case 7:
  //        System.out.println("Girilen gün PAZAR ");
  //        break;
  //    default:
  //        System.out.println("Lütfen Doğru giriş yapınız");}
    /*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

   //Scanner sc=new Scanner(System.in);
   //System.out.println("Lütfen Ay ismi Giriniz");
   //String Ayismi=sc.nextLine().toLowerCase();
   //switch (Ayismi){
   //    case "ocak":
   //    case "mart":
   //    case "mayıs":
   //    case "temmuz":
   //    case "ağustos":
   //    case "ekim":
   //    case "aralık":
   //        System.out.println("Girdiğiniz ay 31 gün'dür");
   //        break;
   //    case "nisan":
   //    case "haziran":
   //    case "eylül":
   //    case "kasım":
   //        System.out.println("Girdiğiniz ay 30 gün'dür");
   //        break;
   //    case "subat":
   //        System.out.println("yılı giriniz: "  );
   //        int yıl=sc.nextInt();
   //        if (yıl%4==0) {
   //            System.out.println("girdiğiniz ay 29 gündür");
   //        }else
   //            System.out.println("girdiğiniz ay 28 gündür");
   //    default:
   //        System.out.println("lütfen doğru giriş yapınız");
   //        }

// Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
 //   Scanner sc=new Scanner(System.in);
 //   System.out.print("Lütfen Bir sayı Giriniz");
 //   int sayı=sc.nextInt();
 //   sayı/=10;
 //   sayı%=10;
 //   switch (sayı){
 //       case 0:
 //           System.out.println("Girilen Sayının ONlar Basamağı SIFIR dır");
 //           break;
 //       case 1:
 //           System.out.println("Girilen Sayının ONlar Basamağı BİR dir");
 //           break;
 //       case 2:
 //           System.out.println("Girilen Sayının ONlar Basamağı İKİ dir");
 //           break;
 //       case 3:
 //           System.out.println("Girilen Sayının ONlar Basamağı ÜÇ dür");
 //           break;
 //       case 4:
 //           System.out.println("Girilen Sayının ONlar Basamağı DÖRT dür");
 //           break;
 //       case 5:
 //           System.out.println("Girilen Sayının ONlar Basamağı BEŞ dir");
 //           break;
 //       case 6:
 //           System.out.println("Girilen Sayının ONlar Basamağı ALTI dır");
 //           break;
 //       case 7:
 //           System.out.println("Girilen Sayının ONlar Basamağı YEDİ dir");
 //           break;
 //       case 8:
 //           System.out.println("Girilen Sayının ONlar Basamağı SEKİZ dir");
 //           break;
 //       case 9 :
 //           System.out.println("Girilen Sayının ONlar Basamağı DOKUZ dur");
 //           break;
 //       default:
 //           System.out.println("Lütfen Doğru Giriş Yapınız");
 //   }

// Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
    // pazartesi hafta başlangıcı olarak alınızS
    Scanner sc=new Scanner(System.in);
    System.out.println();


    }

    }










    // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
    // pazartesi hafta başlangıcı olarak alınız







     /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

//  Scanner scan = new Scanner(System.in);
//      System.out.println("***** seyahat şirketimize hos geldiniz *****");
//      System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
//      System.out.print("yolculuk yapacagınız sehri seciniz : ");
//  String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi



