package ua.hillel.shutko.homework16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.hillel.shutko.homework.homework16.TwoDimensionalArray;

public class TestTwoDimensionalArray {

    static int[][] array = new int[5][5];
    static int maxValue = 9;
    static int minValue = 1;

    @BeforeAll
    static void arrayFilling() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    void testMethod1() {
        System.out.println("testMethod1");
        int result = TwoDimensionalArray.getCheckArray(array);
        Assertions.assertEquals(1, result);
    }

    @Test
    void testMethod2() {
        System.out.println("testMethod2");
        int[][] array = null;
        int result = TwoDimensionalArray.getCheckArray(array);
        Assertions.assertEquals(-3, result);
    }

    @Test
    void testMethod3() {
        System.out.println("testMethod3");
        int[][] array = {};
        int result = TwoDimensionalArray.getCheckArray(array);
        Assertions.assertEquals(-2, result);
    }
}
