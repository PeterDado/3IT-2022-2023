package sk.sosholic.prvypolrok.uvod.ZOO;

import java.util.ArrayList;
import java.util.List;

public class Chovatel {

    private List<Zviera> zoo = new ArrayList<>();
    private String menoPriezvisko;

    public Chovatel(String menoPriezvisko){
        this.menoPriezvisko = menoPriezvisko;
    }

    public Chovatel() {

    }

    public void pridatZviera(Zviera zviera){
        zoo.add(zviera);
    }
    public Zviera zistiNajdrahsiezviera() {
        Zviera najdrahsieZviera = zoo.get(0);
        for(Zviera zviera : zoo){
            if (zviera.getValue()> zoo.get(0).getValue()){

            }


        }
        return najdrahsieZviera;
    }

    public String getMenoPriezvisko() {
        return menoPriezvisko;
    }

    public List<Zviera> celeZoo(){
        return zoo;
    }
}
