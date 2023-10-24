package ua.hillel.shutko.lessons.lesson12.Car;

public class Car {

    public int countWheels;
    protected boolean isStart;
    double fuelStatus;
    private String modelName;

    public Car(int countWheels, double fuelStatus, String modelName) {
        this.countWheels = countWheels;
        this.fuelStatus = fuelStatus;
        this.modelName = modelName;
    }

    public void start() {
        startElectronicSystem();
        startFuelElectronicSystem();
        startGPSSystem();
    }

    private void startElectronicSystem() {
        System.out.println("start electronic system...");
    }

    private void startFuelElectronicSystem() {
        System.out.println("start fuel system...");
    }

    private void startGPSSystem() {
        System.out.println("start GPS system...");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }


}
