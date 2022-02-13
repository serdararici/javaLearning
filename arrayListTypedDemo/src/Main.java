import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Sakarya");
        sehirler.add("Eskişehir");
        sehirler.add("Bursa");
        sehirler.add("Zonguldak");

        sehirler.remove("Istanbul");
        // sehirler.remove(1);
        Collections.sort(sehirler); //ArrayList içindeki verielri alfabetik olarak sıralar.

        for (String i : sehirler) {
            System.out.println(i);
        }
    }
}
