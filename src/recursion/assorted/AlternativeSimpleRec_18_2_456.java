package recursion.assorted;

public class AlternativeSimpleRec_18_2_456 {
    public static void main(String[] args) {

        System.out.println(powerOfTwo(4));

        System.out.println(powerOfX(7, 2));

        System.out.println(recursiveSum(20));
    }

    //Write a recursive mathematical definition for computing 2^n for a positive integer n
    public static int powerOfTwo(int exp) {

        if (exp == 0) return 1;

        return 2 * powerOfTwo(exp - 1);
        //(e.g. exp =  3) f(3) = 2 * f(2) = 2 * 2 * f(1) = 2 * 2 * 2 * f(0) = 2 * 2 * 2 * 1 = 8
    }

    /*Write a recursive mathematical definition for computing x n for a positive integer n
    and a real number x.*/
    public static double powerOfX(double x, int exp) {

        if (exp == 0) return 1;

        return x * powerOfX(x, exp - 1);
        //(e.g. x = 3, exp = 3) f(3, 3) = 3 * f(3, 2) = 3 * 3 * f(3, 1) = 3 * 3 * 3 * f(3, 0) = 3 * 3 * 3 * 1 = 27;
    }

    public static int recursiveSum(int n) {

        if (n == 1) return 1;

        return n + recursiveSum(n - 1);
        /*(e.g. n = 5) f(5) = 5 + f(4) = 5 + 4 + f(3) = 5 + 4 + 3 + f(2) = 5 + 4 + 3 + 2 + f(1) =
        = 5 + 4 + 3 + 2 + 1 = 15*/
    }
}
