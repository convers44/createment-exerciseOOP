package createment.oop.answers.part_05_enums.exercise_5_2_flight;

import java.util.ArrayList;
import java.util.List;

public class PassengerManager {

    private final List<Passenger> tickets;

    public PassengerManager() {
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Passenger ticket) {
        this.tickets.add(ticket);
    }

    public void printReport() {
        System.out.println("Passenger Report:\n----------");
        printPassengerReport();

        System.out.println();
        System.out.println("Luggage Report:\n----------");
        printLuggageReport();
    }

    private void printLuggageReport() {
        System.out.println("Total luggage weight: " + totalLuggageWeight());
    }

    private void printPassengerReport() {
        System.out.println("First Class: " + count(FlightClass.FIRST));
        System.out.println("Business Class: " + count(FlightClass.BUSINESS));
        System.out.println("Economy Class: " + count(FlightClass.ECONOMY));
    }

    private int count(FlightClass flightClass) {
        int total = 0;
        for (Passenger t : tickets) {
            if (t.flightClass() == flightClass)
                total++;
        }
        return total;
    }

    private double totalLuggageWeight() {
        double total = 0;
        for (Passenger t : tickets) {
            total += t.luggageWeight();
        }
        return total;
    }
}
