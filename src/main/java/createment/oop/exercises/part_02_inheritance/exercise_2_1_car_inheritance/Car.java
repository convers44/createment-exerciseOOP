package createment.oop.exercises.part_02_inheritance.exercise_2_1_car_inheritance;

public class Car {
    private final int caseNumber;
    private final String name;
    private final int mileage;
    private final double price;

    public Car(int caseNumber, String name, int mileage, double price) {
        this.caseNumber = caseNumber;
        this.name = name;
        this.mileage = mileage;
        this.price = price;
    }

    public int getCaseNumber() {
        return caseNumber;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("#%d %s (%dKM, €%.2f)", getCaseNumber(), getName(), getMileage(), getPrice());
    }
}
