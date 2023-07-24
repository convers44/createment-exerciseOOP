package createment.oop.answers.part_02_inheritance.exercise_2_1_car_inheritance;

public class App {

    public static void main(String[] args) {
        Car car1 = new ElectricCar(1, "BMW i3", 10_000, 15_000, 450);
        Car car2 = new PetrolCar(2, "Toyota Yaris", 5_000, 8_000, 30);

        System.out.println(car1);
        System.out.println(car2);
    }

}
