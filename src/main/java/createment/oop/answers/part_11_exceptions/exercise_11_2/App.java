package createment.oop.answers.part_11_exceptions.exercise_11_2;

public class App {

    private static final VisaRequirement visaRequirement = new VisaRequirement();

    public static void main(String[] args) {
        try {
            System.out.println("Is visa required: " + isVisaRequired(Country.NL, Country.NL));
        } catch (UnsupportedOperationException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unknown exception");
        }
    }

    public static boolean isVisaRequired(Country fromCountry, Country toCountry) {
        if (fromCountry == toCountry)
            throw new UnsupportedOperationException("from and to cannot be the same");
        if (fromCountry == null || toCountry == null)
            throw new RuntimeException("to or from cannot be null");

        return visaRequirement.isVisaRequired(fromCountry, toCountry);
    }
}
