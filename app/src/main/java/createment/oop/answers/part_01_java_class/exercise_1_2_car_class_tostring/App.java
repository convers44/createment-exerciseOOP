package createment.oop.answers.part_01_java_class.exercise_1_2_car_class_tostring;

public class App {

    public static void main(String[] args) {
        Car car1 = new Car(1, "BMW", 10_000, 25_000);
        Car car2 = new Car(2, "VW", 5_000, 15_000);
        Car car3 = new Car(3, "Fiat", 0, 15_000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }

}
