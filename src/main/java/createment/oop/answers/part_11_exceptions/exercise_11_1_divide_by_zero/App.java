package createment.oop.answers.part_11_exceptions.exercise_11_1_divide_by_zero;

public class App {

    public static void main(String[] args) {
//        System.out.println(divide(10, 3));
//        System.out.println(divide(10, 0));
        //TODO: Explain try catch
        throw new ArithmeticException("WOWOWO");
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

}
