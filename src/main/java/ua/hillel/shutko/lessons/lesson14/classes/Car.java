package ua.hillel.shutko.lessons.lesson14.classes;

import ua.hillel.shutko.lessons.lesson14.demointerfaces.Interface1;
import ua.hillel.shutko.lessons.lesson14.demointerfaces.Interface2;

public class Car {

    private String modelName;
    private double fuelStatus;
    private boolean isStart;
    private Engine engine;
    private static int demoVariable;

    public Car(String modelName, double fuelStatus, double horsePower) {
        this.modelName = modelName;
        this.fuelStatus = fuelStatus;
        this.engine = new Engine(horsePower);
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void drive() {
        if (isStart) {
            System.out.println("Car " + modelName + " rides");
        } else {
            System.out.println("Car " + modelName + " cant move");
        }
    }

    // не можна, внутрішні змінні та методи класу Engine не доступні
//    void demo() {
//    System.out.println(horsePower);
//    start();
//    }

    //    Вкладений клас може наслідуватися від іншого вкладеного класу
    class Engine2 extends Engine {

        public Engine2(double horsePower) {
            super(horsePower);
        }
    }


    // Вкладений клас має доступ до всіх змінних та методів завнішнього класу. Може наслідувати (extends) та
    // имплементувати інтерфейс (implements)
    class Engine extends Class1 implements Interface1 {
        double horsePower;

        public Engine(double horsePower) {
            this.horsePower = horsePower;
        }

        public void start() {
            isStart = true;
        }

        public void stop() {
            isStart = false;
        }

        void demo() {
            System.out.println(modelName);
            System.out.println(demoVariable);
        }

        @Override
        public void methodInterface1() {

        }
    }

    // Вкладений статичний клас
    static class Door {
        String title;

        public Door(String title) {
            this.title = title;
        }

        // внутрішній static class має доступ лише до статичних змінних та статичних методів зовнішнього класу
//            void demo() {
//                System.out.println(modelName);
//            }

        void demo() {
            System.out.println(demoVariable);
        }
    }

    // Локальний Class можна створювати в середені будь якого місця програми наприклад в методі, в if, else, циклах,
    // будь де. Користуватися цим класом можна лише в тому місці де ми його створили
    public void demoLocalClass() {
        // Може наслідувати (extends) та имплементувати інтерфейс (implements)
        class LocalClass extends Engine implements Interface2 {
            int variable = 10;

            public LocalClass(double horsePower, int variable) {
                super(horsePower);
                this.variable = variable;
            }

            public LocalClass(double horsePower) {
                super(horsePower);
            }

            void method() {

            }

            @Override
            public void methodInterface2() {

            }

            @Override
            public void defaultMethod() {
                super.defaultMethod();
            }
        }

        LocalClass localClass = new LocalClass(111);
        localClass.method();
        localClass.variable = 222;
        System.out.println(localClass.variable);
    }

    // Змінні, об'єкти та методи з Локального Class не доступні в інших містах класу
//    public void demoLocalClass2() {
//        LocalClass localClass = new LocalClass(111);
//        localClass.method();
//        localClass.variable = 222;
//        System.out.println(localClass.variable);
//    }

}

