package ua.hillel.shutko.homework.homework16;

public class TwoDimensionalArray {

    // if empty - return -2
    // if null - return -3

    public static int getCheckArray(int[][] array) {

        if (array == null) {
            return -3;
        }

        if (array.length == 0) {
            return -2;
        }

        if (array.length == array[0].length) {
            return 1;
        }

        return -1;
    }

    public static double getArithmeticMean(double[][] array) {

        double sum = 0;
        for (double[] ints : array) {
            for (double value : ints) {
                sum += value;
            }
        }
        return sum / array.length;
    }
}
