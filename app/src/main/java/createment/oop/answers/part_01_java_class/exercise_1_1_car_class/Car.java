package createment.oop.answers.part_01_java_class.exercise_1_1_car_class;

import java.util.Objects;

public class Car {

    private final int caseNumber;
    private final String name;
    private final int mileage;
    private final double price;

    public Car(int caseNumber, String brand, int mileage, double price) {
        this.caseNumber = caseNumber;
        this.name = brand;
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

    public boolean equals(Object o) {
        if (o == null) return false;
        Car other = (Car) o;
        return other.caseNumber == this.caseNumber;
    }

    public int hashCode() {
        return Objects.hash(caseNumber);
    }

    protected Object clone() throws CloneNotSupportedException {
        return new Car(this.caseNumber, this.name, this.mileage, this.price);
    }

    public String toString() {
        return String.format("#%d %s (%dKM, €%.2f)", getCaseNumber(), getName(), getMileage(), getPrice());
    }
}
