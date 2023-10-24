package ua.hillel.shutko.lessons.lesson14.demointerfaces;

public interface Interface2 {

    void methodInterface2();

    default void defaultMethod() {
        System.out.println("From Interface1");
    }
}
