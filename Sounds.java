package Encapsulation_2;

public class Sounds extends Electronics {

    private int weight;
    private boolean bluetooth;

    public Sounds(String name, int dateOfMade, String country, int weight, boolean bluetooth) {
        super(name, dateOfMade, country);

        this.weight = weight;
        this.bluetooth = bluetooth;

    }
}
