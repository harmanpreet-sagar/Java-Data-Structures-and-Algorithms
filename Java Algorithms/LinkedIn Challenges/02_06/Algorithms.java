// ? Challenge: Create an algorithm that rotates the contents of an array to the
// ? left by one space.

// * Input: {1, 2, 3, 4, 5, 6}
// * Output: {2, 3, 4, 5, 6, 1}

// ! This rotation should be done in place. A new array should not be created.
// * Bonus: Create an algorithm that rotates the array's contents to the right.

import java.util.Arrays;

public class Algorithms {

    public static void rotateLeft(int[] numbers) {

        int firstNum = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = firstNum;
    }

    public static void rotateRight(int[] numbers) {

        int lastNum = numbers[numbers.length - 1];

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = lastNum;
    }
    
    public static void main(String[] args) {
        int arr1[] = { 7, 8, 9, 10, 11 };
        rotateLeft(arr1);
        Arrays.stream(arr1).forEach(System.out::println);
        System.out.println("\n");
        rotateRight(arr1);
        Arrays.stream(arr1).forEach(System.out::println);

    }

}
