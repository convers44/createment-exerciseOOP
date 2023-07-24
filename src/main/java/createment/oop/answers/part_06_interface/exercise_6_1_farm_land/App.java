package createment.oop.answers.part_06_interface.exercise_6_1_farm_land;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<FarmLand> lands = new ArrayList<>();

        lands.add(new CircularFarmLand(100));
        lands.add(new RectangularFarmLand(100, 100));

        for (FarmLand land : lands) {
            System.out.println("Land Area: " + land.getArea());
        }
    }

}
