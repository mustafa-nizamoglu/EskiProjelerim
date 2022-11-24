package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece=LocalTime.of(23,17);
        LocalTime öglen=LocalTime.of(13,24);

        Duration fark=Duration.between(gece,öglen);   //öglen zamanı ile gece zamanı arasındakı zaman farkı atandı
        System.out.println("fark = " + fark);        //fark = PT13H7M

        System.out.println("fark.getSeconds() = " + fark.getSeconds());   //fark.getSeconds() = 47220    fark bilgisindeki saniye datası alaındı
        System.out.println("fark.getNano() = " + fark.getNano());         //fark.getNano() = 0
        System.out.println("fark.toHours() = " + fark.toHours());         //fark.toHours() = 13
        System.out.println("fark.toMinutes() = " + fark.toMinutes());     //fark.toMinutes() = 787       fark bilgisi dakikaya cevrildi
        System.out.println("fark.toMillis() = " + fark.toMillis());       //fark.toMillis() = 47220000


    }
}
