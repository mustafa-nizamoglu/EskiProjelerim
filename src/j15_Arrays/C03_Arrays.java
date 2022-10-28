package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        //String' i array'e cevirme...split() -> girilen parametre degere göre String ifade parçalanır

        String str="javaCAN'lara selam olsun. en kısa zamanda bolcana offer sonrası TUZLABALIK :)";

        // TASK-> string ifadeyi kelime sayısını print eden code create ediniz
       String strArr[]= str.split(" ") ; // str her " " karektere göre parçalar
                                              //   her bir parça strArr2in bir elemanı
        System.out.println(Arrays.toString(strArr)); //[javaCAN'lara, selam, olsun., en, kısa, zamanda, bolcana, offer, sonrası, TUZLABALIK]
        System.out.println(strArr.length);

        // TASK-> string ifadeyi harf  sayısını print eden code create ediniz
        String harfArr[]=str.split("");
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);











    }
}
