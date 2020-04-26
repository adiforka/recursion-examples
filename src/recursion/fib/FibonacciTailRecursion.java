package recursion.fib;

public class FibonacciTailRecursion {
    public static void main(String[] args) {

        System.out.println(fibonacciTailRecursion(8));

    }

    static int fibonacciTailRecursion(int index) {

        return fibonacciTailRecursion(0, 1, index);
    }

    static int fibonacciTailRecursion(int result, int nextElem, int index) {

        if (index == 0) return result;
        else return fibonacciTailRecursion(result + nextElem, result, index - 1);
    }
}
