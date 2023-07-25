package createment.oop.exercises.part_06_interface.exercise_6_3_shape_multi;

public class App {

    //TODO: Create an interfaces named HasArea and HasPerimeter
    // Implement the third interface named Shape to inherits both HasArea and HasPerimeter
    public static void main(String[] args) {
        //TODO: Uncomment the following line
        Shape r = new Rectangle(10, 20);

        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Area: " + r.getArea());
    }

}
