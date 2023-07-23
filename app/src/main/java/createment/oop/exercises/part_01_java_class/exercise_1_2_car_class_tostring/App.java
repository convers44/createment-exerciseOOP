package createment.oop.exercises.part_01_java_class.exercise_1_2_car_class_tostring;

public class App {

    public static void main(String[] args) {
        //TODO: Update the car class in a way the following code print the following message
        // #1 BMW (10000KM, €25000.00)
        // #2 VW (5000KM, €15000.00)
        // #3 Fiat (0KM, €15000.00)
        Car car1 = new Car(1, "BMW", 10_000, 25_000);
        Car car2 = new Car(2, "VW", 5_000, 15_000);
        Car car3 = new Car(3, "Fiat", 0, 15_000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }

}
