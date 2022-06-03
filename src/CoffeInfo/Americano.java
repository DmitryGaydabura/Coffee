package CoffeInfo;

public class Americano extends Coffee {
    private static final double price = 1.50;

    public static double getPrice() {
        return price;
    }

    public Americano() {
        System.out.println("Your americano is ordered!");
    }

    public static void create(){
        System.out.println("Your americano is ready!");
    }
}
