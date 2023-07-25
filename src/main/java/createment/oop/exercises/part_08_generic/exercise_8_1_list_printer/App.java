package createment.oop.exercises.part_08_generic.exercise_8_1_list_printer;

public class App {

    public static void main(String[] args) {
        ListPrinter<String> stringBoard = new ListPrinter<>();
        stringBoard.addNewItem("A");
        stringBoard.addNewItem("B");
        stringBoard.addNewItem("C");
        stringBoard.printAll();


        ListPrinter<Integer> numericBoard = new ListPrinter<>();
        numericBoard.addNewItem(10);
        numericBoard.addNewItem(12);
        numericBoard.addNewItem(14);
        numericBoard.printAll();
    }

}
