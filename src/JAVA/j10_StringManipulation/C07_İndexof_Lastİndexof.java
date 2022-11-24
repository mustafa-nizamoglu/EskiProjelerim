package j10_StringManipulation;

import java.util.Scanner;

public class C07_İndexof_Lastİndexof {
    public static void main(String[] args) {
        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
      //  String str="good of school";
//
      //  System.out.println("ilk girilen onun yeri index nosu " + str.indexOf('o'));//1
      //  System.out.println(" d nin yeri index nosu " + str.indexOf('d'));  //3
      //  System.out.println(" d nin yeri index nosu " + str.indexOf('D'));  //-1
      //  //Trick-->> olmayan karakter index i sorgulanırsa edilirse -1 return eder
//
      //  System.out.println(" od nin yeri index nosu " + str.indexOf("od")); //2
      //  System.out.println(" Od nin yeri index nosu " + str.indexOf("Od")); //-1

/** lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */


        String isim="mustafa nizamoğlu";
        System.out.println(" a nin yeri index nosu " + isim.lastIndexOf('a')); //11
        System.out.println(" fa nin yeri index nosu " + isim.lastIndexOf("fa")); //11

/*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */

        Scanner sc=new Scanner(System.in);
        System.out.println("kafi miktarda bir cümle giriniz");
        String cumle=sc.nextLine().toLowerCase();

        if(cumle.indexOf("java")==-1){
            System.out.println("Girilen cumle java içermiyor");
        } else if (cumle.indexOf("java")==cumle.lastIndexOf("java")) {
            System.out.println("Girilen cumlede 1 tane java içeriyor");

        }else
            System.out.println("Girilen cumlede 1 den fazla java içeriyor");


    }
}
