package J21_İmmutableClass;

public class C02_OCA_Equals {
    public static void main(String[] args) {
        String a = "";
        String c = "2cfalse";
        a += 2; //a="2";
        a += 'c';//a="2c";
        a += false;//a="2cfalse";
        System.out.println(a);
        String b = "2cfalse";
        System.out.println(b);

        if (a == "2cfalse") {  //sart saglamaz if çalışmaz  _> a referansı  "2cfalse" ataam olmadı gı için ref yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
        String x = "ali";
        String y = "ali";
        if (x == y) { //sart saglamaz if calısmaz ->  a referansı  "2cfalse" ataam olmadı gı için ref yok
            System.out.println("ahanda referansları aynı havuzda x ve y eşit ==");

            //tanımlanan atanan degeri a ile aynı havuzda ve ref olan b variable
            if (c == b) { //sart saglamaz if calısmaz ->  a referansı  "2cfalse" ataam olmadı gı için ref yok
                System.out.println("ahanda referansları aynı havuzda a ve b eşit ==");


            }

        }
    }
}

