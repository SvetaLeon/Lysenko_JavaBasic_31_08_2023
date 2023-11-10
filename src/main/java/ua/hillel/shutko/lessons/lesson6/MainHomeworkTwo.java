package ua.hillel.shutko.lessons.lesson6;

public class MainHomeworkTwo {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; counter < 100 ; i++) {
            if (checkNumber(i)) {
                System.out.println("number: " + i);
                counter++;
            }
        }
        System.out.println("count shuttle: " + counter);
    }

    static boolean checkNumber(int number) {
        int result = number % 10;
        do {
            if (result == 4 || result == 9) {
                return false;
            }
            number /= 10;
            result = number % 10;
        } while (number > 0);
        return true;
    }

    static boolean checkNumberVersion2(int number) {
        String str = String.valueOf(number);
        return !(str.contains("9") || str.contains("4"));
    }
}
