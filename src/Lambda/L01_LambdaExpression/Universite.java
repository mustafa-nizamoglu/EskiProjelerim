package Lambda.L01_LambdaExpression;

public class Universite {
 private    String üniversite;
 private    String bolum;
 private    int ögrencisayısı;
 private  int notort;

    @Override
    public String toString() {
        return "üniversite{" +
                "üniversite='" + üniversite + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ögrencisayısı=" + ögrencisayısı +
                ", notort=" + notort +
                '}';
    }

    public String getÜniversite() {
        return üniversite;
    }

    public void setÜniversite(String üniversite) {
        this.üniversite = üniversite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getÖgrencisayısı() {
        return ögrencisayısı;
    }

    public void setÖgrencisayısı(int ögrencisayısı) {
        this.ögrencisayısı = ögrencisayısı;
    }

    public int getNotort() {
        return notort;
    }

    public void setNotort(int notort) {
        this.notort = notort;
    }
}
