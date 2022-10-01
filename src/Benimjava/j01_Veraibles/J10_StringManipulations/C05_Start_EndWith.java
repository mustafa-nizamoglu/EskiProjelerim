package Benimjava.j01_Veraibles.J10_StringManipulations;

public class C05_Start_EndWith {

    public static void main(String[] args) {
/*
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *  String'in basladigi characteri dogrular
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */

        String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));  //turue

        System.out.println(sehir.startsWith("is"));  //turue

        System.out.println(sehir.startsWith("s"));   //false

        System.out.println(sehir.startsWith("a", 3));  // turue  3. index den itibaren index a ile mi başlar

        System.out.println(sehir.startsWith("t", 3));  // False  3. index den itibaren index a ile mi başlar


        System.out.println(sehir.endsWith("l"));     //turue
        System.out.println(sehir.endsWith("bul"));   //trurue
        System.out.println(sehir.endsWith("bu"));    //false

        String str="bul";
        System.out.println(sehir.endsWith(str));  //turue
        int yas=38;
        //System.out.println(sehir.endsWith(yas)); // cte

        //Task -->> girilen e mail hesabının gmail.com içermiyorsa lütfen gmail hesabı giriniz"
        // gmail.com ile bitiyorsa "hesabınız onaylandı"aksi durum da "gecerli hesap giriniz " print eden end code creat ediniz




    }
}
