package J32_Abstract.şekilörn2;

public class Cember extends sekil{
    private double yarıcap;
    private final double pi=3.14;

    public Cember(double yarıcap) {//p li cons
        this.yarıcap = yarıcap;
    }

    public double getYarıcap() {
        return yarıcap;
    }

    public void setYarıcap(double yarıcap) {
        this.yarıcap = yarıcap;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double alanhesapla() {
        return pi*this.yarıcap*this.yarıcap;
    }

    @Override
    public double cevrehesapla() {
        return 2*pi*this.yarıcap;
    }
}
