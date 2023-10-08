package ua.hillel.lysenko.lessons.lesson10;

public class Person {
    public static void main(String[] args) {

        personInfo("Will", "Smith", "New York", "2936729462846");
        personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        personInfo("Sherlock", "Holmes", "London", "37742123513");

    }

    static void personInfo(String name, String surname, String city, String phone) {
        System.out.println("Call a citizen " + name + " " + surname + " from city " + city + " you can by number " + phone + ".");
    }
}
