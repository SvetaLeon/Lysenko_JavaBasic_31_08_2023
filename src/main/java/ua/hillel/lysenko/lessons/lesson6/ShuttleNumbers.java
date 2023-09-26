package ua.hillel.lysenko.lessons.lesson6;

public class ShuttleNumbers {
    public static void main(String[] args) {

        int maxShuttlesNoUnluckyNumbers = 100;
        int initialNumberShuttles = 0;
        int numberShuttles = 160;
        int counter = 0;

        if (initialNumberShuttles < numberShuttles) {

            while (true) {
                initialNumberShuttles++;

                if (initialNumberShuttles / 10 == 4 || initialNumberShuttles % 10 == 4) {
                    continue;
                }
                if (initialNumberShuttles / 10 == 9 || initialNumberShuttles % 10 == 9) {
                    continue;
                }
                if (initialNumberShuttles / 100 % 10 == 4 || initialNumberShuttles % 100 / 10 == 4) {
                    continue;
                }
                if (initialNumberShuttles / 100 % 10 == 9 || initialNumberShuttles % 100 / 10 == 9) {
                    continue;
                }
                if (counter == maxShuttlesNoUnluckyNumbers) {
                    break;
                }
                System.out.println("Shuttles " + initialNumberShuttles);
                counter++;
            }
            System.out.println("The total number of shuttles to transport people to Mars = " + counter);
        } else if (initialNumberShuttles > numberShuttles) {

            while (true) {
                initialNumberShuttles--;

                if (initialNumberShuttles / 10 == 4 || initialNumberShuttles % 10 == 4) {
                    continue;
                }
                if (initialNumberShuttles / 10 == 9 || initialNumberShuttles % 10 == 9) {
                    continue;
                }
                if (initialNumberShuttles / 100 % 10 == 4 || initialNumberShuttles % 100 / 10 == 4) {
                    continue;
                }
                if (initialNumberShuttles / 100 % 10 == 9 || initialNumberShuttles % 100 / 10 == 9) {
                    continue;
                }
                if (counter == maxShuttlesNoUnluckyNumbers) {
                    break;
                }
                System.out.println("Shuttles " + initialNumberShuttles);
                counter++;
            }
            System.out.println("The total number of shuttles to transport people to Mars = " + counter);
        } else {
            System.out.println("Wrong data!");
        }
    }
}
