package createment.oop.exercises.part_11_exceptions.exercise_11_2_visa;

import java.util.ArrayList;
import java.util.List;

public class VisaRequirement {

    private final List<String> visaFree = new ArrayList<>();

    public VisaRequirement() {
        addVisaFree(Country.NL, Country.AU);
        addVisaFree(Country.US, Country.AU);
        addVisaFree(Country.NL, Country.UK);
    }

    public void addVisaFree(Country fromCountry, Country toCountry) {
        visaFree.add(fromCountry.toString() + toCountry.toString());
    }

    public boolean isVisaRequired(Country fromCountry, Country toCountry) {
        return visaFree.contains(fromCountry.toString() + toCountry.toString());
    }
}
