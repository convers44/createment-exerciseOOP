package createment.oop.answers.part_01_java_class.exercise_1_1_car_class;

public class App {

    public static void main(String[] args) {
        Car car1 = new Car(1, "BMW", 10_000, 25_000);
        Car car2 = new Car(2, "VW", 5_000, 15_000);

        printCar(car1);
        printCar(car2);
    }

    private static void printCar(Car car) {
        System.out.printf("#%d %s (%dKM, €%.2f)%n",
                car.getCaseNumber(), car.getName(), car.getMileage(), car.getPrice());
    }

}
