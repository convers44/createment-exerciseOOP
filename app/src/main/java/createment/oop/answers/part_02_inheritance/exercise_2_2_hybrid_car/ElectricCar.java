package createment.oop.answers.part_02_inheritance.exercise_2_2_hybrid_car;

public class ElectricCar extends Car {

    private final int batteryCapacity;

    public ElectricCar(int caseNumber, int batteryCapacity) {
        super(caseNumber);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return String.format("Electric Car #%d, battery: %dKwh",
                getCaseNumber(), getBatteryCapacity());
    }
}
