package createment.oop.answers.part_08_generic.exercise_8_1_list_printer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListPrinter<T> {

    private final List<T> data;

    public ListPrinter() {
        this.data = new ArrayList<>();
    }

    public void addNewItem(T newItem) {
        data.add(newItem);
    }

    public void printAll() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}
