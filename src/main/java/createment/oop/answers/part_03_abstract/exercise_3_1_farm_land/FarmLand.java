package createment.oop.answers.part_03_abstract.exercise_3_1_farm_land;

public abstract class FarmLand {

    private final static double WATER_PER_SQUARE_METER = 0.03;

    public abstract double getArea();

    public double getWaterNeed() {
        return getArea() * WATER_PER_SQUARE_METER * 365;
    }

}
