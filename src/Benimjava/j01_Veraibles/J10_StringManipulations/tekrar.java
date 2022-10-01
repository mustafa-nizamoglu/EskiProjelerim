package Benimjava.j01_Veraibles.J10_StringManipulations;

import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {

     //  System.out.print("Lütfen Bir Cümle Giriniz :");
     //  Scanner sc=new Scanner(System.in);
     //  String cümle=sc.nextLine();
     //  System.out.println(cümle.length());
     //  System.out.println(cümle.substring(9));

        //>> verilen kelimein tersini yazdırma
  //      System.out.print("Lütfen Dört Harfli Kelime Giriniz :");
  //      Scanner sc=new Scanner(System.in);
  //      String kelime=sc.nextLine();
  //      if(kelime.length()==4){
  //          System.out.print(kelime.substring(kelime.length()-1));
  //          System.out.print(kelime.substring(2,3));
  //          System.out.print(kelime.substring(1,2));
  //          System.out.println(kelime.substring(0,1));
  //      }
  //      else{
  //          System.out.println("lütfen doğru giriş yapınız");
  //      }

        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false



         */
       /* String kelime="hacı mustafa nizamoglu";
        System.out.println(kelime.length());
        System.out.println(kelime.indexOf('a'));  //1
        System.out.println(kelime.indexOf('m'));  //5
        System.out.println(kelime.indexOf('n'));  //13
        System.out.println(kelime.indexOf('N'));  //-1

        System.out.println(kelime.lastIndexOf('a'));// 16
        System.out.println(kelime.lastIndexOf('m'));  //17
        System.out.println(kelime.lastIndexOf('n'));  //13
        System.out.println(kelime.lastIndexOf('N'));  //-1

        System.out.print("Lütfen bir cümle giriniz :");
        Scanner sc=new Scanner(System.in);
        String cümle=sc.nextLine().toLowerCase();
        if(cümle.indexOf("java")==-1){
            System.out.print("girilen cümlede java kelimesi yoktur :");
        } else if (cümle.indexOf("java")==cümle.lastIndexOf("java")) {
            System.out.println("girilen cümlede bir adet java kelimesi vardır");

        }else{
            System.out.println("girilen cümlede iki veya daha fazla java kelimesi vardır");
        }

*/
        String isim="Haci Mustafa ";
        String soyisim="Nizamoglu";
        String kartno="1234567891234567";
        String yeniİsim=isim.charAt(0)+isim.substring(1,isim.indexOf(" ")+1).replaceAll("\\w","*")
                +isim.charAt(isim.indexOf(" ")+1)+isim.substring(isim.indexOf(" ")+2).replaceAll("\\w","*");
        String yenisoyisim=soyisim.charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
       String yenikartno="**** **** **** "+kartno.substring(12);
        System.out.println("isim-soyisim: "+yeniİsim+yenisoyisim+" kartno: "+yenikartno);


    }
}
