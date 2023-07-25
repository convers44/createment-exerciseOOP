package createment.oop.answers.part_03_abstract.exercise_3_1_farm_land;

public class CircularFarmLand extends FarmLand {

    private final int radius;

    public CircularFarmLand(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
