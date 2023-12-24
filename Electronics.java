package Encapsulation_2;

public class Electronics {
    private String name;
    private  int dateOfMade;
    private String country;

    public Electronics(String name, int dateOfMade, String country){
        this.name = name;
        this.dateOfMade = dateOfMade;
        this.country = country;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Date: " + dateOfMade);
        System.out.println("Country: " + country);
    }
}
