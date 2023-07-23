package createment.oop.answers.part_05_enums.exercise_5_2_flight;

public class App {

    public static void main(String[] args) {
        PassengerManager ticketManager = new PassengerManager();
        ticketManager.addTicket(new Passenger("A", FlightClass.ECONOMY, 25));
        ticketManager.addTicket(new Passenger("B", FlightClass.ECONOMY, 20));
        ticketManager.addTicket(new Passenger("C", FlightClass.ECONOMY, 28));
        ticketManager.addTicket(new Passenger("D", FlightClass.BUSINESS, 25));

        ticketManager.printReport();
    }

}
