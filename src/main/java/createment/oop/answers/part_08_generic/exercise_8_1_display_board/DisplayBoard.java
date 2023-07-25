package createment.oop.answers.part_08_generic.exercise_8_1_display_board;

import java.util.ArrayList;
import java.util.List;

public class DisplayBoard<T> {

    private final List<T> data;

    public DisplayBoard() {
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
