package createment.oop.answers.part_05_enums.exercise_5_3_flight_report;

public class FlightReport {

    private final Flight flight;

    public FlightReport(Flight flight) {
        this.flight = flight;
    }

    public void printReport() {
        for (PassengerType type : PassengerType.values()) {
            printPassengerCount(type);
        }
    }

    private void printPassengerCount(PassengerType type) {
        int count = flight.countPassengers(type);
        System.out.printf("%s - %d\n", typeToString(type), count);
    }

    private String typeToString(PassengerType type) {
        return switch (type) {
            case ADULT -> "Adults";
            case CHILD -> "Children";
            case INFANT -> "Infants";
        };
    }
}
