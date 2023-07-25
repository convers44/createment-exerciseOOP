package createment.oop.answers.part_08_generic.exercise_8_1_display_board;

public class App {

    public static void main(String[] args) {
        DisplayBoard<String> stringBoard = new DisplayBoard<>();

        stringBoard.addNewItem("A");
        stringBoard.addNewItem("B");
        stringBoard.addNewItem("C");

        stringBoard.printAll();


        DisplayBoard<Integer> numericBoard = new DisplayBoard<>();

        numericBoard.addNewItem(10);
        numericBoard.addNewItem(12);
        numericBoard.addNewItem(14);

        numericBoard.printAll();
    }

}
