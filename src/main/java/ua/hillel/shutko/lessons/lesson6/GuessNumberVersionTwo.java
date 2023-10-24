package ua.hillel.shutko.lessons.lesson6;

import java.util.Scanner;

public class GuessNumberVersionTwo {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 11);
        Scanner sc = new Scanner(System.in);

        int numberAttempts = 4;

        for (int i = 1; i <= numberAttempts; i++) {
            System.out.println("Please enter integer number from 0 to 10");

            if (sc.hasNextInt()) {
                int userValue = sc.nextInt();

                if (userValue == randomNumber) {
                    System.out.println("Great! You won, you guessed the number " + randomNumber);
                    break;
                }

                if (i == 1) {
                    if (userValue > randomNumber) {
                        System.out.println("Wrong! The entered number is greater than the specified");
                    } else {
                        System.out.println("Wrong! The entered number is less than specified");
                    }
                    System.out.println("You have 3 attempts left!");
                }

                if (i == 2) {
                    if (userValue > randomNumber) {
                        System.out.println("Wrong! The entered number is greater than the specified");
                    } else {
                        System.out.println("Wrong! The entered number is less than specified");
                    }
                    System.out.println("You have 2 attempts left!");
                }

                if (i == 3) {
                    if (userValue > randomNumber) {
                        System.out.println("Wrong! The entered number is greater than the specified");
                    } else {
                        System.out.println("Wrong! The entered number is less than specified");
                    }
                    System.out.println("You have 1 attempts left!");
                }

                if (i == 4) {
                    System.out.println("You didn't guess! The computer guessed this number " + randomNumber);
                    break;
                }

            } else {
                System.out.println("Wrong data!");
            }
            sc.nextLine();
        }
    }
}
