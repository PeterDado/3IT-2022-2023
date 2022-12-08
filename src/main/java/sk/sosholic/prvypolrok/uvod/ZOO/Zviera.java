package sk.sosholic.prvypolrok.uvod.ZOO;

public class Zviera {
    private String animalType;
    private double value;

    public Zviera(String animalType, double value) {
        if(value<=0){
            this.value = 0;
        }else{
            this.value = value;
        }

    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Zviera{" +
                "animalType='" + animalType + '\'' +
                ", value=" + value +
                '}';
    }
}
