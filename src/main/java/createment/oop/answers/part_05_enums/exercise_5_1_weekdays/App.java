package createment.oop.answers.part_05_enums.exercise_5_1_weekdays;

public class App {

    public static void main(String[] args) {
//        Weekdays today = Weekdays.MONDAY;
//        switch (today) {
//            case SATURDAY, SUNDAY -> System.out.println("Weekend");
//            default -> System.out.println("Working day");
//        }


        // == comparator can be used for Enums
        Weekdays today = Weekdays.MONDAY;
        Weekdays anotherDay = Weekdays.MONDAY;
        if (today == anotherDay) {
            System.out.println("The same day");
        } else {
            System.out.println("Different day");
        }
    }

}
