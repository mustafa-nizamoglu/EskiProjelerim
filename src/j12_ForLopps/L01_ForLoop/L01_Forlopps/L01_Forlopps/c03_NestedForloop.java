package j12_ForLopps.L01_ForLoop.L01_Forlopps.L01_Forlopps;

public class c03_NestedForloop {
    public static void main(String[] args) {
        /*eger bir döngünün bady sinde baska bir döngü bulunuyorsa butür döngülere nested (iç içe )döngü denir
        iç döngü dış döngünün her adımında tekrar çalısır
        iç içe döngülerde en içteki dömngü en önce çalışır
         */

        for (int apt=1;apt<=10;apt++){  //dış döngü
            System.out.println("Apatman Döngü : "+apt);

            for (int daire=1;daire<6;daire++){//iç döngü
                System.out.println("Apartman "+apt+" için Daire döngü :"+daire);
            }
        }











    }
}
