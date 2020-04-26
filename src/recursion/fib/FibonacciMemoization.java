package recursion.fib;

import java.util.HashMap;
import java.util.Map;

//after a Python tutorial
public class FibonacciMemoization {
    public static void main(String[] args) {

        Map<Integer, Long> cache = new HashMap<>();
        for (int n = 1; n < 1001; n++) {
            System.out.println(n + ": " + calcFib(n, cache));
        }
    }

    public static long calcFib(Integer n, Map<Integer, Long> cache) {
        checkInput(n);
        return calc(n, cache);
    }

    private static long calc(Integer n, Map<Integer, Long> cache) {

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        if (n == 1) return 1;
        else if (n == 0) return 0;

        long value = calcFib(n - 1, cache) + calcFib(n - 2, cache);
        cache.put(n, value);
        return value;
    }

    //basic input validation
    private static void checkInput(int n) {
        if (n < 0) {
            throw new RuntimeException("input must be >= 0");
        }
    }
}
