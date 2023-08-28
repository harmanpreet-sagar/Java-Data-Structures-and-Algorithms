import java.util.Arrays;

public class ArrayExercise {

    public void arrayToUpperCase(String[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].toUpperCase();
        }
    }

    public static void incrementArray(int[] input) {
        // Add code here to increment each element in the array by 1
        for (int i = 0; i < input.length; i++) {
            input[i] += 1;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3, 4, 5 };
        incrementArray(input);
        System.out.println(Arrays.toString(input));
    }
}
