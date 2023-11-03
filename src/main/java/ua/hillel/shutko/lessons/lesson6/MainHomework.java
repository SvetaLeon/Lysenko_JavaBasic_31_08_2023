package ua.hillel.shutko.lessons.lesson6;

import java.util.Scanner;

public class MainHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 11);
        System.out.println("randomNumber = " + randomNumber);

        for (int i = 3; i > 0; i--) {
            System.out.println("Guess the number, you have " + i + " tries");
            int number = getNumber(scanner);
            if (number == randomNumber) {
                System.out.println("You win!");
                break;
            } else if (i == 1) {
                System.out.println("You lose");
            }
        }

        scanner.close();
    }

    static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if (temp >= 0 && temp <= 10) {
                    return temp;
                } else {
                    System.out.println("Please enter number from 0 to 10");
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }
    }
}
