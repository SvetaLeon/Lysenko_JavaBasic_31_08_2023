package ua.hillel.shutko.lessons.lesson15.driverLicense;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    /*
        створіть клас Exam, у ньому попросіть користувача ввести тип
        транспортного засобу:
        MOTORCYCLE, CAR, BUS, TRUCK
        b. залежно від вибраного виду, виведіть літеру категорії прав, яка
        необхідна для керування цим транспортним засобом.
        приклад: MOTO = A, CAR = B
        c. виведіть у консоль букву категорії:
        "Для керування CAR необхідна категорія В"
        d. для кожної категорії створіть метод, який приймає на вхід
        кількість років досвіду водіння (вводимо з консолі), в якому рахуйте
        чи достатньо в людини досвіду щоб водити це транспортне
        засіб. З такими параметрами:
        А: від 3 років досвіду водіння
        В: від 0 років досвіду
        C: від 5 років досвіду
        D: від 7 років досвіду
        e. викликайте відповідний метод у switch
        f. створіть клас DriverLicense і якщо користувач може отримати права -
        створюйте йому екземпляр прав
 */
    public static void main(String[] args) {
        runAPP();
        System.out.println("Count driver license " + DriverLicense.COUNTER_DRIVER_LICENSE);
    }

    static void runAPP() {

        Scanner scanner = new Scanner(System.in);
        CarType carType = null;
        int years = 0;
        CarType[] carTypes = CarType.values();

        for (int i = 0; i < 3; i++) {

            while (carType == null) {
                System.out.println("Please enter transport type from list: " + Arrays.toString(carTypes));
                String userValueCarType = scanner.nextLine().toUpperCase();
                for (CarType type : carTypes) {
                    if (userValueCarType.equals(type.toString())) {
                        carType = CarType.valueOf(userValueCarType);
                        break;
                    }
                }
            }

            while (true) {
                System.out.println("Please enter driver experience");
                if (scanner.hasNextInt()) {
                    years = scanner.nextInt();
                    scanner.nextLine();

                    if (years >= 0 && years <= 80) {
                        break;
                    } else {
                        System.out.println("Please enter number from 0 to 80");
                    }

                } else {
                    System.out.println("Please enter correct value!!!");
                    scanner.nextLine();
                }
            }

            boolean ok = false;

            switch (carType) {
                case MOTORCYCLE: {
                    System.out.println("For " + CarType.MOTORCYCLE + " need category " + Category.A);
                    ok = checkYears(years, Category.A);
                    break;
                }
                case CAR: {
                    System.out.println("For " + CarType.CAR + " need category " + Category.B);
                    ok = checkYears(years, Category.B);
                    break;
                }
                case TRUCK: {
                    System.out.println("For " + CarType.TRUCK + " need category " + Category.C);
                    ok = checkYears(years, Category.C);
                    break;
                }
                case BUS: {
                    System.out.println("For " + CarType.BUS + " need category " + Category.D);
                    ok = checkYears(years, Category.D);
                    break;
                }
            }

            if (ok) {
                new DriverLicense();
                System.out.println("Take your driver license");
            } else {
                System.out.println("You need more drive experience");
            }

            carType = null;
        }
    }

    static boolean checkYears(int years, Category category) {

        switch (category) {
            case A: {
                return years >= 3;
            }

            case B: {
                return years >= 0;
            }

            case C: {
                return years >= 5;
            }

            case D: {
                return years >= 7;
            }

            default: {
                return false;
            }
        }
    }
}
