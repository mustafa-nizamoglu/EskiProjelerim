package J23_Varargs_StringBuilder.Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.
input : "m", "e", "r", "v", "e";
output : merve
 */
        String str1[]={"m", "e", "r", "v", "e"};
        String str2[]={"a", "l", "i"};

strbirleştir(str1);// merve
strbirleştir(str2);//ali
strbirleştir("JavaCAN","mustafa","haluk");//JavaCANmustafahaluk







    }//main sonu
    public static void  strbirleştir(String... str){
        String birlesnstr="";
        for (String w:str){
           birlesnstr= birlesnstr.concat(w);
        }
        System.out.println("birlesnstr = " + birlesnstr);


    }
}
