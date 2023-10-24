package ua.hillel.shutko.lessons.lesson13.demo;

public class Main {
    public static void main(String[] args) {

        Class1 obj = new Class4();

        if (obj != null) {
            obj.demoMethod1();
            ((Class2) obj).demoMethod2();
            ((Class3) obj).demoMethod3();
            ((Class4) obj).demoMethod4();
        }
    }
}
