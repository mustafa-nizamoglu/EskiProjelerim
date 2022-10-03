package Benimjava.j01_Veraibles.C11_MethodCreation;

import static Benimjava.j01_Veraibles.C11_MethodCreation.C04_MethodDepo.topla;

public class c04_MethodCreation {
    public static void main(String[] args) {
        String name="mustafa";

        C04_MethodDepo.gecmeNotu(24);// depo classtan name ile method call ettik
        C04_MethodDepo.topla(3,5);  //8
        C03_MethodOverloading.topla(35,63);

/*
farklı clastan method call etmek için
1-method static->gökteki güneş gibi
2-ClassName.mathodName () şeklinde call edilir
3-aynı class ta ise methodName()  ile call   edilir
 */
        selamVer();


    }
    public static void selamVer(){
        System.out.println("agam selamlar Devamke");
    }

}
