package ua.hillel.shutko.homework.homework10;

import java.util.Scanner;

public class PersonVersionTwo {
    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name");
        String name;
        name = sc.nextLine();

        System.out.println("Enter a surname");
        String surname;
        surname = sc.nextLine();

        System.out.println("Enter the name of the city");
        String city;
        city = sc.nextLine();

        System.out.println("Enter the phone number");
        String phone;
        phone = sc.nextLine();

        System.out.println(personInfo(name, surname, city, phone));
    }

    static String personInfo(String name, String surname, String city, String phone) {
        return "Call a citizen " + name + " " + surname + " from city " + city + " you can by number " + phone + ".";
    }

}

