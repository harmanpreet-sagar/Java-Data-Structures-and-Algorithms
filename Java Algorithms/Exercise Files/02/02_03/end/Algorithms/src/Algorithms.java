import java.util.Arrays;

// ! Binary Search

// You can only use this if the array is sorted.
// * It is a divide and conquer algorithm where in each step it halves the number
// * of elements it has to search through.

// Consider... {0, 7, 10, 20, 39, 50, 92}
// Let's say the number we are looking for is 50.
// The algorithm would start search in the middle of the array, in this case
// index 3, or item 20 in.
// It would then check whether 50 is greater than 20. Since 50 > 20, it would
// eliminate the bottom half and then start search again at the middle of the
// top half. The midpoint of the upper array {39, 50, 92} is 50 and since that
// is the number that we are looking for, our search ends here.

// * Linear Search: no assumptions, O(n) time
// * Binary Search: sorted assumption, O(log(n)) time -> Faster.

public class Algorithms {

    public static boolean binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (item == arr[mid]) {
                return true;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 8));

        Arrays.binarySearch(arr, 3);
    }
}
