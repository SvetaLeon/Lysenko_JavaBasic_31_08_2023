package ua.hillel.shutko.homework16;

import org.junit.jupiter.api.*;
import ua.hillel.shutko.homework.homework16.TwoDimensionalArray;

public class TestTwoDimensionalArray {
    static int numberLines = 4;
    static int numberColumns = 4;
    static int[][] array = new int[numberLines][numberColumns];
    static int maxValue = 9;
    static int minValue = 1;

    @BeforeAll
    static void arrayFilling() {

        System.out.println("Two Dimensional Array");

        for (int i = 0; i < numberLines; i++) {
            for (int j = 0; j < numberColumns; j++) {
                array[i][j] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        TwoDimensionalArray.getArithmeticMean(array);
        System.out.println();
    }

    @Test
    void testMethod1() {
        System.out.println("Test method 1");
        int[][] array = null;
        int result = TwoDimensionalArray.getCheckArray(array, 4, 4);
        Assertions.assertEquals(-1, result);
        System.out.println();
    }

    @Test
    void testMethod2() {
        System.out.println("Test method 2");
        int[][] array = {};
        int result = TwoDimensionalArray.getCheckArray(array, 4, 4);
        Assertions.assertEquals(-2, result);
        System.out.println();
    }

    @Test
    void testMethod3() {
        System.out.println("Test method 3");
        int result = TwoDimensionalArray.getCheckArray(array, 4, 4);
        Assertions.assertEquals(-3, result);
        System.out.println();
    }

    @Test
    void testMethod4() {
        System.out.println("Test method 4");
        int result = TwoDimensionalArray.getCheckArray(array, 4, 3);
        Assertions.assertEquals(-4, result);
    }

    @AfterAll
    static void afterAll(){
        array = null;
    }
}
