package createment.oop.answers.part_01_java_class.exercise_1_6_library;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<String, Book> bookList;

    public Library() {
        this.bookList = new HashMap<>();
    }

    public void addBook(String bookTitle) {
        bookList.put(bookTitle, new Book(bookTitle, false));
    }

    public void checkout(String bookTitle) {
        bookList.get(bookTitle).setCheckout(true);
    }

    public void checkin(String bookTitle) {
        bookList.get(bookTitle).setCheckout(false);
    }

    public void printBooks() {
        for (Book book : bookList.values()) {
            System.out.printf("%s - %s\n", book.getTitle(), book.isCheckout() ? "Not Available" : "Available");
        }
    }
}
