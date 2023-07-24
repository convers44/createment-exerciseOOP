package createment.oop.answers.part_06_interface.exercise_6_3_shape_multi;

public class App {

    public static void main(String[] args) {
        Shape r = new Rectangle(10, 20);

        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Area: " + r.getArea());
    }

}
