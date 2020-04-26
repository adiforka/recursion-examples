package recursion.fib;

public class FibTailRec {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            System.out.println(i + ": " + fib(i));
        }
    }

    static long fib(int n) {
        return fib(0, 1, n);

        // 0=>0, 1=>1, 2=>1, 3=>2
    }

    private static long fib(long v1, long v2, int n) {
        if (n == 0) return v1;
        /*0, 1, 9
         * 1, 0, 8
         * 1, 1, 7
         * 2, 1, 6
         * 3, 2, 5
         * 5, 3, 4
         * 8, 5, 3
         * 13, 8, 2
         * 21, 13, 1
         * 34, 21, 0*/

        return fib(v1 + v2, v1, n - 1);
    }
}
