package ua.hillel.shutko.lessons.lesson13.animal;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Barsik");

//        cat.run();
//        cat.swim();

        Animal animal = new Dog();
        animal.setName("Sharik");

//        animal.run();

        demo(cat);
        demo(animal);

//        Кастування
//        if (animal instanceof Dog){
//        ((Dog) animal).gau();
//
//        }
//
//        if (animal instanceof Cat){
//            ((Cat) animal).meow();
//        }
//
//        System.out.println(((Dog) animal).color);
    }

    static public void demo(Animal animal){
        if (animal instanceof Dog){
            ((Dog) animal).gau();

        }

        if (animal instanceof Cat){
            ((Cat) animal).meow();
        }
    }
}
