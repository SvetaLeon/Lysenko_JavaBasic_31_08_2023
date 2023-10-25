package ua.hillel.shutko.lessons.lesson10;

public class Main {
    public static void main(String[] args) {
//        printHelloWorld();
//
//        printHelloName("Den");
//        printHelloName("Alex");
//        printHelloName("Oleg");
//
//        printSum(5,5);
//        printSum(2,4);
//
//        int a = 5;
//        int b = 7;
//        printSum(a, b);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

//        int a = 5;
//        int b = 7;

//        System.out.println(getSum(a, b));
//
//        int sum1 = getSum(a, b);
//        System.out.println("Sum1 = " + sum1);
////
//        int sum2 = getSum(a, getSum(a, b));
//        System.out.println("Sum2 = " + sum2);
//
//        int sum3 = getSum(a, getSum(getSum(1, 2), b));
//        System.out.println("Sum3 = " + sum3);

//        demoReturn(2);
//        demoReturn(1);
//        demoReturn(3);
//
//        System.out.println(demoManyReturn(1));
//        System.out.println(demoManyReturn(2));
//        System.out.println(demoManyReturn(5));

//        printSum2(1, 5, 8);
//        System.out.println();
//        printSum2(2, 2, 3, 9);
//        System.out.println();
//        printSum2(3, 4, 9, 12, 15, 20);
//        System.out.println();
//        printSum2(4);

//        int[] array = {5, 4, 2, 4, 5};

//        printSum3(array);

//        System.out.println(Arrays.toString(array));
//        demoArray(array);
//        System.out.println(Arrays.toString(array));

//        System.out.println(Arrays.toString(array));
//        demoArray2(array);
//        System.out.println(Arrays.toString(array));

//
//        System.out.println(getSum(2, 2, 2, 2));
//        System.out.println(getSum(2, 2, 2));
//        System.out.println(getSum(2, 2));
//        System.out.println(getSum(1.5, 5));


//        demoRecursion(1);

//        Factorial - 5! (1 * 2 * 3 * 4 * 5) = 120
//        int number = 5;
//        int factorial = 1;
//        for (int i = 2; i <= number; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);

//        System.out.println(getFactorial(number));

//        System.out.println(evclide(10, 5));
//        System.out.println(evclide(6, 9));
//        System.out.println(evclide(4, 8));
//        System.out.println(evclide(7, 8));
    }


    static int evclide(int n, int m) {
        if (n == m) {
            return n;
        } else if (n > m) {
          return   evclide(n - m, m);
        } else {
           return evclide(n, m - n);
        }
    }

    static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }

    // BAD RECURSION
    static void demoRecursion(int x) {
        demoRecursion(x);
    }

    static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    static int getSum(byte a, int b) {
        return a + b;
    }

    static int getSum(short a, int b) {
        return a + b;
    }

    static int getSum(int a, int b) {
//        int sum = a + b;
//        return sum;
        return a + b;
    }

    static double getSum(double a, int b) {
        return a + b;
    }

    static void demoArray2(int... numbers) {
        numbers[0] = 69;
    }

    static void demoArray(int[] array) {
        array[0] = 99;
    }

    static void printSum3(int... numbers) {

        System.out.println("Length array = " + numbers.length);

        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        System.out.println("Sum = " + sum);
    }

    //    varArgs
    static void printSum2(int x, int... numbers) {

        System.out.println("Length array = " + numbers.length);

        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        System.out.println("x = " + x);
        System.out.println("Sum = " + sum);
    }

    static int demoManyReturn(int x) {
        if (x == 1) {
            return 5;
        } else if (x == 2) {
            return 10;
        } else {
            return 15;
        }
    }

    static void demoReturn(int x) {
        if (x == 1) {
            return;
        }
        System.out.println("qwe");
    }

    static void printSum(int a, int b) {
        System.out.println("Sum a + b = " + (a + b));
        a = 15;
        b = 77;
    }

    static void printHelloWorld() {
        System.out.println("Hello World");
    }

    static void printHelloName(String name) {
        System.out.println("Hello " + name);
    }
}
