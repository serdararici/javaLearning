// import matematik.*;  // matematik paketindeki her şeyi import eder.
import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    System.out.print("Adınızı giriniz: ");
        String isim;
        isim = scanner.next();
        System.out.println("Hoş geldin " + isim);


        //packages
        DortIslem dortIslem=new DortIslem();
        int toplam = dortIslem.topla(5,3);
        System.out.println("Toplam: "+ toplam);

        Logaritma logaritma =new Logaritma();


    }
}
