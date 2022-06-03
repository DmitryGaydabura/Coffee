package CoffeInfo;

public class Cappuccino extends Coffee {
    private static final double price = 2.30;

    public static double getPrice() {
        return price;
    }

    public Cappuccino() {
        System.out.println("Your cappuccino is ordered!");
    }

    public static void create() {
        System.out.println("Your cappuccino is ready!");
    }
}
