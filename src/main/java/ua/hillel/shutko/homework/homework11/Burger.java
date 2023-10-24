package ua.hillel.shutko.homework.homework11;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    boolean withDoubleMeat;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(getRegularBurgerInfo());
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println(getDietBurgerInfo());
    }


    public Burger(String bun, boolean withDoubleMeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.withDoubleMeat = withDoubleMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(getWithDoubleMeatBurgerInfo());
    }

    String getRegularBurgerInfo() {
        return "Склад звичайного бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise;
    }

    String getDietBurgerInfo() {
        return "Склад дієтичного бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens;
    }

    String getWithDoubleMeatBurgerInfo() {
        if (withDoubleMeat) {
            String doubleMeat = "подвійне м'ясо";
            return "Склад бургера з подвійним м'ясом: " + bun + ", " + doubleMeat + ", " + cheese + ", " + greens + ", " + mayonnaise;
        } else {
            return "Бургер з подвійним м'ясом може бути тільки з подвійним м'ясом";
        }
    }

}
