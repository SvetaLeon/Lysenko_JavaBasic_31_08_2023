package ua.hillel.shutko.lessons.lesson11;

public class BurgerVersionTwo {
    String ingredient1 = "bun";
    String ingredient2 = "meat";
    String ingredient3 = "cheese";
    String ingredient4 = "greens";
    String ingredient5 = "mayonnaise";
    boolean withDoubleMeat;

    public BurgerVersionTwo(String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
        this.ingredient4 = ingredient4;
        this.ingredient5 = ingredient5;

        System.out.println(getRegularBurgerInfo());
    }

    public BurgerVersionTwo(String ingredient1, String ingredient2, String ingredient3, String ingredient4) {
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
        this.ingredient4 = ingredient4;

        System.out.println(getDietBurgerInfo());
    }

    public BurgerVersionTwo(String ingredient1, boolean withDoubleMeat, String ingredient3, String ingredient4, String ingredient5) {
        this.ingredient1 = ingredient1;
        this.withDoubleMeat = withDoubleMeat;
        this.ingredient3 = ingredient3;
        this.ingredient4 = ingredient4;
        this.ingredient5 = ingredient5;

        System.out.println(getWithDoubleMeatBurgerInfo());
    }

    String getRegularBurgerInfo() {
        return "Composition of a regular burger: " + ingredient1 + ", " + ingredient2 + ", " + ingredient3 + ", " + ingredient4 + ", " + ingredient5;
    }

    String getDietBurgerInfo() {
        return "Composition of a diet burger: " + ingredient1 + ", " + ingredient2 + ", " + ingredient3 + ", " + ingredient4;
    }

    String getWithDoubleMeatBurgerInfo() {
        if (withDoubleMeat) {
            String ingredient = "with double meat";
            return "Composition of a with double meat burger: " + ingredient1 + ", " + ingredient + ", " + ingredient3 + ", " + ingredient4 + ", " + ingredient5;
        } else
            return "Composition of a regular burger: " + ingredient1 + ", " + ingredient2 + ", " + ingredient3 + ", " + ingredient4 + ", " + ingredient5;
    }
}
