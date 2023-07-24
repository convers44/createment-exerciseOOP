package createment.oop.answers.part_07_sealed_class.exercise_7_1_farm_land;

public abstract sealed class FarmLand permits CircularFarmLand, RectangularFarmLand {

    private final static double WATER_PER_SQUARE_METER = 0.03;

    public abstract double getArea();

    public double getWaterNeed() {
        return getArea() * WATER_PER_SQUARE_METER * 365;
    }

}
