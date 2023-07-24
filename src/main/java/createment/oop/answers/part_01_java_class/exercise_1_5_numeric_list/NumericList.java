package createment.oop.answers.part_01_java_class.exercise_1_5_numeric_list;

import java.util.ArrayList;
import java.util.List;

public class NumericList {

    private final List<Integer> numbers;

    public NumericList() {
        this.numbers = new ArrayList<>();
    }

    public void add(Integer newNumber) {
        numbers.add(newNumber);
    }

    public double getAverage() {
        if (numbers.size() == 0)
            return 0;

        return getSum() / numbers.size();
    }

    public double getSum() {
        Integer total = 0;
        for (Integer number : numbers)
            total += number;
        return (double) total;
    }
}
