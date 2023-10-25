package ua.hillel.shutko.lessons.lesson13.animal;

public class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("Cat " + getName() + " run");
    }

    public void meow(){
        System.out.println(getName() + " meow meow meow");
    }
}
