package createment.oop.answers.part_02_inheritance.exercise_2_1_car_inheritance;

public class ElectricCar extends Car {

    private final int batteryCapacity;

    public ElectricCar(int caseNumber, String name, int mileage, double price, int batteryCapacity) {
        super(caseNumber, name, mileage, price);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String toString() {
        return String.format("#%d %s (%dKM, €%.2f, %dKwh)",
                getCaseNumber(), getName(), getMileage(), getPrice(), getBatteryCapacity());
    }
}
