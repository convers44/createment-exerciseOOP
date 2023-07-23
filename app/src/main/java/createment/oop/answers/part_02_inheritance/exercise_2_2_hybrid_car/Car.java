package createment.oop.answers.part_02_inheritance.exercise_2_2_hybrid_car;

public class Car {
    private final int caseNumber;
    // NOTE: Other properties not defined for the sake of simplicity

    public Car(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    public int getCaseNumber() {
        return caseNumber;
    }

    @Override
    public String toString() {
        return String.format("Car #%d", getCaseNumber());
    }
}
