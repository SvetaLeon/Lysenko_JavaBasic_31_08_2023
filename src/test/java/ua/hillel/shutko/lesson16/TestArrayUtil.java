package ua.hillel.shutko.lesson16;

import org.junit.jupiter.api.*;
import ua.hillel.shutko.lessons.lesson16.ArrayUtil;

import java.util.Arrays;

public class TestArrayUtil {

    static int[] array = null;

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
        array = new int[]{1, 2, 3, 4, 5};
    }

    @BeforeEach
    void beforeEach() {
        array = new int[]{1, ((int) (Math.random() * 2)), 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }

    @Test
    void testMethod1(){
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertTrue(indexElement == 2);
    }

    @Test
    void testMethod2(){
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertEquals(2, indexElement);
    }

    @Test
    void testMethod3(){
        int[] array = null;
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertEquals(-3, indexElement);
    }

    @Test
    void testMethod4(){
        int[] array = {};
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertEquals(-2, indexElement);
    }

    @Test
    void testMethod5(){
        int[] array = {1};
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertEquals(-1, indexElement);
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
        array = null;
    }
}
