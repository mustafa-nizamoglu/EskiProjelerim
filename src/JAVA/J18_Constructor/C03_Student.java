package J18_Constructor;

public class C03_Student {  //main olmayan sadece student obj cretae etmek için pojo-> plan old java object : obj için standart class kalıphane
    //fields
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulno;
    boolean takdir;
    double devamsızlık;
    public  void mezuniyet(){  //method
        if (ortalama>=50){
            System.out.println("Diplomanız hayırlı olsun");
        }
        else System.out.println("Okulu bitiremediniz");
    }
    public  void  devamsızlık(){
        if (devamsızlık<20){
            System.out.println("Karne almaya hakkazandınız ");
        }else System.out.println("Devamsızlıktan sınıfta kaldınız");
    }

    @Override
    public String toString() {
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulno=" + okulno +
                ", takdir=" + takdir +
                '}';
    }
}
