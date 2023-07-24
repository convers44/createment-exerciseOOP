package createment.oop.answers.part_01_java_class.exercise_1_4_static;


public class App {

    public static void main(String[] args) {
        Car car1 = new Car(1, "BMW i3", 0, 55_000);
        Car car2 = new Car(2, "Toyota Prius", 0, 25_000);

        System.out.println("Is car 1 expensive: " + car1.isExpensive());
        System.out.println("Is car 2 expensive: " + car2.isExpensive());
    }

}
