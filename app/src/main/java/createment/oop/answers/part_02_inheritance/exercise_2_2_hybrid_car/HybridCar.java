package createment.oop.answers.part_02_inheritance.exercise_2_2_hybrid_car;

public class HybridCar extends ElectricCar {

    private final int tankCapacity; // Fuel tank capacity in litre

    public HybridCar(int caseNumber, int batteryCapacity, int tankCapacity) {
        super(caseNumber, batteryCapacity);
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    @Override
    public String toString() {
        return String.format("Hybrid Car #%d, battery: %dKwh, fuel: %dLitre",
                getCaseNumber(), getBatteryCapacity(), getTankCapacity());
    }
}
