package J23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {
/*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */
        int sayi = 5;
        String str1 = "mustafa";
        String str2 = "ugur";
        String str3 = "ebikgabık";

carpString(sayi,str1,str2,"selamJAVACAN",str3);
    }//main sonu

    public static void carpString(int çarpacak, String ... str) {
        String enUzun="";
        for(String avuc : str) {
            if(avuc.length()>enUzun.length()){
                enUzun=avuc;
            }
        }
        System.out.println(çarpacak*enUzun.length()+" "+enUzun);
    }
}