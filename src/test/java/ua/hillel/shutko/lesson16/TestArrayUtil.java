package ua.hillel.shutko.lesson16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.hillel.shutko.lessons.lesson16.ArrayUtil;

public class TestArrayUtil {
    @Test
    void testMethod1(){
        int[] array = {1, 2, 3, 4, 5};
        int indexElement = ArrayUtil.getIndexElement(array, 3);
        Assertions.assertTrue(indexElement == 2);
    }

    @Test
    void testMethod2(){
        int[] array = {1, 2, 3, 4, 5};
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
}
