package AppLogic;

import java.util.Scanner;

import CoffeInfo.*;

public class Logic {
    public static void start() throws InterruptedException {
        Logic.takeOrder();
    }

    private static void takeOrder() throws InterruptedException {
        System.out.println("                                    Please, choose your drink!");
        System.out.println("                              (type OK, when your order is complete)");
        Coffee[] Array = new Coffee[20];
        fillArrayWithNothing(Array);

        int i = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            String n = in.nextLine();
            n = n.toLowerCase();
            switch (n) {
                case "latte" -> {
                    Array[i] = new Latte();
                    i++;
                }
                case "cappuccino" -> {
                    Array[i] = new Cappuccino();
                    i++;
                }
                case "americano" -> {
                    Array[i] = new Americano();
                    i++;
                }
                case "tea" -> {
                    Array[i] = new Tea();
                    i++;
                }
                case "ok" -> {
                    Logic.finishOrder(Array, i);
                }
                default -> {
                    System.out.println("Incorrect Input");
                }
            }

        }


    }

    private static void fillArrayWithNothing(Coffee[] Array) {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = new Coffee();
        }
    }

    private static void finishOrder(Coffee[] array, int i) throws InterruptedException {
        double sum = 0;
        for (Coffee coffee : array) {
            if (coffee.getClass() == Latte.class) {
                sum += Latte.getPrice();
            } else if (coffee.getClass() == Cappuccino.class) {
                sum += Cappuccino.getPrice();
            } else if (coffee.getClass() == Americano.class) {
                sum += Americano.getPrice();
            } else if (coffee.getClass() == Tea.class) {
                sum += Tea.getPrice();
            } else if (coffee.getClass() == null) {
                sum += Coffee.getPrice();
            }
        }
        System.out.println("Total price is " + sum + "$");
        for (int j = 0; j < i; j++) {
            if (array[j].getClass() == Latte.class) {
                Latte.create();
                Thread.sleep(1500);
            } else if (array[j].getClass() == Cappuccino.class) {
                Cappuccino.create();
                Thread.sleep(1500);
            } else if (array[j].getClass() == Americano.class) {
                Americano.create();
                Thread.sleep(1500);
            } else if (array[j].getClass() == Tea.class) {
                Tea.create();
                Thread.sleep(1500);
            } else if (array[j].getClass() == null) {
                sum += Coffee.getPrice();
            }
        }
        System.exit(0);
    }
}
