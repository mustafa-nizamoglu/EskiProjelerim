package JAVA.J26_Inheritance.inheritance02;

import JAVA.J26_Inheritance.inheritance01.Mammal;

public class kedi extends Mammal {//mammal parent class Mammal child-torun

    /*
    child class obj olmadan parents class veriable ve method'lara ulaşabilir
     */

    public kedi() {
        System.out.println("Agam ahanda KEDİ parametresiz cons... ");

    }
    public void cırmala(){
        System.out.println("kedi fena cırmalar miyavlar");
    }

    public void hareket() {
    }

    public void dogum() {
    }

    public void yeme() {
    }

    public void içme() {
    }
}
