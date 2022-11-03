package J26_Inheritance.inheritance01;

public class Runner {
    /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    public static void main(String[] args) {
        Hayvancık hyvn=new Hayvancık();
        hyvn.hareket();
        hyvn.içme();
        hyvn.yeme();
        System.out.println("    ***   ");

        Mammal m1=new Mammal();
        m1.sütbesleme();
        m1.dogum();
        m1.içme();   //parent Hayvancık class
        m1.yeme();    //parent Hayvancık class
        m1.hareket();  //parent Hayvancık class

        System.out.println("    ******      ");


        Kedi pisi=new Kedi();
        pisi.cırmala();
        pisi.hareket(); //grand parent Hayvancık class
        pisi.içme();  //grand parent Hayvancık class
        pisi.yeme(); //grand parent Hayvancık class
        pisi.dogum();//parent Hayvancık class
        pisi.sütbesleme();//parent Hayvancık class


        System.out.println("     ******     ");

        Balık hms=new Balık();
        hms.ızgaraTava();
        hms.içme();         //grand parent Hayvancık class
        hms.hareket();      //grand parent Hayvancık class
        hms.yeme();         //grand parent Hayvancık class


        System.out.println("    ****     ");

        Koyun ky=new Koyun();
        ky.semir();
        ky.hareket();
        ky.içme();
        ky.yeme();
        ky.dogum();
        ky.sütbesleme();





    }
}
