package j10_StringManipulation;

public class C11_ValueOf_parse {
    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
      // Stringlerle matematiksel islemler yapabilmemizi saglar.

       //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
     //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        // Task-> strin type verilen iki adet bağış miktarını toplayan kod create ediniz

        String bagıs1="1500";
        String bagıs2="2500";
        int bagısDegeri1=Integer.valueOf(bagıs1);//bagıs string içindeki sayı degerini int'e cevirdi
        int bagısDegeri2=Integer.valueOf(bagıs2);
        System.out.println("Toplam bagıs degeri :"+(bagısDegeri1+bagısDegeri2)); // iki degeri topladı4000



        // ParseInt
        System.out.println((Integer.parseInt(bagıs1) + Integer.parseInt(bagıs2)));


        int tc=1234567;
        String str=String.valueOf(tc);
        System.out.println("str tc :"+str);  //1234567
        System.out.println("str tc+tc :"+str+tc);//12345671234567
        
        
        
        String fiyat="$150";
        int yenifiyat=Integer.valueOf(fiyat);
        //System.out.println("yenifiyat = " + yenifiyat);


    }
}
