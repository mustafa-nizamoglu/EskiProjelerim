package J18_Constructor;

public class C02_Arac {
    String marka;
    String model;
    int km=10;
    double motorHacim;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;

    @Override
    public String toString() {  //tum obj field print edilir
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';
    }

    public static void main(String[] args) {
        C02_Arac arac1=new C02_Arac();   //default cons ile arac1 obj create edildi
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHacim=2.4;
        //                   volvo           xc60          50000          default          true                2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl+" "+arac1.motorHacim);

        System.out.println("arac1 = " + arac1); //arac1 = C02_Arac{marka='volvo', model='xc60', km=50000, motorHacim=2.4, vitesAuto=false, ikinciEl=true, yıl=0}


        //Task
        C02_Arac arac2=new C02_Arac();
        arac2.ikinciEl=false;
        arac2.marka="AUDİ";
        arac2.km=0;
        arac2.model="Q5";
        arac2.motorHacim=3.0;
        arac2.yıl=2022;
        arac2.vitesAuto=true;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac1.km+" "+arac2.yıl+" "+arac2.ikinciEl+" "+arac2.motorHacim+" "+arac2.vitesAuto);

        System.out.println("arac2 = " + arac2);  //arac2 = C02_Arac{marka='AUDİ', model='Q5', km=0, motorHacim=3.0, vitesAuto=true, ikinciEl=false, yıl=2022}














    }
}
