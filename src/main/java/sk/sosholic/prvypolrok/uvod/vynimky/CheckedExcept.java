package sk.sosholic.prvypolrok.uvod.vynimky;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;

public class CheckedExcept {
    public static void main(String[] args) {

    }
    public static void nacitatSubor() throws SQLException {
        BufferedReader bufferedReader=null;
        try {
            bufferedReader = new BufferedReader(new FileReader("text.txt"));
        }catch (FileNotFoundException exception){
            System.out.println("subor nenajdeny zadaj spravnu ccestu k suboru");
        }

        try {
            bufferedReader.readLine();
        }catch (IOException exe){
            System.out.println("nejaka chyba IOexepciton");
        }

    }

    public static void uloha1(){
        SQLException sqlException = null;
        try {
            sqlException = new SQLException("nejaka sql chyba");
            throw  sqlException;
        }catch(SQLException exepcion){
            System.out.println("nejaka sql chyba");

        }

    }


    public static void uloha2() {
        URL url=null;
        try {
           url = new URL("http://localhost");
        }catch(MalformedURLException exepcion){
            System.out.println("zla url adresa");
        }

        URLConnection conection=null;
        try {
            conection = url.openConnection();
            conection.connect();
        }catch(IOException exepcion){
            System.out.println("chyba zapisu");

        }
    }
}
// rozdiel medzi throws a throw sposobi nam to osetrenie vynimky ktora nam vyskoci ked zavolame metodu connect a potencionalne vyhodenie
// chyby  poverime toho pouzivatela aby tu vynimku on osetril ked pouzijes connect musis vyriesit IOExepcion
// throws deleguje riesenie vynimky na miesto kde bude pouzita metoda connectDva
//konkretne v main metode sme ju pouzili
// tam mozeme isto delegovat pomocou throws 