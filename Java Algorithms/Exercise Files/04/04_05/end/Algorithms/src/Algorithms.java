import java.util.Stack;

// ! Stack
// For stack we add items to the top and remove from the top.

// * LIFO: Last In, First Out
// or
// * FILO: First In, Last Out

// push(): adds to the top of the stack.
// pop(): removes from the top of the stack.

// In order to retrieve a specific item in the stack, we must pop off each item
// from the top to access it.

// Example: Runtime stack
// Main function called first.
// Builder function called next
// Util function called after builder.


public class Algorithms {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println("START main");
        stack.push("main");

        System.out.println("START builder");
        stack.push("builder");

        System.out.println("START external-service");
        stack.push("external-service");
        System.out.println("END " + stack.pop());

        System.out.println("START parse-external-data");
        stack.push("parse-external-data");
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());

        //stack.peek()
    }
}
