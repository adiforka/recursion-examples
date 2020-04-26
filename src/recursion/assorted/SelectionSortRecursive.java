package recursion.assorted;

import java.util.Arrays;

public class SelectionSortRecursive {
    public static void main(String[] args) {

        double[] list = {2.3, 3.5, 1.2, 10.9, -3.2, 5.4, 1.1, .3};
        selectionSortRecursive(list);
        System.out.println(Arrays.toString(list));
    }

    public static void selectionSortRecursive(double[] list) {
        selectionSortRecursive(list, 0, list.length - 1);
    }

    private static void selectionSortRecursive(double[] list, int low, int high) {

        if (low < high) {
            double min = list[low];
            int minIndex = low;

            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    minIndex = i;
                }
            }

            //swapping the new min with first checked element
            list[minIndex] = list[low];
            list[low] = min;

            //incrementing low, cause current low always already sorted at this point
            selectionSortRecursive(list, low + 1, high);

        }
    }
}
