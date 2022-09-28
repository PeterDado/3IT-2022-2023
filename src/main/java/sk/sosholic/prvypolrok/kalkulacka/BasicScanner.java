package sk.sosholic.prvypolrok.kalkulacka;


import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int exit = 1;
        while (exit!=0){
            System.out.println("Ak chcete scitat stlac 1");
            System.out.println("Ak chcete odcitat stlac 2");
            System.out.println("Ak chces nasobit stlac 3");
            System.out.println("Ak chces delit stlac 4");
            int matematickaOperacia=scanner.nextInt();
            switch(matematickaOperacia){
                case 1:
                System.out.println("zadaj prve čislo a stlac enter");
                int scitanie1 = scanner.nextInt();
                System.out.print("zadaj druhe cislo a stlac enter");
                int scitanie2 = scanner.nextInt();
                System.out.println("vysledok scitania je: "+(scitanie1+scitanie2));
                break;
                case 2:
                    System.out.println("zadaj prve čislo a stlac enter");
                    int odcitanie1 = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter");
                    int odcitanie2 = scanner.nextInt();
                    System.out.println("vysledok odcitania je: "+(odcitanie1-odcitanie2));
                    break;
                case 3:
                    System.out.println("zadaj prve čislo a stlac enter");
                    int nasobitel1 = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter");
                    int nasobitel2 = scanner.nextInt();
                    System.out.println("vysledok nasobenia je: "+(nasobitel1*nasobitel2));
                    break;
                case 4:
                    System.out.println("zadaj prve čislo a stlac enter");
                    int delenec = scanner.nextInt();
                    System.out.print("zadaj druhe cislo a stlac enter");
                    int delitel = scanner.nextInt();
                    System.out.println("vysledok delenia je: "+(delenec/delitel));
                    break;
                default:
                    System.out.println("!!!!! Zly vyber !!!!!! Zadaj znova ");
                    continue;
            }
        }


           System.out.println("ukoncenie programu stlac 0 a enter.Pre pokracovanie stalc 1 ");
           exit = scanner.nextInt();
       }
    }
