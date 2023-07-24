package createment.oop.answers.part_03_abstract.exercise_3_1_farm_land;

public class App {

    public static void main(String[] args) {
        FarmLand cLand = new CircularFarmLand(100);
        FarmLand rLand = new RectangularFarmLand(100,100);

        System.out.println("Water need land 1: " + cLand.getWaterNeed());
        System.out.println("Water need land 2: " + rLand.getWaterNeed());
    }

}
