package J23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        //StringBuilder obj create etme...

        //1. Yol
        StringBuilder sb1=new StringBuilder();//default capacity 16 bit olan value'su olmayan bos

        System.out.println("sb1.length() = " + sb1.length());  //sb1.length() = 0  sb deki karakter sayısını return eder
        System.out.println("sb1.capacity() = " + sb1.capacity()); //sb1.capacity() = 16

        sb1.append("JAVATAR");    //jaavtar sb1 e eklendi
        System.out.println("sb1 = " + sb1);  //sb1 = JAVATAR
        System.out.println("sb1.capacity() = " + sb1.capacity()); //sb1.capacity() = 16

        sb1.append("selam").append(" olsun").append(" ").append(46).append(" ").append(true);
        System.out.println("sb1 = " + sb1);  //sb1 = JAVATARselam olsun 46 true

        System.out.println("sb1.length() = " + sb1.length()); //sb1.length() = 26

        System.out.println("sb1.capacity() = " + sb1.capacity()); //sb1.capacity() = 34
        sb1.append(" basarı gayrete asıktır :)");

        System.out.println("sb1 = " + sb1);   //sb1 = JAVATARselam olsun 46 true basarı gayrete asıktır :)
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 70

    }//main sonu
}
