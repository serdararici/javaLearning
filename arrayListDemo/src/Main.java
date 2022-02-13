import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println(sayilar.size()); //ArrayList boyutunu gösteriri.

        sayilar.set(0,100); // ArrayList içindeki verileri değiştirmek için
        System.out.println(sayilar.get(0)); //ArrayList içindeki elemanları getirir.
        // sayilar.remove(2); //ArrayList içindeki verilen indexteki veriyi siler.
        // sayilar.clear(); //ArrayList içindeki tüm elemanları siler.

        for(Object i : sayilar ){
            System.out.println(i);
        }
    }
}
