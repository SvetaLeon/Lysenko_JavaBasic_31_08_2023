package ua.hillel.shutko.lessons.lesson12;

import java.util.Objects;

public class Cat extends Animal {

    private String color;
    public Cat(String name, int age) {
        super(name, age);
        System.out.println("from Cat");
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
        System.out.println(color);
    }

//    public Cat() {
//        System.out.println("from Cat");
//    }

    public void meow() {
        System.out.println("meow meow meow");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Cat " + name + " eating...");
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//
//        Cat cat = (Cat) o;
//
//        return Objects.equals(color, cat.color);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cat)) {
            return false;
        }

        Cat cat = (Cat) o;

        return (color != null ? color.equals(cat.color) : cat.color == null)
                && name.equals(cat.name)
                && age == cat.age;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
