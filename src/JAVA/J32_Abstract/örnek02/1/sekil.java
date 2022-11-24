package J32_Abstract.şekilörn2;

public abstract class sekil {

        private String name;
        public sekil(){

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double alanhesapla();
    public abstract double cevrehesapla();
  // public void ciz (){
  //     System.out.println(this.name+"isism giriniz");
  // }
  public String ciz (){
           return this.name+"çizildi ";
       }

    @Override
    public String toString() {
        return
                "sekil isim ="+this.name+'\''+
                        "\n sekil alan : "+this.alanhesapla()+ //meth call
                        "\n sekil cevre : "+this.cevrehesapla()+
                "\n sekil "+this.ciz();
    }
}
