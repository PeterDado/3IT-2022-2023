package sk.sosholic.prvypolrok.uvod.ZOO;

public class Ryba extends Zviera{
    String typVody;

    public Ryba(String animalType, double value) {
        super(animalType, value);
        this.typVody = typVody;
    }
    public String getTypVody(){
        return typVody;
    }
    public void setTypVody(String typVody){
        this.typVody = typVody;
    }

    public Ryba(String animalType, double value, String typVody) {
        super(animalType, value);
        this.typVody = typVody;
    }
}

