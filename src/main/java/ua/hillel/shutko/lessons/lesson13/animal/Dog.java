package ua.hillel.shutko.lessons.lesson13.animal;

public class Dog extends Animal {

    public String color = "Black";

    @Override
    public void run() {
        System.out.println("Dog " + getName() + " run");
    }

    public void gau(){
        System.out.println(getName() + " gau gau gau");
    }
}
