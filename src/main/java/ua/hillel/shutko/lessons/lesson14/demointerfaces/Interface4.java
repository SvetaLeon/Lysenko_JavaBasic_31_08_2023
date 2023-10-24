package ua.hillel.shutko.lessons.lesson14.demointerfaces;

public interface Interface4 extends Interface1, Interface2 {
    @Override
    default void defaultMethod() {
        Interface1.super.defaultMethod();
        Interface2.super.defaultMethod();
        System.out.println("From Interface4");
    }
}
