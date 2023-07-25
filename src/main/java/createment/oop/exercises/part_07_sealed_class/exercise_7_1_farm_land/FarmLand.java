package createment.oop.exercises.part_07_sealed_class.exercise_7_1_farm_land;

//TODO: Make this class sealed and only allow CircularFarmLand and RectangularFarmLand inherit it
public abstract class FarmLand {

    private final static double WATER_PER_SQUARE_METER = 0.03;

    public abstract double getArea();

    public double getWaterNeed() {
        return getArea() * WATER_PER_SQUARE_METER * 365;
    }

}
