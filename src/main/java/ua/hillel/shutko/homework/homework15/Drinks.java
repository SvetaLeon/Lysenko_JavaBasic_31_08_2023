package ua.hillel.shutko.homework.homework15;

import java.util.Arrays;
import java.util.Scanner;

public class Drinks {
    public static final int COST_COFFEE = 35;
    public static final int COST_TEA = 30;
    public static final int COST_LEMONADE = 40;
    public static final int COST_MOJITO = 45;
    public static final int COST_MINERAL_WATER = 20;
    public static final int COST_COCA_COLA = 25;

    public static int COUNTER_DRINKS = 0;

    public static int TOTAL_COST = 0;

    public Drinks() {
        COUNTER_DRINKS++;
    }

    public static void main(String[] args) {
        makingDrink();
        System.out.println("The number of manufactured drinks: " + COUNTER_DRINKS + ".");
        System.out.println("The total amount to be paid is " + TOTAL_COST + " UAH.");
    }

    static void makingDrink() {

        Scanner scanner = new Scanner(System.in);
        DrinksMachine drinksMachine = null;
        int orderMore = 1;
        int costDrink = 0;
        DrinksMachine[] drinksMachines = DrinksMachine.values();

        while (orderMore == 1) {

            while (drinksMachine == null) {
                System.out.println("Please enter the type of drink from the list: " + Arrays.toString(drinksMachines));
                String userDrink = scanner.nextLine().toUpperCase();

                for (DrinksMachine drinks : drinksMachines) {
                    if (userDrink.equals(drinks.toString())) {
                        drinksMachine = DrinksMachine.valueOf(userDrink);
                        break;
                    }
                }
            }

            switch (drinksMachine) {
                case COFFEE: {
                    System.out.println("The drink " + DrinksMachine.COFFEE + " is ready.");
                    costDrink = COST_COFFEE;
                    break;
                }
                case TEA: {
                    System.out.println("The drink " + DrinksMachine.TEA + " is ready.");
                    costDrink = COST_TEA;
                    break;
                }
                case LEMONADE: {
                    System.out.println("The drink " + DrinksMachine.LEMONADE + " is ready.");
                    costDrink = COST_LEMONADE;
                    break;
                }
                case MOJITO: {
                    System.out.println("The drink " + DrinksMachine.MOJITO + " is ready.");
                    costDrink = COST_MOJITO;
                    break;
                }
                case MINERAL_WATER: {
                    System.out.println("The drink " + DrinksMachine.MINERAL_WATER + " is ready.");
                    costDrink = COST_MINERAL_WATER;
                    break;
                }
                case COCA_COLA: {
                    System.out.println("The drink " + DrinksMachine.COCA_COLA + " is ready.");
                    costDrink = COST_COCA_COLA;
                    break;
                }
            }

            while (true) {
                System.out.println("Would you like to order something else? If Yes, enter 1, if No, enter 2.");

                if (scanner.hasNextInt()) {
                    orderMore = scanner.nextInt();
                    scanner.nextLine();

                    if (orderMore >= 1 && orderMore <= 2) {
                        break;
                    } else {
                        System.out.println("Please enter number from 1 or 2");
                    }

                } else {
                    System.out.println("Please enter correct value!!!");
                    scanner.nextLine();
                }
            }

            TOTAL_COST += costDrink;
            drinksMachine = null;

            if (TOTAL_COST > 0) {
                new Drinks();
            } else {
                System.out.println("You need to order something");
            }
        }
    }
}

