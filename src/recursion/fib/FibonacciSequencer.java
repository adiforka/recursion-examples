package recursion.fib;

public class FibonacciSequencer {
    public static void main(String[] args) {

        int fibIndex = (int)(Math.random() * 11);
        System.out.println("Fibonacci number for index " + fibIndex + " is " + calcFibonacciRecursive(fibIndex));
        System.out.println("Fibonacci number for index " + fibIndex + " is " + calcFibonacciIterative(fibIndex));

    }
    static int calcFibonacciRecursive(int fibIndex) {

        if (fibIndex == 1) return 1;
        if (fibIndex == 0) return 0;

        return calcFibonacciRecursive(fibIndex - 1) + calcFibonacciRecursive(fibIndex - 2);
    }

    static int calcFibonacciIterative(int fibIndex) {

        int result = 0;
        int previous = 1;
        int beforePrevious = 0;

        for (int i = 2; i <= fibIndex; i++) {
            result = previous + beforePrevious;
            beforePrevious = previous;
            previous = result;
        }
        return result;
    }
}
