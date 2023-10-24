package ua.hillel.shutko.homework.homework12;

public class FitnessTracker {

    private final String firstName;
    String lastName;
    private final int dateOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;
    int weight;
    int pressure;
    int numberOfStepsTaken;
    private final int ageUser;

    public FitnessTracker(String firstName, String lastName, int dateOfBirth, int monthOfBirth, int yearOfBirth,
                          String email, String phone, int weight, int pressure, int numberOfStepsTaken) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        ageUser = (2023 - this.yearOfBirth);
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfStepsTaken = numberOfStepsTaken;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setNumberOfStepsTaken(int numberOfStepsTaken) {
        this.numberOfStepsTaken = numberOfStepsTaken;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public void printAccountInfo() {
        System.out.println("User: " + getFirstName() + " " + lastName);
        System.out.println("Date of birth: " + getDateOfBirth() + "." + getMonthOfBirth() + "." + getYearOfBirth());
        System.out.println("Age: " + getAgeUser());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + pressure);
        System.out.println("The number of steps taken per day: " + numberOfStepsTaken);
        System.out.println();
    }

}

