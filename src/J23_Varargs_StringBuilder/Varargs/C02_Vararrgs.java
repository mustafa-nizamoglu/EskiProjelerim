package J23_Varargs_StringBuilder.Varargs;

public class C02_Vararrgs {
    public static void main(String[] args) {
        /*
        arr ve varargs method
         */

        int arr []={24,42,33,19,34,45,58,38};

        //Task1-> array elemanları tolamı prınt eden method create ediniz
        //Task2-> array elemanları tolamı prınt eden method create ediniz

        System.out.println("arrTopla(arr) = " + arrTopla(arr));           //293
        System.out.println("varargs tolam :"+VarargsTopla(24, 42, 33, 19, 34, 45, 58, 38));//293
        System.out.println("varargs tolam :"+VarargsTopla(arr));          //293

// TRİCK->> varargs method parametleri array gibi tanımladıgı için varargs method a parametre
// olarak array da verilebilir

    }//main sonu
    public static int arrTopla(int [] a){//task1
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }

        return toplam;

    }
    public static int VarargsTopla(int ... b){//task 2
        int toplam=0;
        for (int s:b){
            toplam+=s;
        }


        return toplam;
    }
}
