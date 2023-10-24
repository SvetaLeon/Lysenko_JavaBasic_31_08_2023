package ua.hillel.shutko.lessons.lesson12;

public class CatChild extends Cat {
    public CatChild(String name, int age, String color) {
        super(name, age, color);
        System.out.println("Name: " + name + ", age: " + age + ", color: " + color);
    }
}
