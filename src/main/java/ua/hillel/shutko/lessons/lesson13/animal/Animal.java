package ua.hillel.shutko.lessons.lesson13.animal;

public abstract class Animal {

   private String name;
    private int age;

    public abstract void run();

    public void swim(){
        System.out.println("Animal swim");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
