package ua.hillel.shutko.lessons.lesson12;

public class MainFitnessTracker {
    public static void main(String[] args) {
        FitnessTracker userFitnessTracker1 = new FitnessTracker("Olga", "Sumska",
                22, 8, 1966, "olga@gmail", "0670551221",
                62, 70, 6000);
        userFitnessTracker1.printAccountInfo();

        FitnessTracker userFitnessTracker2 = new FitnessTracker("Andriy", "Shevchenko",
                29, 9, 1976, "andriy@gmail", "0664455666",
                88, 65, 10000);
        userFitnessTracker2.printAccountInfo();

        FitnessTracker userFitnessTracker3 = new FitnessTracker("Tom", "Cruise",
                3, 7, 1962, "tom@gmail", "0630813777",
                94, 75, 9300);
        userFitnessTracker3.printAccountInfo();

        userFitnessTracker1.setLastName("Borysyuk");
        userFitnessTracker1.setWeight(61);
        userFitnessTracker1.setNumberOfStepsTaken(7200);
        userFitnessTracker1.printAccountInfo();

        userFitnessTracker3.setPressure(80);
        userFitnessTracker3.setNumberOfStepsTaken(9560);
        userFitnessTracker3.printAccountInfo();

    }
}
