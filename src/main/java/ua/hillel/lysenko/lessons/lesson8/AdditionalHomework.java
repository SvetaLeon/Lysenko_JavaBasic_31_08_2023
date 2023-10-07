package ua.hillel.lysenko.lessons.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalHomework {
    public static void main(String[] args) {

        int[] array = new int[15];
        int min = 1;
        int max = 100;

        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            array[i] = randomNumber;
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(Arrays.toString(array));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to search in the array");

        int numberUser;

        while (true) {

            if (sc.hasNextInt()) {
                int userValue = sc.nextInt();

                if (userValue >= min && userValue <= max) {
                    numberUser = userValue;
                    break;
                } else {
                    System.out.println("Wrong data! Please enter a number from 1 to 100");
                }

            } else {
                System.out.println("Wrong data! Try again!");
            }
        }

        int index = 0;
        int left = 0;
        int right = array.length - 1;
        int enteredNumber = 0;

        for (int value : array) {
            if (numberUser == value) {
                enteredNumber = value;
            }
        }

        if (enteredNumber == numberUser) {

            while (left <= right) {

                int mid = (left + right) / 2;

                if (array[mid] == enteredNumber) {
                    index = mid;
                    break;
                } else if (array[mid] < enteredNumber) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
            System.out.println("The index of the number " + numberUser + " in the sorted array: " + index);

        } else {
            System.out.println("The specified number is not in the array");
        }
    }
}
