package JAVA.J26_Inheritance.Task;

public class Runner {
      /*
  1)  A ve B isminde iki class creat ediniz.
  2) A parent B child ilişkisi kurunuz.
  3) A'da static initialize  edilmiş String bir  veriable creat ediniz.
  4) B de p'siz bir cons creat ediniz ve cons icinde A daki static veriable call ederek assingment yapınız
  5) Bir runner class creat edip her iki class dan obj üreterek veriable print ediniz.
     */
      public static void main(String[] args) {
          A a=new A();
          System.out.println("a.mesaj = " + a.mesaj);//a.mesaj = static veriable inheritance de ClassNme olmadan call edilir
          B b=new B();
          System.out.println("a.mesaj = " + a.mesaj);//a.mesaj = static veriable inheritance de ClassNme olmadan call edilir
          System.out.println("b.mesaj = " + b.mesaj);//b.mesaj = static veriable inheritance de ClassNme olmadan call edilir

      }




}
