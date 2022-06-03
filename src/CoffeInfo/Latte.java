package CoffeInfo;

public class Latte extends Coffee {
    public static final double price = 2.50;

    public static double getPrice() {
        return price;
    }

    public Latte() {
        System.out.println("Your latte is ordered!");
    }

    public static void create() {
        System.out.println("Your latte is ready!");
    }
}
