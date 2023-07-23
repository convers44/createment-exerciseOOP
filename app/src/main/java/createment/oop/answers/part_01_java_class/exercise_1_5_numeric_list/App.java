package createment.oop.answers.part_01_java_class.exercise_1_5_numeric_list;

public class App {

    public static void main(String[] args) {
        NumericList list = new NumericList();
        list.add(10);
        list.add(10);
        list.add(10);

        System.out.println("Avg: " + list.getAverage());
        System.out.println("Sum: " + list.getSum());
    }

}
