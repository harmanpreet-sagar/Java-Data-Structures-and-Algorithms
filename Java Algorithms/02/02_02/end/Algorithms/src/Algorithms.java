import java.util.Arrays;
import java.util.OptionalInt;

public class Algorithms {

    public static Integer linearSearch(int[] arr, int item) {
        for (int current : arr) {
            if (current == item) {
                return item;
            }
        }

        return null;
    }

    // This implementation converts an array into a stream of arrays. It then
    // checks whether a given item is present within that array. The findFirst()
    // functions returns an OptionalInt which basically returns the value if
    // true else it returns nothing.
    public static OptionalInt linearSearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearch2(arr, 8).ifPresent(System.out::println);
    }
}
