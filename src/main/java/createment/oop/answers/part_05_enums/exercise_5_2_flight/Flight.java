package createment.oop.answers.part_05_enums.exercise_5_2_flight;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private final List<Passenger> passengers;

    public Flight() {
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void printReport() {
        System.out.println("Passenger Report:\n----------");
        printPassengerReport();
    }

    private void printPassengerReport() {
        System.out.println("First Class: " + count(FlightClass.FIRST_CLASS));
        System.out.println("Business Class: " + count(FlightClass.BUSINESS));
        System.out.println("Economy Class: " + count(FlightClass.ECONOMY));
    }

    private int count(FlightClass flightClass) {
        int total = 0;
        for (Passenger t : passengers) {
            if (t.flightClass() == flightClass)
                total++;
        }
        return total;
    }

}
