package sk.sosholic.prvypolrok.uvod.vynimky;
import java.util.Scanner;

public class DomacaUloha {
    public static void main(String[] args) {

        metodaKdeJeChyba(" Janko Hrasko",5);
        metodaKdeJeChyba(" Janko Hrasko",50);

    }

    public static void metodaKdeJeChyba(String meno, int pozicia) {
        //osetri program pomocou try catch tak aby bola chyba osetrena.
        try {
            char myChar = meno.charAt(pozicia);
            System.out.println("charakter na pozicii " + pozicia + " je " + myChar);
        }catch(Exception ex)
        {
            System.out.println("chyba je "+ ex.toString());
        }

        // toto sa musi zobrazit vzdy aj ked bude chyba alebo chyba nebude
        System.out.println(" ak toto vyriesim mam jednotku");
    }

}

class DomacaUloha2 {

    public static void main(String[] args) {
        //osetri program pomocou try catch tak aby bola chyba osetrena.
        Scanner scanner = new Scanner(System.in);
        System.out.println(" zadaj pismeno. PS> pri pismene program nahlasi chybu: ");
        try {
            int cislo = scanner.nextInt();
            System.out.println("zadane cislo je" + cislo);
        }catch (Exception ex ){
            System.out.println("chyba je "+ex.toString());
        }
        // toto sa musi zobrazit vzdy aj ked bude chyba alebo chyba nebude
        System.out.println(" ak toto vyriesim mam jednotku");
    }


}


