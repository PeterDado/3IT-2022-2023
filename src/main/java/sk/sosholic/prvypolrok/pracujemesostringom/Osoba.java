package sk.sosholic.prvypolrok.pracujemesostringom;

public class Osoba {


        public Osoba(String ondrej, String novak, int i) {
        }

        public void Osoba(String meno, String priezvisko, int vek) {

        }

        public String getMeno() {
            return meno;
        }

        public void setMeno(String meno) {
            this.meno = meno;
        }

        public String getPriezvisko() {
            return priezvisko;
        }

        public void setPriezvisko(String priezvisko) {
            this.priezvisko = priezvisko;
        }

        public int getVek() {
            return vek;
        }

        public void setVek(int vek) {
            this.vek = vek;
        }

        String meno;
        String priezvisko;
        int vek;

        public int pocetSamohlasyVPriezvisku(char samohlaska) {
            int pocet = 0;
            priezvisko.chars();
            return pocet;
        }

    }




