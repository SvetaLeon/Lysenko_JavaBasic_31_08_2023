package ua.hillel.shutko.lessons.lesson14.interfaces;

public abstract class FlyibleClass {
    int distance = 100;

    public abstract void fly();

    public void fly2() {
        System.out.println("method fly2 from interface");
    }
}
