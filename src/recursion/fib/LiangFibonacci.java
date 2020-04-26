package recursion.fib;

public class LiangFibonacci {

    /*
     * general definition of the Fibonacci sequence:
     *
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n - 2) + fib(n - 1) */

    public static void main(String[] args) {

        System.out.println(calcFibRecursive(6, 0));

    }

    //finds value of a given index in the Fibonacci sequence
    public static long calcFibRecursive(long index, int i) {

        i++;

        if (index == 1) return 1;
        if (index == 0) return 0;

        return calcFibRecursive(index - 2, i) + calcFibRecursive(index - 1, i);
    }
}
