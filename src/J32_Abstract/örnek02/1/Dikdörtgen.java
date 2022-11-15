package J32_Abstract.şekilörn2;

public class Dikdörtgen extends sekil {
    private double uzunkenar;
    private double kısakenar;

    public Dikdörtgen(double uzunkenar, double kısakenar) {
        this.uzunkenar = uzunkenar;
        this.kısakenar = kısakenar;
    }

    @Override
    public double alanhesapla() {
        return this.uzunkenar*this.kısakenar;
    }

    @Override
    public double cevrehesapla() {
        return (this.uzunkenar+this.kısakenar)*2;
    }
}
