package createment.oop.answers.part_01_java_class.exercise_1_4_static;

public class Car {
    public static final double EXPENSIVE_PRICE = 50_000;

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

    public boolean isExpensive() {
        return getPrice() >= EXPENSIVE_PRICE;
    }

}
