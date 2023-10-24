package ua.hillel.shutko.lessons.lesson12;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
        System.out.println("from Dog");
    }

    public void gau(){
        System.out.println("gau gau gau");
    }
}
