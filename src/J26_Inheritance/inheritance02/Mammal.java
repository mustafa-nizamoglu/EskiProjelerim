package J26_Inheritance.inheritance01;

public class Mammal extends Hayvancık{//hayvancık parents class ın child class-baba
    public Mammal() {//p. mesiz  cons
        System.out.println("agam ahan da mammal prametsiz cons.");

    }
    public void sütbesleme(){
        System.out.println("beleri SÜT ile beslenir...");
    }
    public void dogum(){
        System.out.println("nur topu gibi yavrusu olur");
    }
}
