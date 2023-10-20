package ua.hillel.shutko.homework.homework14;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Call from Android");
    }

    @Override
    public void sms() {
        System.out.println("Send sms from Android");
    }

    @Override
    public void internet() {
        System.out.println("Internet from Android");
    }

    @Override
    public void getOSVersion() {
        System.out.println("LinuxOS operating system for Android");
    }
}
