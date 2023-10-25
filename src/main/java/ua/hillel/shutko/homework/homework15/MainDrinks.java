package ua.hillel.shutko.homework.homework15;

import java.util.Arrays;
import java.util.Scanner;

public class MainDrinks {
    public static int totalCost = 0;

    public static void main(String[] args) {
        makingDrink();
        System.out.println("The number of manufactured drinks: " + Drinks.COUNTER_DRINKS + ".");
        System.out.println("The total amount to be paid is " + totalCost + " UAH.");
    }

    static void makingDrink() {

        Scanner scanner = new Scanner(System.in);
        DrinksMachine drinksMachine = null;
        int orderMore = 1;
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
                    totalCost = Drinks.COST_COFFEE;
                    break;
                }
                case TEA: {
                    System.out.println("The drink " + DrinksMachine.TEA + " is ready.");
                    totalCost = Drinks.COST_TEA;
                    break;
                }
                case LEMONADE: {
                    System.out.println("The drink " + DrinksMachine.LEMONADE + " is ready.");
                    totalCost = Drinks.COST_LEMONADE;
                    break;
                }
                case MOJITO: {
                    System.out.println("The drink " + DrinksMachine.MOJITO + " is ready.");
                    totalCost = Drinks.COST_MOJITO;
                    break;
                }
                case MINERAL_WATER: {
                    System.out.println("The drink " + DrinksMachine.MINERAL_WATER + " is ready.");
                    totalCost = Drinks.COST_MINERAL_WATER;
                    break;
                }
                case COCA_COLA: {
                    System.out.println("The drink " + DrinksMachine.COCA_COLA + " is ready.");
                    totalCost = Drinks.COST_COCA_COLA;
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

            drinksMachine = null;

            if (totalCost > 0) {
                new Drinks();
            } else {
                System.out.println("You need to order something");
            }
        }
    }
}
