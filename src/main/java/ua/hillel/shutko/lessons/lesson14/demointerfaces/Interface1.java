package ua.hillel.shutko.lessons.lesson14.demointerfaces;

public interface Interface1 {
    void methodInterface1();

    default void defaultMethod() {
        System.out.println("From Interface1");
    }
}
