package J23_Varargs_StringBuilder.StringBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01_StringBuilder {
         /*
     String = > daha yavas ,Immutable==> degisemez,
     String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

     1) Java pass-by-value kullanir
     2) String Class'i immutable Class'dir.

      StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
      StringBuffer synchronized,thread safe.

     StringBuilders = mutable==>degisebilir ,
     not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

     1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
     StringBuilder isimli bir class uretmistir.
     2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer classi vardir.
     "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
     "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
     "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
     3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
     Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

        */

    public static void main(String[] args) {
        String str="JavaCAN";
        System.out.println("method öncesi str ="+str); //method öncesi str =JavaCAN
        strBirleştir(str); //str makyaja gitti
        System.out.println("method sonrası str ="+str);//method sonrası str =JavaCAN

        //Task-> 50000 tekrarlı bir loop ile String ve StringBuilder obj run time surelerini karsılastırın

       String str1="";
       StringBuilder sb1=new StringBuilder("");
       //String
        LocalTime str1start= LocalTime.now();
        System.out.println("str1start = " + str1start);
        for (int i=0; i<50000;i++){
            str1+=i;
        }
        LocalTime str1stop= LocalTime.now();
        System.out.println("str1stop = " + str1stop);

       //StringBuilder
        LocalTime sbstart= LocalTime.now();
        System.out.println("str1start = " + sbstart);
        for (int i=0; i<50000;i++){
           sb1.append(i);
        }
        LocalTime sbstop= LocalTime.now();
        System.out.println("str1stop = " + sbstop);

    }//main sonu
    public static void strBirleştir(String str){
        System.out.println(str+"merhaba");
    }
}
