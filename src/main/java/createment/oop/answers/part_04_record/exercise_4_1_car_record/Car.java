package createment.oop.answers.part_04_record.exercise_4_1_car_record;

public record Car(int caseNumber,
                  String name,
                  int mileage,
                  double price) {
    public String toString() {
        return String.format("#%d %s (%dKM, €%.2f)", caseNumber, name, mileage, price);
    }
}
