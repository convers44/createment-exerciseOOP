package createment.oop.answers.part_05_enums.exercise_5_3_flight_report;

public record Passenger(String name, int age) {

    public PassengerType passengerType() {
        if (age <= 2)
            return PassengerType.INFANT;
        else if (age <= 12)
            return PassengerType.CHILD;
        else
            return PassengerType.ADULT;
    }

}
