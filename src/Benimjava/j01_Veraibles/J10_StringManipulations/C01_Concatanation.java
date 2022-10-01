package Benimjava.j01_Veraibles.J10_StringManipulations;

public class C01_Concatanation {
    public static void main(String[] args) {
        /*
        concat() methodu içine(paremetre) aldığı strin veraible i çalıştırdığı string sonuna ekler.
        javada işlem yapılırken eğer en az bir veraible
         */
        String name="mustafa ";
        String meslek="QA tester ";
        System.out.println( name.concat(meslek)); //mustafa QA tester
        System.out.println(name);; // mustafa

        // Trick-->> String method'ları veraible gecici değişiklik yapar
        // ama değişken atama yapılırsa kalıcı değişir

        name=meslek.concat(name);
        System.out.println("name= "+name);     //QA tester mustafa
        System.out.println(name.concat(true + " :)"));   //QA tester mustafa true :)
        System.out.println(name.concat(100 + " :)"));    //QA tester mustafa 100 :)

        //Trick-->> koncat metodu parametre olarak strin type harici tüm dataları stringe cevirir


    }
}
