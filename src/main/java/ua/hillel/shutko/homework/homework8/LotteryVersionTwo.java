package ua.hillel.shutko.homework.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryVersionTwo {
    public static void main(String[] args) {

        int[] numbersLottery = new int[7];

        for (int i = 0; i < numbersLottery.length; i++) {
            int randomNumber = (int) (Math.random() * 10);
            numbersLottery[i] = randomNumber;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 7 integers from 0 to 9");

        int[] numbersUser = new int[7];
        int minNumber = 0;
        int maxNumber = 9;

        for (int i = 0; i < numbersUser.length; i++) {

                if (sc.hasNextInt()) {
                    int userValue = sc.nextInt();

                    if (userValue >= minNumber && userValue <= maxNumber) {
                        numbersUser[i] = userValue;
                        int counter = i + 1;
                        int numberAttempts = numbersUser.length - counter;
                        if (numberAttempts < 1) {
                            break;
                        }
                        System.out.println("It remains to enter " + numberAttempts + " integers from 0 to 9");
                    } else {
                        System.out.println("Wrong data! Please enter a number from 0 to 9");
                        if (sc.hasNextInt()) {
                            int userValue2 = sc.nextInt();
                            System.out.println("Please enter a number from 0 to 9");
                            numbersUser[i] = userValue2;
                        }
                    }
                } else {
                    System.out.println("Wrong data! Please enter a number from 0 to 9");
                }
                sc.nextLine();
            }

            Arrays.sort(numbersLottery);
            System.out.println(Arrays.toString(numbersLottery));

            Arrays.sort(numbersUser);
            System.out.println(Arrays.toString(numbersUser));

            int counter = 0;

            for (int i = 0, j = 0; i < numbersLottery.length; i++, j++) {

                int valueLottery = numbersLottery[i];
                int valueUser = numbersUser[j];

                if (valueLottery == valueUser) {
                    counter++;
                    System.out.println("The values in index " + i + " matched");
                }
            }
            System.out.println("Number of matches: " + counter);
        }
    }


