package ua.hillel.shutko.lessons.lesson14.classes;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car("BMW", 50, 350);
//        car.start();
//        car.drive();
//
//        Car.Door door = new Car.Door("Left door");
//        door.demo();

//        DemoClass demoClass = new DemoClass(); не можна

//        Anonimus anonimus = new Anonimus(); // клас нащадок від класу DemoClass
//        anonimus.demoMethod1();


//        Анонімний клас реалізація без нащадка Anonimus
//        DemoClass demoClass = new DemoClass() {
//            @Override
//            public void demoMethod1() {
//                System.out.println("demo method from anonimus class");
//            }
//
//            @Override
//            public void demoMethod2() {
//
//            }
//
//            @Override
//            public void demoMethod3() {
//
//            }
//        };
//        demoClass.demoMethod1();
//
//
//        // Анонімний інтерфейс
//        DemoInterfaces demoInterfaces = new DemoInterfaces() {
//            @Override
//            public void demoMethod() {
//                System.out.println("demo method from anonimus interfaces");
//            }
//        };
//        demoInterfaces.demoMethod();

//     За допомогою анонімних класів можна оверайдети (@Override) методи для звичаних класів, абстрактних класів
//     і інтерфейсів
        DemoClass2 demoClass2 = new DemoClass2(){
            @Override
            public void method() {
//                super.method();
                System.out.println("FROM MAIN CLASS");
            }

            @Override
            public void method2() {
//                super.method2();
                System.out.println("METHOD 2 FROM MAIN CLASS");
            }
        };
        demoClass2.method();
        demoClass2.method2();
    }
}
