package j22_DateTime;

import java.time.LocalTime;

public class C02LocalTime {
    public static void main(String[] args) {
        // LocalTime->> saat dakika saniye bilgisi tutar
        LocalTime suAn=LocalTime.now();
        System.out.println("suAn = " + suAn);   //suAn = 22:43:31.774238400
        System.out.println("suAn.getHour() = " + suAn.getHour());        //
        System.out.println("suAn.getMinute() = " + suAn.getMinute());    //
        System.out.println("suAn.getNano() = " + suAn.getNano());        //
        System.out.println("suAn.getSecond() = " + suAn.getSecond());    //





        //belirli bir zamanda ileri ve geri zamana gidilebilir
        LocalTime time1 = LocalTime.of(13,43,34);  //belirli bir saat dakika ve saniyesi olan bir zaman atandı
        System.out.println("time1 = " + time1);

        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90));
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150));
        System.out.println("time1.minusHours(23) = " + time1.minusHours(23));
        System.out.println("time1.minusMinutes(100).plusHours(2) = " + time1.minusMinutes(100).plusHours(2));
        LocalTime forBası=LocalTime.now();
        System.out.println("forBası.getNano() = " + forBası.getNano());  //forBası.getNano() = 722605300
        int sayı=0;
        for (int i=0; i<100000;i++){
            sayı+=i;

        }
        LocalTime forSonu=LocalTime.now();
        System.out.println("forSonu.getNano() = " + forSonu.getNano());//forSonu.getNano() = 724599800
        System.out.println((forSonu.getNano() - forBası.getNano())); // 1994500


    }
}
