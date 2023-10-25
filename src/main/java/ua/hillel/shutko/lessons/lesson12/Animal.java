package ua.hillel.shutko.lessons.lesson12;

public class Animal {

    protected String name;

    protected int age;

//    public Animal() {
//        System.out.println("from Animal");
//    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("from Animal");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void eat() {
        System.out.println("Animal eating...");
    }
}
