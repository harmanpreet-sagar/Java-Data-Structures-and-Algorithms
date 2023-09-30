import java.util.Stack;

public class Algorithms {

    // ? Challenge: Print the next greater element for every element in the
    // ? array
    // ? NOTE: The next greater element is the first larger element on the right
    // ? side of the array.

    // * Input: {4, 5, 2, 35}
    // * Output: 4 -> 5
    //           5 -> 35
    //           2 -> 35
    //          35 -> -1

    // * Input: {16, 7, 2, 15}
    // * Output: 16 -> -1
    //            7 -> 15
    //            2 -> 15
    //           15 -> -1

    // Algorithm summary
    // We iterate through the array, trying to find the next greater element for
    // the item on top of the stack.
    // The stack contains the items we've already seen in the array.
    // When we've reached the end of the array, each item that's still in the
    // stack must have the next greater element of -1.
    // Linear time complexity.


    public static void printNextGreaterElement(int[] arr) {
        if (arr.length == 0) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int next = arr[i];
            if (!stack.isEmpty()) {
                int popped = stack.pop();
                while (popped < next) {
                    System.out.println(popped + " --> " + next);
                    if (stack.isEmpty()) {
                        break;
                    }
                    popped = stack.pop();
                }

                if (popped > next) {
                    stack.push(popped);
                }
            }
            stack.push(next);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> " + -1);
        }
    }

    public static void main(String[] args) {

        printNextGreaterElement(new int[] { 16, 7, 2, 15 });
    }
}
