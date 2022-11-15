package J33_Interface;

public interface dısdonanım {
    public  void kapı();//abs meth

    void kaporta();//abs meth

    String RENK="opak kırmızı";//static public final variable

    public default String sislamp(){//default conc meth
        return"siisli havada dikkat et";
    }
    static void anten (){//static conc method
        System.out.println("yine antin kuntin işlerdesin :) ");
    }

   // dısdonanım obj=new dısdonanım();// con not be instantıoned ->> odj olmaz o-la-maz

    public static void main(String[] args) {//

        System.out.println("renk = " + RENK);
        anten();




    }


}
