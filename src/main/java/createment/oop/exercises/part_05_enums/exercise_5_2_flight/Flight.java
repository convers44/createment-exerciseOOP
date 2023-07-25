package createment.oop.exercises.part_05_enums.exercise_5_2_flight;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private final List<Passenger> passengerList = new ArrayList<>();

    public Flight() {

    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }


    public void printReport() {
        for (FlightClass flightClass : FlightClass.values()) {
            String title = switch (flightClass) {
                case ECONOMY -> "Economy";
                case BUSINESS -> "Business";
                case FIRST_CLASS -> "First Class";
            };
            System.out.println(title + ": " + countPassengers(flightClass));
        }
    }

    private int countPassengers(FlightClass flightClass) {
        int total = 0;
        for (Passenger passenger : passengerList) {
            if (passenger.flightClass() == flightClass)
                total++;
        }
        return total;
    }
}
