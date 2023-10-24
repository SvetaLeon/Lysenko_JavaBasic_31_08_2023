package ua.hillel.shutko.lessons.lesson11;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("BMW", 2020);

//        bmw.model = "BMW X5";
//        bmw.year = 2019;
//
//        System.out.println(bmw.model);
//        System.out.println(bmw.year);
        System.out.println(bmw.getCarInfo());
        bmw.start();
        bmw.run();
        bmw.stop();

        System.out.println();

        Car audi = new Car("Audi");

        audi.model = "Audi Q7";
        audi.year = 2017;

//        System.out.println(audi.model);
//        System.out.println(audi.year);
        System.out.println(audi.getCarInfo());
        audi.start();
        audi.run();
        audi.stop();
    }
}
