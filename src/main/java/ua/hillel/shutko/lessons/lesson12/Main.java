package ua.hillel.shutko.lessons.lesson12;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 7, "black");
        Cat cat2 = new Cat("Barsik", 8, "black");
        Cat cat3 = new Cat("Barsik", 7, "black");


        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));


//        cat.name = "Barsik";
//        cat.age = 7;
//
//        System.out.println();
//
//        Dog dog = new Dog("Sharik", 5);
//        dog.name = "Sharik";
//        dog.age = 5;
//
//        cat.meow();
//        dog.gau();

//        cat.eat();
//
//        CatChild catChild = new CatChild("Tom", 3, "black");
//
//        System.out.println(cat.toString());
    }
}
