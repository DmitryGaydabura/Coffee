package CoffeInfo;

public class Tea extends Coffee {
    private static final double price = 1;

    public static double getPrice() {
        return price;
    }

    public Tea() {
        System.out.println("Your tea is ordered!");
    }

    public static void create(){
        System.out.println("Your tea is ready!");
    }
}
