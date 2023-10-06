package ua.hillel.lysenko.lessons.lesson9;

import java.util.Scanner;

public class TranspositionOfMatrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of the M array from 2 to 9");

        int minNumber = 2;
        int maxNumber = 9;
        int matrixM;

        while (true) {

            if (sc.hasNextInt()) {
                int userValueMatrixM = sc.nextInt();

                if (userValueMatrixM >= minNumber && userValueMatrixM <= maxNumber) {
                    matrixM = userValueMatrixM;
                    break;
                } else {
                    System.out.println("Wrong data! Please enter a number from 2 to 9");
                }

            } else {
                System.out.println("Wrong data! Please enter a number from 2 to 9");
            }

            sc.nextLine();
        }

        System.out.println("Please enter the size of the N array from 2 to 9");

        int matrixN;

        while (true) {

            if (sc.hasNextInt()) {
                int userValueMatrixN = sc.nextInt();

                if (userValueMatrixN >= minNumber && userValueMatrixN <= maxNumber) {
                    matrixN = userValueMatrixN;
                    break;
                } else {
                    System.out.println("Wrong data! Please enter a number from 2 to 9");
                }

            } else {
                System.out.println("Wrong data! Please enter a number from 2 to 9");
            }

            sc.nextLine();
        }

        System.out.println();

        int[][] array1 = new int[matrixM][matrixN];
        int minValue = 1;
        int maxValue = 99;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
            }
        }

        int[][] array2 = new int[matrixN][matrixM];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }

        System.out.println("BEFORE");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("AFTER");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

