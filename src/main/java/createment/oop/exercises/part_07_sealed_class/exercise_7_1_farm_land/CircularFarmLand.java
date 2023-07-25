package createment.oop.exercises.part_07_sealed_class.exercise_7_1_farm_land;

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
