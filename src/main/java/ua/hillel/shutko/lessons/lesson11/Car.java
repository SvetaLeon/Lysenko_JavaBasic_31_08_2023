package ua.hillel.shutko.lessons.lesson11;

public class Car {

    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(int year) {
        this.year = year;
    }

    void start() {
        System.out.println(model + " star...");
    }

    void stop() {
        System.out.println(model + " stop...");
    }

    void run() {
        System.out.println(model + " run...");
    }

    String getCarInfo() {
        return "Car model: " + model + " , year: " + year;
    }
}
