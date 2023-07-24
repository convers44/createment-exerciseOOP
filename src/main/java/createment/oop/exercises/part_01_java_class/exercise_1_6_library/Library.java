package createment.oop.exercises.part_01_java_class.exercise_1_6_library;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<String, Book> bookList;

    public Library() {
        this.bookList = new HashMap<>();
    }

    public void addBook(String bookTitle) {
        //TODO: Add a method addBook to add new book to the library
    }

    //TODO: Implement method checkout to borrow a book from library and make it unavalable
    //TODO: Implement method checkin to return a book to library and make it available again

    //TODO: Implement a method named printBooks to print list of all books like the following example
    // Book 1 - Available
    // Book 2 - Not Available
    // Book 3 - Available
}
