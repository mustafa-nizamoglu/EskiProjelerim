package j36_Map;

public class Kartvizit {

    String isim;
    String email;
    String adres;
    String telefon;
    int id=100;

    public Kartvizit(String enise, String s, String google_company, String s1) {
    }

    public void Task02_Kartvizit(String isim, String email, String adres, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
        this.id++;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        ", email='" + email + '\'' +
                        ", adres='" + adres + '\'' +
                        ", telefon='" + telefon + '\'' ;
    }
}