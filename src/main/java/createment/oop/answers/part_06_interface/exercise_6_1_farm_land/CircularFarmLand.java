package createment.oop.answers.part_06_interface.exercise_6_1_farm_land;

public record CircularFarmLand(int radius) implements FarmLand {

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
