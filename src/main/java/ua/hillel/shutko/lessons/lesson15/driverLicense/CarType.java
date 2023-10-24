package ua.hillel.shutko.lessons.lesson15.driverLicense;

public enum CarType {
    CAR("Автомобіль"),
    BUS("Автобус"),
    TRUCK("Вантажівка"),
    MOTORCYCLE("Мотоцикл");

    private final String type;

    CarType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
