package createment.oop.answers.part_05_enums.exercise_5_3_flight_report;

public class App {

    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.addPassenger(new Passenger("A", 10));
        flight.addPassenger(new Passenger("B", 19));
        flight.addPassenger(new Passenger("C", 20));

        FlightReport report = new FlightReport(flight);
        report.printReport();
    }

}
