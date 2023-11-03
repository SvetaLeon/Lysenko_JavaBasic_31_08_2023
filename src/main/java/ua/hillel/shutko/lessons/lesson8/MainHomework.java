package ua.hillel.shutko.lessons.lesson8;

import java.util.Arrays;

public class MainHomework {
    public static void main(String[] args) {
        int max = 9;
        final int COUNT = 7;
        int[] array1 = new int[COUNT];
        int[] array2 = new int[COUNT];

        for (int i = 0; i < COUNT; i++) {
            array1[i] = getRandomNumber(max);
            array2[i] = getRandomNumber(max);
        }

        System.out.println("Before sort");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("After sort");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int counter = 0;
        for (int i = 0; i < COUNT; i++) {
            if (array1[i] == array2[i]) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Number of coincidences: " + counter);
    }

    static int getRandomNumber(int max) {
        return (int) (Math.random() * (max + 1));
    }
}
