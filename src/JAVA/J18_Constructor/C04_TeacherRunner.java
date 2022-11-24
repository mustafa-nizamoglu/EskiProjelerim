package J18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {
        C04_Teacher ögretmen1=new C04_Teacher(); //ögretmen obj create edildi
        
        ögretmen1.ad="mustafa";
        ögretmen1.soyad="nizamoglu";
        ögretmen1.branş="QA";
        ögretmen1.emekli=false;
        ögretmen1.maaş=23000;
        ögretmen1.tecrübe=14;
        ögretmen1.dersSaati();
        System.out.println("ögretmen1 = " + ögretmen1);
        
        
        C04_Teacher ögretmen2=new C04_Teacher("mustafa","javacan","dev",15,100000,333,false);  //parametreli cons
        System.out.println("ögretmen2 = " + ögretmen2);//ögretmen2 = C04_Teacher{ad='mustafa', soyad='javacan', branş='dev', tecrübe=15, maaş=100000.0, id=333, emekli=false}
    }
}
