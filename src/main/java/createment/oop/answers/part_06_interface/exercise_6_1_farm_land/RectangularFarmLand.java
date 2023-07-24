package createment.oop.answers.part_06_interface.exercise_6_1_farm_land;

public record RectangularFarmLand(int width, int height) implements FarmLand {

    @Override
    public double getArea() {
        return width() * height();
    }

}
