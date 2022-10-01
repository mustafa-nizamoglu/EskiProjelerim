package task;

import java.util.Scanner;

public class ödev27092022 {
    public static void main(String[] args) {
          /*  I love java olan bir String oluşturun.
            Bu cümlenin toplam karakter sayısını yazdırın.

           */
        String a = "I love java";
        System.out.println(a.length());

        /*    Sprint planning olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.
           */
        String b = "Aprint planning";
        System.out.println(b.length());

         /*    paper olan bir String oluşturun.
          String'i büyük harfe çevirin ve yazdırın.
          örn: apple > APPLE   */
        String c = "apple";
        System.out.println(c.toUpperCase());

         /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */
        String OraNge = "APPLE";
        System.out.println(OraNge.toLowerCase());

          /*  New Jersey olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın  */

        String d = "New Jersey";
        System.out.println(d.toUpperCase());

         /*  New York olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        String e = "New York";
        System.out.println(e.toLowerCase());

         /*  PADDLE olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */
        String f = "PADDLE";
        System.out.println(f.toLowerCase());

         /*  apple olan bir String oluşturun.
            String'in içinde app olup olmadığını doğrula.   */

        String g = "apple";
        System.out.println(g.contains("app"));      //true

       /*  apple kelimesinden  oluşan bir String yaz.
        String'in içinde App olup olmadığını doğrula.  */

        String h = "apple";
        System.out.println(h.contains("App"));  //false


         /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */

        String k = "orange";
        System.out.println(k.equals("Apple"));  //false

         /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        String l = "apple";
        System.out.println(l.equals("apple"));  //true

          /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        String m = "Florida";
        System.out.println(m.indexOf('o'));   //2

        /*  Thank you olan bir String oluşturun.
            Thank you içindeki, sadece  'y' harfinin bulunduğu konumu yazdırın.
            // Thank you Stringini oluşturun.  */

        String n = "Thank you";
        System.out.println(n.indexOf('y'));    //6

           /*  String s1 = "      Clarus  Way          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        String s1 = "      Clarus  Way          ";
        System.out.println(s1.trim());   //

        /* Main method oluşturun.
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */

        String o = "Mouse";
        System.out.println(o.charAt(2));  // u

        /*  String s1 = "    Chocolade     ";
            s1 String'inin başındaki ve sonundaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        String s2 = "    Chocolade     ";
        System.out.println(s2.trim());   //Chocolade

        // Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cümle giriniz = "); //
        String text = scan.nextLine();
        System.out.println(text.contains(" "));

        //boolean boslukVarMi = text.contains(" ");

        //System.out.println("boslukvarmı = " + boslukVarMi); //boslukvarmı = true

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.next();

        //if ile
        System.out.println("   ***   if statement   ***   ");
        String s3 = isim.substring(0, 1);
        String s4 = isim.substring(1, 2);
        String s5 = isim.substring(2, 3);
        if (isim.length() == 3) {
            if (!s3.equals(s4) && !s3.equals(s5) && !s4.equals(s5)) {
                System.out.println("Girdiginiz isim 3 harfli ve unique karakterle sahip");
            } else System.out.println("Girdiginiz isim 3 harfli ancak unique karakterle sahip degil");

        } else System.out.println("Girdiginiz isim 3 harfli değil");
        //Ternary ile
        System.out.println("   ***   ternary   ***   ");
        char c1 = isim.charAt(0);
        char c2 = isim.charAt(1);
        char c3 = isim.charAt(2);

        String result = isim.length() == 3 ? ((c1 != c2 & c1 != c3 && c2 != c3) ? "Girdiginiz isim 3 harfli ve unique karakterle sahip"
                : "Girdiginiz isim 3 harfli ancak unique karakterle sahip degil ") : "Girdiginiz isim 3 harfli değil";

        System.out.println(result);

         /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("adınızı ve soyadınızı giriniz : ");
        String adsoyad = sc.nextLine();
        adsoyad = adsoyad.trim();

        if (adsoyad.contains(" ") && adsoyad.indexOf(" ") == adsoyad.lastIndexOf(" ")) {
            String ad = adsoyad.substring(0, adsoyad.indexOf(" "));
            String soyad = adsoyad.substring(adsoyad.indexOf(" ") + 1);
            System.out.println("Adı: " + ad + "\nSoyadı: " + soyad);
        } else System.out.println("Hatalı giriş yaptınız.");



         /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */



        System.out.println("3 kelimeden oluşan bir isim giriniz : ");
        String isim1 = sc.nextLine().toUpperCase().trim();

        if (isim.indexOf(' ') != isim.lastIndexOf(' ')) {
            String kısaltma = isim.charAt(0) + "." + isim.charAt(isim.indexOf(' ') + 1) + "." + isim.charAt(isim.lastIndexOf(' ') + 1);
            System.out.println(kısaltma);


        }
    }
}
