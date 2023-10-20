package ua.hillel.shutko.homework.homework14;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Call from iPhones");
    }

    @Override
    public void sms() {
        System.out.println("Send sms from iPhones");
    }

    @Override
    public void internet() {
        System.out.println("Internet from iPhones");
    }

    @Override
    public void getOSVersion() {
        System.out.println("IOS operating system for iPhones");
    }
}
