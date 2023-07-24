package createment.oop.answers.part_01_java_class.exercise_1_6_library;

public class Book {
    private final String title;
    private boolean isCheckout;

    public Book(String name, boolean isCheckout) {
        this.title = name;
        this.isCheckout = isCheckout;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckout() {
        return isCheckout;
    }

    public void setCheckout(boolean checkout) {
        isCheckout = checkout;
    }
}
