package sk.sosholic.prvypolrok.datatbazaziakov;

public class Ziak {
    private String meno;
    private String priezvisko;
    private int vek;
    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }


    public Ziak(String meno, String prizvisko, int vek) {
        this.meno = meno;
        this.priezvisko = prizvisko;
        this.vek = vek;

        }

    }

