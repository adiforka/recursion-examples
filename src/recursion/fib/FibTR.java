package recursion.fib;

public class FibTR {
    public static void main(String[] args) {

        System.out.println(fib(10));

    }

    static long fib(int index) {
        return fib(index, 0, 1);
    }

    //current index, fresh calculated result to store in v2, previously stored result to add to v1 and get new result
    private static long fib(int index, long value1, long value2) {

        //fibonacci sequence indexed from 1, apparently
        if (index == 1) return value1;

        //decrement index to ultimately meet base case (selection condition), create result, previous stored result)
        return fib(index - 1, value1 + value2, value1);
        /*10, 1, 0
         * 9, 1, 1
         * 8, 2, 1
         * 7, 3, 2
         * 6, 5, 3
         * 5, 8, 5
         * 4, 13, 8
         * 3, 21, 13
         * 2, 34, 21
         * 1 --> 34*/
    }
}
