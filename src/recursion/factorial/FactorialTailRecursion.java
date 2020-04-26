package recursion.factorial;

public class FactorialTailRecursion {
    public static void main(String[] args) {

        System.out.println(factorialTailRecursion(6));
    }

    public static int factorialTailRecursion(int input) {

        return factorialTailRecursion(input, 1);

    }

    private static int factorialTailRecursion(int input, int result) {

        if (input == 1) return result;

        return factorialTailRecursion(input - 1, input * result);
    }
}
