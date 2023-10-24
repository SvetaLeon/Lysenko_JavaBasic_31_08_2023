package ua.hillel.shutko.lessons.lesson14.interfaces;

import ua.hillel.shutko.lessons.lesson14.interfaces.Airplane;
import ua.hillel.shutko.lessons.lesson14.interfaces.Bird;
import ua.hillel.shutko.lessons.lesson14.interfaces.Bird2;
import ua.hillel.shutko.lessons.lesson14.interfaces.Flyible;

public class Main {
    public static void main(String[] args) {

//        Flyible bird = new Bird();
//        Flyible airplane = new Airplane();

//        bird.fly();
//        bird.fly2();
//        airplane.fly();
//        airplane.fly2();


//        Swimable bird2 = new Bird();
//        bird2.fly();
//        bird2.swim();
//
//        if (bird2 instanceof Bird) {
//            ((Bird) bird2).fly();
//        }
//
//        System.out.println(Flyible.distance);

        Flyible[] flyibles = {
                new Bird(),
                new Bird(),
                new Bird(),
                new Airplane(),
                new Airplane(),
                new Airplane()
        };


        for (Flyible flyible : flyibles) {
            flyible.fly();
        }


//        Bird bird1 = new Bird();
//        Bird2 bird2 = new Bird2();
//
//
//        bird2.distance = 102;

        // не можна з інтерфейсу і абстрактного класу зробити об'кти
//        Flyible flyible = new Flyible();
//        FlyibleClass flyible2 = new FlyibleClass();
    }
}
