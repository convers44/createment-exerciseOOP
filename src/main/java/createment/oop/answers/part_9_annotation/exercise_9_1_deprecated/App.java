package createment.oop.answers.part_9_annotation.exercise_9_1_deprecated;

public class App {

    public static void main(String[] args) {
        SearchService d = new SearchService();
        for (String it : d.search("Test")) {
            System.out.println(it);
        }
    }

}
