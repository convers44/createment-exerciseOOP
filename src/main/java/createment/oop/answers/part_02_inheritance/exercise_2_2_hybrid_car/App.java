package createment.oop.answers.part_02_inheritance.exercise_2_2_hybrid_car;

public class App {

    public static void main(String[] args) {
        HybridCar hybridCar = new HybridCar(1, 400, 50);

        Car car = hybridCar;
        System.out.println(car);
    }

}
