package createment.oop.answers.part_02_inheritance.exercise_2_1_car_inheritance;

public class PetrolCar extends Car {

    private final int tankCapacity;

    public PetrolCar(int caseNumber, String name, int mileage, double price, int tankCapacity) {
        super(caseNumber, name, mileage, price);
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public String toString() {
        return String.format("#%d %s (%dKM, €%.2f, %dLitre)",
                getCaseNumber(), getName(), getMileage(), getPrice(), getTankCapacity());
    }
}
