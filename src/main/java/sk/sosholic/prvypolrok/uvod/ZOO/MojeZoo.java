package sk.sosholic.prvypolrok.uvod.ZOO;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MojeZoo {

    private static Object Chovatel;
    private static String Odisť;

    public static void main(String[] args) {
        String nazovZoo;
        Chovatel mojChovatel  ;
        Scanner scanner = new Scanner(System.in);
        boolean exit= false;
           
        System.out.println("Toto je moje Zoo");
        System.out.println("Zadaj meno Zoo:");
        nazovZoo = scanner.nextLine();
        System.out.println("Zadaj meno Chovatela:");
        String meno = scanner.nextLine();
        mojChovatel = new Chovatel(meno);
        Zviera sakal = new Zviera("sakal",200);
        Zviera kun = new Zviera("kun", 1000);
        mojChovatel.pridatZviera(kun);
        mojChovatel.pridatZviera(sakal);

        System.out.println(nazovZoo);
        System.out.println(mojChovatel.getMenoPriezvisko());

        while(true){
            System.out.println("================================");
            System.out.println("Menu Zoo");
            System.out.println("1 zobraz meno Zoo");
            System.out.println("2 zobraz meno Chovatela");
            System.out.println("3. pridat zvíera");
            System.out.println("4. Zobraz cele Zoo");
            System.out.println("5. Zobraz najdrahsie zvieratko :)");
            System.out.println("6. exit");
            System.out.println("=================================");
            System.out.println("Zadaj cislo menu:");
            int cisloMenu = scanner.nextInt();
            switch (cisloMenu){
                case 1:
                    System.out.println("Meno zoo je" + nazovZoo);
                    break;
                case 2:
                    System.out.println("Meno Chovatela je" + mojChovatel.getMenoPriezvisko());
                    break;
                case 3:
                    System.out.println("Zadaj meno zvierata: ");
                    String menoZvierata = scanner.next();
                    System.out.println("Zadaj cenu zvierata: ");
                    double cenaZvierata = scanner.nextDouble();
                    break;
                case 4:
                    System.out.println("Nazov nasej zoo: " + nazovZoo);
                    System.out.println("Nazov naseho chovatela: " + mojChovatel.getMenoPriezvisko());
                    System.out.println(mojChovatel.celeZoo());
                    break;
                case 5:
                    System.out.println(mojChovatel.zistiNajdrahsiezviera().getAnimalType());
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}




    









