package sk.sosholic.prvypolrok.uvod.ZOO;

public class Hmyz {
    private int pocetNoh;
    private int checkPocetNoh(int pocetNoh) {
        return pocetNoh;
    }
    public Hmyz(String animalType, double value, int pocetNoh) {
        super();
        this.pocetNoh = checkPocetNoh(pocetNoh);
    }
    public int getPocetNoh(){
        return pocetNoh;
    }
    public void setPocetNoh(int pocetNoh){
        this.pocetNoh = checkPocetNoh(pocetNoh);
    }
    private int chcePocetNoh(int pocetNoh){
        if(pocetNoh==0 || pocetNoh==6 || pocetNoh==8 ||  pocetNoh==100){
            return pocetNoh;
        }else {
            return -1;
        }
    }

}