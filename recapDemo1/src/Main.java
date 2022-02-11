public class Main {

    public static void main(String[] args) {

        int sayi1 = 60;
        int sayi2 = 45;
        int sayi3 = 7;

        /*if(sayi1>sayi2&&sayi1>sayi3)
        {
            System.out.println("En Büyük =  sayi1");
        }
        else if(sayi2>sayi1 && sayi2>sayi3){
            System.out.println("En Büyük =  sayi2");
        }
        else{
            System.out.println("En Büyük = sayi3");
        }
        */

        int enbuyuk = sayi1;
        if(enbuyuk<sayi2)
        {
            enbuyuk = sayi2;
        }
        if(enbuyuk<sayi3){
            enbuyuk = sayi3;
        }
        System.out.println("En Büyük = "+enbuyuk);

    }
}
