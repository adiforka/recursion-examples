package recursion.factorial;

public class BasicFactorialRecursion {
    public static void main(String[] args) {

        int n = 10;
        System.out.println("Factorial of " + n + " is " + factorial(n));
        System.out.println("Factorial of " + n + " is " + factorialLoop(n));

    }
    public static long factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static long factorialLoop(int n) {

        long factorial = 1;

        for (int i = 2; i <=n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
