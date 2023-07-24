package createment.oop.answers.part_10_recursion.exercise_10_2_factorial;

public class App {

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Must print 120
        System.out.println(factorial(720)); // Must print 120
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int factorialWithLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
