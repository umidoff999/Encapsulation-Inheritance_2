package Encapsulation_2;

public class Computers extends Electronics{

    private int RAM;
    private  String display;

    public Computers(String name, int dateOfMade, String country, int RAM, String display) {
        super(name, dateOfMade, country);

        this.RAM = RAM;
        this.display = display;
    }
}
