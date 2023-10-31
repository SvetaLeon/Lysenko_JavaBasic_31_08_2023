package ua.hillel.shutko.lessons.lesson15.carType;

public class CarTypeClass {
//*** клас не може бути private, лише внутрішний клас може бути приватний
    private String type;

    public static final CarTypeClass CAR = new CarTypeClass("Автомобіль");
    public static final CarTypeClass BUS = new CarTypeClass("Автобус");
    public static final CarTypeClass TRUCK = new CarTypeClass("Вантажівка");
    public static final CarTypeClass MOTORCYCLE = new CarTypeClass("Мотоцикл");

    private CarTypeClass(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
