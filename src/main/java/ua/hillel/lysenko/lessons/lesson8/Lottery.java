package ua.hillel.lysenko.lessons.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        int[] numbersLottery = new int[7];

        for (int i = 0; i < numbersLottery.length; i++) {
            int randomNumber = (int) (Math.random() * 10);
            numbersLottery[i] = randomNumber;
        }

        int[] numbersUser = new int[7];

        for (int i = 0; i < numbersUser.length; i++) {
            int randomNumber = (int) (Math.random() * 10);
            numbersUser[i] = randomNumber;
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


