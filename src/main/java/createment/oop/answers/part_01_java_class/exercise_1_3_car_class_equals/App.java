package createment.oop.answers.part_01_java_class.exercise_1_3_car_class_equals;

public class App {

    public static void main(String[] args) {
        Car car1 = new Car(1, "BMW", 10_000, 25_000);
        Car car2 = new Car(1, "BMW", 10_000, 25_000);

        if (car1.equals(car2)) {
            System.out.println("Cars are equal");
        } else {
            System.out.println("Cars are NOT equal");
        }
    }

}
