package createment.oop.answers.part_10_recursion.exercise_10_3_tree;

public class App {

    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();

        n1.setName("Node 1");
        n2.setName("Node 2");
        n3.setName("Node 3");

        n1.setChild(n2);
        n2.setChild(n3);
    }

}
