package J26_Inheritance.inheritance01;

public class Kedi extends Mammal{//mammal parent class Mammal child-torun

    /*
    child class obj olmadan parents class veriable ve method'lara ulaşabilir
     */

    public Kedi() {
        System.out.println("Agam ahanda KEDİ parametresiz cons... ");

    }
    public void cırmala(){
        System.out.println("kedi fena cırmalar miyavlar");
    }
}
