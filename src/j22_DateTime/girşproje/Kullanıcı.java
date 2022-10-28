package j22_DateTime;

import java.time.LocalDateTime;
//Task-->1. step
public class Kullanıcı {//kullanıcı objesi uretecek  kalıphane class--main olmaz
    String name;                      // obj deger alacak inst. veriable
    LocalDateTime KayıtZamanı;        //obj deger alacak inst. veriable

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//full parametreli teleskopik consracter
        this.name = name;
        this.KayıtZamanı = kayıtZamanı;
    }

    public String toString() {  //bu classtan
        return
                "name= " + name + '\'' +
                        ",kayıtZamanı= " + KayıtZamanı;
    }
}