package ua.hillel.lysenko.lessons.lesson10;

public class Person {
    public static void main(String[] args) {

        String person1 = personInfo("Will", "Smith", "New York", "2936729462846");
        String person2 = personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        String person3 = personInfo("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

    static String personInfo(String name, String surname, String city, String phone) {
        return "Call a citizen " + name + " " + surname + " from city " + city + " you can by number " + phone + ".";
    }
}
