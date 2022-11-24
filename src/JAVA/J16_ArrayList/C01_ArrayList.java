package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.

    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */

        ArrayList<Integer> Listsayı=new ArrayList<>();  // boş integer type list oluşturuldu
        //1. yol
        System.out.println("listSayi :"+Listsayı);
        Listsayı.add(10);  // list ilk eleman olarak eklendi
        System.out.println("listSayi :"+Listsayı);
        Listsayı.add(39);
        Listsayı.add(72);
        Listsayı.add(61);
        Listsayı.add(41);
        Listsayı.add(41);   // list eleman tekrarını kabul eder
        System.out.println("listSayi :"+Listsayı);   //listSayi :[10, 39, 72, 61, 41, 41]

        //2. yol Arrays.asList(); method
        ArrayList<String> ListIsim=new ArrayList<>(Arrays.asList("muharrem","nur","Enise","mustafa"));
        System.out.println("ListIsim:"+ListIsim);

        //3. yol ->> List.of(); method
        ArrayList<String> ListÜlke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","İsveç"));
        System.out.println("ListÜlke = " + ListÜlke);
        Listsayı.add(2,14);// List de index 2 'ye 14 degerini ekledi 2. index deki eski eleman bir index ileriye kaydırıldı
        System.out.println("Listsayı = " + Listsayı);  //Listsayı = [10, 39, 14, 72, 61, 41, 41]













    }
}
