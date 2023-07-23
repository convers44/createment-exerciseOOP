package createment.oop.answers.part_10_recursion.exercise_10_1_fobonachi;

public class App {

    public static void main(String[] args) {
        System.out.println(fibonacci(6)); // Must print 8
        System.out.println(fibonacci(7)); // Must print 13
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciWithLoop(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int prev = 0;
        int current = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = prev + current;
            prev = current;
            current = fib;
        }

        return fib;
    }

}
