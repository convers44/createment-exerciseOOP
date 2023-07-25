package createment.oop.exercises.part_11_exceptions.exercise_11_2_visa;

public class App {

    private static final VisaRequirement visaRequirement = new VisaRequirement();

    public static void main(String[] args) {
        //TODO: If UnsupportedOperationException thrown show message of "Invalid request"
        // On other type of exception show message of "Unknown error"
        System.out.println("Is visa required: " + isVisaRequired(Country.NL, Country.AU));
    }

    public static boolean isVisaRequired(Country fromCountry, Country toCountry) {
        //TODO: throw UnsupportedOperationException if required
        return visaRequirement.isVisaRequired(fromCountry, toCountry);
    }
}
