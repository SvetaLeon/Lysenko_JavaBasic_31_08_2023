package ua.hillel.shutko.lessons.lesson13.staticc;

public class Main {

    public static void main(String[] args) {

//        Person.counter = 1;
        Person.demoStaticMethod();
        PersonChild personChild = new PersonChild();
        personChild.name = "personChild1";
        personChild.demoNonStaticMethod();

        Person person1 = new Person();
        person1.name = "person1";
        Person person2 = new Person();
        person2.name = "person2";
        Person person3 = new Person();
        person3.name = "person3";

        System.out.println(Person.counter);
        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);
    }
}
