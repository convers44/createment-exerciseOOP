package createment.oop.answers.part_01_java_class.exercise_1_6_library;

public class App {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");
        library.checkout("Book 2");
        library.printBooks();
    }

}
