package J23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki toplamını print eden METHOD create ediniz

        int sayı1=46;
        int sayı2=78;
        int sayı3=27;
        int sayı4=10;
        topla(sayı1,sayı2);
        topla(sayı3,sayı4);
        topla(sayı1,sayı4);
        topla(sayı1,sayı2,sayı3);

        System.out.println("  ********  ");
        ToplaVarargs(sayı2,sayı1,sayı4,sayı3,sayı1);
        ToplaVarargs(sayı2,sayı1,sayı3,sayı4,sayı1);


        // Task -> verilen String'lerin en fazla karaktere sahip olanı print eden  METHOD create ediniz->> parametre saysı belirli değil : varargs

        enuzunKelime("aga","fatih","zeyyid");
        enuzunKelime("sümeyra","cebrail","ali");
    }//main sonu

    private static void enuzunKelime(String ... str) {
        String enuuzun="";
        for (String w:str){
            if (w.length()>enuuzun.length()){
                enuuzun=w;
            }
        }

    }

    public static void topla(int a,int b){  //bu method iki parametreli overload methoddur
        System.out.println("Sayılar Toplamı ="+(a+b));

    }
    public static void topla(int a,int b,int c){//bu method iki parametreli overload methoddur
        System.out.println("Sayılar Toplamı ="+(a+b));

    }
    public static void ToplaVarargs(int ... a){
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }
        System.out.println("Sayıların toplamı= ");
    }
}
