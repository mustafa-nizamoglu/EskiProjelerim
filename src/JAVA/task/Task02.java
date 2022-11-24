package task;

public class Task02 {
    public static void main(String[] args) {
        //"Alamanya" stringindeki ikinci 'a' caharacterinin indexini bulunuz

        String str="Alamanya";
        System.out.println(str.indexOf('a', str.indexOf('a') + 1)); //4
        // str.index0f('a')--> ilk anın index ini verir
        int sonuc = 75;

        if (sonuc >= 70)

            System.out.print("B");

        if (sonuc >= 60)

            System.out.print("C");

        else System.out.println("D");
    }
}
