package J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
       /* TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
        Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
        aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("ehliyetiniz var mı /n EVET için--> /n E  HAYIR için--> H /n giriniz");
        char ehliyet = sc.next().charAt(0);
        if (ehliyet == 'E'|| ehliyet=='e') {     //ehliyetin var olması kontrol edildi
            System.out.println("yıl tecrübesi yazınız : ");
            int yılTecrübe = sc.nextInt();

            if (yılTecrübe >= 7) {    //tecrübenin 7 yıl ve üzeri olması konrol edildi
                System.out.print("aldığınız mesafeyi giriniz");
                int mesafe = sc.nextInt();

                if (mesafe > 100000) { //mesafe 10000 km den buyuk olması kontrol edildi
                    System.out.println("tebrikler USTA soforsünüz :) ");
                } else                            //mesafe kontrol edildi
                    System.out.println("USTA sofor olmanız için " + (100000 - mesafe) + " km masafe yapmanız  lazım");

            } else              //tecrübe kontrol edildi
                System.out.println("USTA sofor olmanız için : " + (7 - yılTecrübe) + " yıl daha var");

        } else if (ehliyet == 'H'||ehliyet=='h') {  //ehliyetin olmaması kontrol edildi
            System.out.println("Agam önce bir ehliyet al sonra kontak anahtarı sor :( ");
        } else System.out.println("Agam önce adam gibi karajkter gir ");
    }
}