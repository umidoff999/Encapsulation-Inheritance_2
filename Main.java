package Encapsulation_2;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("HP",2023,"USA",8,"24sm x 47sm");
        Laptop laptop = new Laptop("Lenovo",2023, "USA",16,"21sm x 39sm");

        Subwoofer subwoofer = new Subwoofer("Sony", 2010, "Japan", 1500,true);
        Loudspeaker loudspeaker = new Loudspeaker("Audision", 2000,"USA", 500, false);
    }
}
