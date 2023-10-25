package ua.hillel.shutko.lessons.lesson12.Car;

import ua.hillel.shutko.lessons.lesson12.Car.Car;

public class MainCar {
    public static void main(String[] args) {

        Car car = new Car(4, 50.5, "BMW");

        car.start();

        car.setModelName("Audi");
        System.out.println(car.getModelName());

    }
}
