package ua.hillel.shutko.lessons.lesson13.staticc;

public class PersonChild extends Person {

    public static void demoStaticMethod(){
        System.out.println("static method from PersonChild");
    }

    @Override
    public void demoNonStaticMethod() {
        super.demoNonStaticMethod();
    }
}
