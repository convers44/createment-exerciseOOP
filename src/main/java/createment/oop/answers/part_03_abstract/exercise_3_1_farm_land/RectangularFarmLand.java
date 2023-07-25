package createment.oop.answers.part_03_abstract.exercise_3_1_farm_land;

public class RectangularFarmLand extends FarmLand {

    private final int width;
    private final int height;

    public RectangularFarmLand(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }
}
