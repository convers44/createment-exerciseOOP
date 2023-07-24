package createment.oop.answers.part_04_record.note_4_3_null;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Book myBook = new Book(null, "Hamed ", 2024);

        Map<String, String> map = new HashMap<>();

        map.put(null, null);
        Objects.requireNonNull(myBook);

        System.out.println(map.get(null));
    }

}
