public class Main {

    public static void main(String[] args) {

        // for loop
        for(int i=1;i<=10;i++){
            System.out.println((i));
        }
        System.out.println("For döngüsü Bitti");

        //while loop
        int i =1;
        while(i<10){
            System.out.println(i);
            i= i+2;
        }
        System.out.println("While döngüsü bitti");

        //do-while döngüsü
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While döngüsü bitti");
    }
}
