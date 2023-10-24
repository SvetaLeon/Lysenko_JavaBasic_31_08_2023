package ua.hillel.shutko.homework.homework8;

import java.util.Arrays;

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

        for (int i = 0; i < numbersLottery.length - 1; i++) {
            for (int j = 0; j < numbersLottery.length - 1 - i; j++) {

                if (numbersLottery[j] > numbersLottery[j + 1]) {
                    int temp = numbersLottery[j];
                    numbersLottery[j] = numbersLottery[j + 1];
                    numbersLottery[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbersLottery));

        for (int i = 0; i < numbersUser.length - 1; i++) {
            for (int j = 0; j < numbersUser.length - 1 - i; j++) {

                if (numbersUser[j] > numbersUser[j + 1]) {
                    int temp = numbersUser[j];
                    numbersUser[j] = numbersUser[j + 1];
                    numbersUser[j + 1] = temp;
                }
            }
        }
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


