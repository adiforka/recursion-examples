package recursion.assorted;

public class PalindromeCheckerRecursive {
    public static void main(String[] args) {

        System.out.println(isPalindromeRecursive("karak"));
        System.out.println(isPalindromeRecursive("atta"));
        System.out.println(isPalindromeRecursive("suckma"));
        System.out.println(isPalindromeRecursive("rogor"));
        System.out.println(isPalindromeRecursive("kangaroo"));
        System.out.println(isPalindromeRecursive("kayak"));
    }

    public static boolean isPalindromeRecursive(String word) {

        return (isPalindromeRecursive(word, 0, word.length() - 1));
    }

    //recursive helper method: no substrings created, more efficient
    //an overloaded second method that receives additional parameters
    private static boolean isPalindromeRecursive(String word, int low, int high) {

        //had word.length() <= 1 here as base condition before, but the string length never changes
        // and no new, shorter strings are created (which would be inefficient, anyway)
        if (low >= high) return true;
        else if (word.charAt(low) != word.charAt(high)) return false;
        else return isPalindromeRecursive(word, low + 1, high - 1);
    }
}
