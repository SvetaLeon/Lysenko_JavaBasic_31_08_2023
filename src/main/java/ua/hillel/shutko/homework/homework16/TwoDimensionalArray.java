package ua.hillel.shutko.homework.homework16;

public class TwoDimensionalArray {

    // if null - return -1
    // if empty - return -2
    // if square array - return -3
    // if not square array - return -4

    public static int getCheckArray(int[][] array, int numberLines, int numberColumns) {

        if (array == null) {
            return -1;
        }

        if (array.length == 0) {
            return -2;
        }

        if (numberLines == numberColumns) {
            return -3;
        }

        return -4;
    }

    public static void getArithmeticMean(int[][] array) {

        double sumValue = 0;
        int sumElement = (array.length * array[0].length);

        for (int[] ints : array) {
            for (int value : ints) {
                sumValue += (double) value;
            }
        }

        System.out.println("Arithmetic mean of array elements " + sumValue / sumElement);
    }
}
