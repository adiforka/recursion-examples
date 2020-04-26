package recursion.assorted;

public class AlternativeSimpleRec_18_2_3 {
    public static void main(String[] args) {

        //show output of the following methods calls
        System.out.println("Sum is " + xMethod1(5));

        xMethod2(1234567);

    }
    public static int xMethod1(int n) {
        if (n == 1)
            return 1;
        else
            return n + xMethod1(n - 1);
    }

    public static void xMethod2(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            xMethod2(n / 10);
        }
    }
}
