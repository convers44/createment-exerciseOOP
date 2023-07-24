package createment.oop.answers.part_06_interface.exercise_6_2_save_string;

public class App {

    public static void main(String[] args) {
        TextKeeper keeper = new MemoryTextKeeper();
//        keeper.save("My Name");
        System.out.println(keeper.load());
    }

}
