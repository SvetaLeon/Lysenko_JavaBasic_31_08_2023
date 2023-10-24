package ua.hillel.shutko.lessons.lesson15.carType;

public enum CarType {
    CAR("Автомобіль"), // за замовченням public static final
    BUS("Автобус"),
    TRUCK("Вантажівка", 50),
    MOTORCYCLE("Мотоцикл");

    private String type;
    private int x;

    CarType(String type) {
        this.type = type;
    }

    CarType(String type, int x) {
        this.type = type;
        this.x = x;
    }

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }
}
