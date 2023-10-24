package ua.hillel.shutko.lessons.lesson15.carType;

import ua.hillel.shutko.lessons.lesson15.carType.CarType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println(CarTypeClass.CAR.getType());
//        System.out.println(CarTypeClass.BUS.getType());
//        System.out.println(CarTypeClass.TRUCK.getType());
//        System.out.println(CarTypeClass.MOTORCYCLE.getType());
//        System.out.println(CarTypeClass.MOTORCYCLE);

//        System.out.println();

//        System.out.println(CarType.CAR.getType());
//        System.out.println(CarType.CAR);

//        try {
//            CarType carType = CarType.valueOf("Car");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Wrong name");
//        }

        Scanner scanner = new Scanner(System.in);
        String userValue = scanner.nextLine();
        CarType userCarType = null;

        CarType[] carTypes = CarType.values();

        for (CarType carType : carTypes) {
            if (carType.toString().equals(userValue)) {
                userCarType = CarType.valueOf(userValue);
            }
        }

        if (userCarType != null) {
            System.out.println(userCarType);
            System.out.println(userCarType.getType());
        }


    }
}
