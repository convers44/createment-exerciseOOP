package createment.oop.answers.part_05_enums.exercise_5_3_flight_report;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private final List<Passenger> passengers;

    public Flight() {
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public int countPassengers(PassengerType passengerType) {
        int total = 0;

        for (Passenger p : passengers) {
            if (passengerType == null || passengerType == p.passengerType())
                total++;
        }

        return total;
    }
}
