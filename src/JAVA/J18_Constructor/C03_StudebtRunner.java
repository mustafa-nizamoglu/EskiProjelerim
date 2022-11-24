package J18_Constructor;

public class C03_StudebtRunner {
    public static void main(String[] args) {
        C03_Student ogrc1=new C03_Student();
        ogrc1.ad="mustafa" ;
        ogrc1.soyad="nizamoglu";
        ogrc1.sınıf=5;
        ogrc1.okulno=279;
        ogrc1.ortalama=98;
        ogrc1.takdir=true;

        System.out.println("ogrc1 = " + ogrc1); //ogrc1 = J18_Constructor.C03_Student@5f2050f6

        System.out.println(ogrc1.ad+" "+ogrc1.soyad+" "+ogrc1.okulno+" "+ogrc1.sınıf+" "+ogrc1.ortalama+" "+ogrc1.takdir); //mustafa nizamoglu 279 5 98.0 true

        ogrc1.mezuniyet();//Diplomanız hayırlı olsun
        
        // task->> diger bir ögrenci obj ile tum field ları atayıp print ediniz 
        C03_Student ogrc2=new C03_Student();
        ogrc2.ad="mustafa" ;
        ogrc2.soyad="nizamoglu";
        ogrc2.sınıf=5;
        ogrc2.okulno=279;
        ogrc2.ortalama=98;
        ogrc2.takdir=true;
        ogrc2.devamsızlık=10;
        System.out.println("ogrc2 = " + ogrc2);  //ogrc2 = {ad='mustafa', soyad='nizamoglu', sınıf=5, ortalama=98.0, okulno=279, takdir=true}
        ogrc2.devamsızlık();  //Karne almaya hakkazandınız
        ogrc2.mezuniyet();//Diplomanız hayırlı olsun



    }
}
