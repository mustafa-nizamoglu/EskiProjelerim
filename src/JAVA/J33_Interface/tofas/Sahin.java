package J33_Interface;

public class Sahin extends Tofas implements dısdonanım,içdonanım,lastik{//conc child extends ->tofas
    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");

    }

    @Override
    public void yakıt() {
        System.out.println("agam tup tak batırmasın seni");

    }

    @Override
    public void kapı() {
        System.out.println("agam dört kapı sedan ");

    }

    @Override
    public void kaporta() {
        System.out.println("agam akrdion kaporta");

    }

    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk pişik yapar içi saman olmasın");

    }

    @Override
    public void klima() {
        System.out.println("agam klima senin neyine aç camı serinle");

    }

    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat");

    }

    @Override
    public void jant() {
        System.out.println("agam senin gibi çelik jant ");

    }

}
