package J33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin dgshn=new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapı();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.koltuk();
        dgshn.motor();
        System.out.println("dgshn.sislamp()"+dgshn.sislamp());
        dgshn.sunroof();
        dgshn.yakıt();

        System.out.println("dısdonanım.RENK = " + dısdonanım.RENK);
        System.out.println("içdonanım.RENK = " + içdonanım.RENK);
        System.out.println("lastik.RENK = " + lastik.RENK);
        //System.out.println("Lastik.RENK = " + RENK);-> aynı isimli variable interface name ile call edilir
        // icDonanım.KUMAS="deri";-> CTE final variable atama ya-pıl-mazzz.
        System.out.println("icDonanım.KUMAS = " + içdonanım.KUMAS);
        System.out.println("icDonanım.MUSIC = " + içdonanım.MUSİC);
        dısdonanım.anten();//static conc meth Interface name .call

    }
}
