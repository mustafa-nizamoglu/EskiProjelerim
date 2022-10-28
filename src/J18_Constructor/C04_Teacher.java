package J18_Constructor;

public class C04_Teacher {
    String ad;
    String soyad;
    String branş;
    int tecrübe;
    double maaş;
    int id;
    boolean emekli;

    public C04_Teacher() {  //parametreli default cons
    }

    //Trick  ->> parametreli cons parametresiz cons u ezer
    public C04_Teacher(String ad, String soyad, String branş, int tecrübe, double maaş, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
        this.tecrübe = tecrübe;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", tecrübe=" + tecrübe +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }

    public  void dersSaati(){
        System.out.println("Ögretmenim hafatada 20 saatin üzeri ekders");

    }
}
