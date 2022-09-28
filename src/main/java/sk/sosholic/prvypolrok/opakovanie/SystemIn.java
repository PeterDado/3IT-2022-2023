package sk.sosholic.prvypolrok.opakovanie;

import java.util.Scanner;

public class SystemIn {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("zadaj volaco a stlac enter: ");
        MojeMeno mojeMeno = new MojeMeno("Peter","Dado");

        String ulozenyRiadok = scanner.nextLine();

        System.out.println("Priezvisko");
        String Priezvisko = scanner.nextLine();

        for(int y =1;y<11;y++){
            if(y%2==0){
                System.out.println(mojeMeno +  " "+Priezvisko);
            }
        }

    }

}
