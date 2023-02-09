package sk.sosholic.prvypolrok.pracujemesostringom;

public class MainApplication {
    public static void main(String[] args) {

        Osoba ondrej = new Osoba("Ondrej", "Novak", 55);

        char samohlaska =  'a';
        System.out.println("samohlaska" + samohlaska + "sa nachadza v priezvisku"+ ondrej.pocetSamohlasyVPriezvisku(samohlaska) + "krat.");
    }
}
