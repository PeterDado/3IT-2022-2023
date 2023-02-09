package sk.sosholic.prvypolrok.datatbazaziakov;

public class Ziak {
    private String meno;
    private String priezvisko;
    private int vek;

    public Ziak(String meno, String priezvisko, int vek) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
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

    @Override
    public String toString() {
        return "Ziak{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", vek=" + vek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return priezvisko.equals(o);
    }

    @Override
    public int hashCode() {
        return priezvisko.hashCode();
    }
}

