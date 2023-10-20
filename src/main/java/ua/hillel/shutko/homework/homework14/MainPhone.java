package ua.hillel.shutko.homework.homework14;

public class MainPhone {
    public static void main(String[] args) {

        Smartphones[] smartphone = {
                new Androids(),
                new IPhones()
        };

        for (Smartphones smartphones : smartphone) {
            smartphones.call();
            smartphones.sms();
            smartphones.internet();
            System.out.println();
        }

        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.getOSVersion();

        System.out.println();

        IPhones iPhone = new IPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.getOSVersion();
    }
}
