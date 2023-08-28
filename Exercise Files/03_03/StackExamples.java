import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

    // * First In, Last Out (FILO).

    // Think of it as a card stack. The first one we put down stays down. When
    // we take the top card out of the stack, we are taking out the card that
    // was put down the last.


    // ! The Deque class behaves more like a stack than the Stack class because
    // ! the Stack class allows us to remove any of the elements regardless of
    // ! their position, which is not very stack-like.

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");
        System.out.println(stack);

        // Gets the first element (or the one that was added the last) of the stack.
        System.out.println(stack.peek());
        
        // Removes the first element of the stack.
        stack.pop();
        System.out.println(stack);

        // Removes the first element of the remaining stack.

        // * The difference between poll() and pop() is that if you run poll()
        // * on an empty stack/list, then it would return [null], however, if
        // * you run pop() on an empty stack/list, then it would return a NO
        // * SUCH ELEMENT exception.
        stack.poll();
        System.out.println(stack);

    }

}
