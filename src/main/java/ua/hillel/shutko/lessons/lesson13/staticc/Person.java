package ua.hillel.shutko.lessons.lesson13.staticc;

public class Person {

    public final static int counter = 1;

    public String name;

//    public Person() {
//        counter++;
//    }

    public static void demoStaticMethod(){
        System.out.println("static method from Person");
//        System.out.println(name); лише static змінні
//        demoNonStaticMethod() лише static method
        System.out.println(counter);
    }

    public void demoNonStaticMethod(){
        System.out.println(name);
        System.out.println(counter);
    }
}
