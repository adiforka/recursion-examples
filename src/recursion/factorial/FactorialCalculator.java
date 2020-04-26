package recursion.factorial;

public class FactorialCalculator {
    public static void main(String[] args) {

        //value set to 5 - 10 for some neat results
        int value = (int)(5 + Math.random() * 6);
        System.out.println("Factorial of " + value + " is " + calculateFactorial(value));
        System.out.println("Factorial of " + value + " is " + tailRecursionFactorial(value, 1));
    }

    static int calculateFactorial(int value) {

        if (value == 1) return 1;

        return value * calculateFactorial(value - 1);
    }

    static int tailRecursionFactorial(int value, int result) {

        if (value == 1) return result;

        return tailRecursionFactorial(value - 1, result * value);
    }
}
