package ua.hillel.shutko.lessons.lesson14.interfaces;

public class Bird implements Flyible, Swimable {
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void fly2() {
        Flyible.super.fly2();
    }

    @Override
    public void swim() {
        System.out.println("Bird swim");
    }
}
