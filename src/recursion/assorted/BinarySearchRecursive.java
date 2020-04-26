package recursion.assorted;

public class BinarySearchRecursive {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 9, 11, 15, 16, 18, 20, 22, 25, 27, 28, 30};
        int key = 11;
        System.out.println(binarySearchIterative(numbers, key));
        System.out.println(binarySearchRecursive(numbers, key));

    }

    static int binarySearchIterative(int[] list, int key) {

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (high - low) / 2;
            if (key < list[mid]) high = mid - 1;
            else if (key == list[mid]) return mid;
            else low = mid + 1;
        }

        return -1;
    }

    static int binarySearchRecursive(int[] list, int key) {

        return binarySearchRecursive(list, key, 0, list.length - 1);
    }

    private static int binarySearchRecursive(int[] list, int key, int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;

            if (key < list[mid])
                return binarySearchRecursive(list, key, 0, mid - 1);
            else if (key == list[mid])
                return mid;
            else
                return binarySearchRecursive(list, key, mid + 1, high);
        }
        return -1;
    }
}
