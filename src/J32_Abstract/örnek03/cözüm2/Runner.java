package J32_Abstract.örnek03.cözüm2;

public class Runner {
    public static void main(String[] args) {
        Baklava b=new Baklava();
        b.madein();//baklava
        b.teste();//good sugar sweet
        System.out.println("b = " + b);

        Sezarsalad ss=new Sezarsalad();
        ss.madeIn();
        ss.taste();
        System.out.println("ss = " + ss);

    }
}
