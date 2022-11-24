package J25_Encapsulation.encap;

public class C02_Encapsulution {
    private String name = "Gamze Hanım";
    private int id=1001;

    public C02_Encapsulution() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public C02_Encapsulution(String name, int id) {
        this.name = name;
        this.id = id;
    }
//   public  String isimver(){//getter method
//       return  name;
//   }
//   public  int idver(){//getter method
//       return id;
//   }
//   public void isimdegis(String isim){
//       this.name=isim;
//   }

//   @Override
//   public String toString() {
//       return
//               "name='" + name + '\'' +
//                       ", id=" + id ;
//   }
}


















