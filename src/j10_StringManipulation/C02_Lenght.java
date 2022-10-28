package Benimjava.j01_Veraibles.J10_StringManipulations;

public class C02_Lenght {
    public static void main(String[] args) {
        /*
        lenght () metodu girilen string in
         */
        String str="madem geldin dünyaya otur çalış javaya";
        int strkrtrSayısı=str.length();  //int type data verir
        System.out.println(str);   //madem geldin dünyaya otur çalış javaya

        System.out.println(strkrtrSayısı);//38

        System.out.println(str.length()); //38
        String str1="";
        System.out.println(str1.length());  //0
        String str2=" ";
        System.out.println(str2.length());  //1

        String str3=null;
        str3.concat(str1);
        System.out.println(str3.length()); // hata verir (run tim error  verir)


        //Trick -->>null atanan stringler String method çalışmaz cısss
        /*
        null case sensitive dir yani Null veya NULL yazılmaz
        null bir değer değildir(dutluk) sadece hiçliği gösteren bir pointer (giriş işareti)
         */


        String name; // deklare edilmiş atanmamiş String method çalışmaz CTE verir
        //name.concat(str1);














    }
}
