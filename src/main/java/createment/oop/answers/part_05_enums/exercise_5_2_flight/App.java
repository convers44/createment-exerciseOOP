package createment.oop.answers.part_05_enums.exercise_5_2_flight;

public class App {

    public static void main(String[] args) {
        Flight ticketManager = new Flight();
        ticketManager.addPassenger(new Passenger("A", FlightClass.ECONOMY));
        ticketManager.addPassenger(new Passenger("B", FlightClass.ECONOMY));
        ticketManager.addPassenger(new Passenger("C", FlightClass.ECONOMY));
        ticketManager.addPassenger(new Passenger("D", FlightClass.BUSINESS));

        ticketManager.printReport();
    }

}
