import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExercise {

    static void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }

    static void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.addFirst(i); // Could have also used numbers.add(0,i) where 0 is the index.
    }

    static void removeItemFromTopOfStack(Deque<Integer> stack) {
        stack.poll(); // Could have also used stack.pop();
    }

    static void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.poll();
    }

    static void addItemToTreeSet(Set<String> set, String item) {
        set.add(item);
    }

    public static void main(String[] args) {
        // Test 1
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        addToEndOfLinkedList(numbers, 6);
        // Original LinkedList: [1, 2, 3, 4, 5]
        System.out.println(numbers);

        // Test 2
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        addToStartOfLinkedList(nums, 0);
        // Original LinkedList: [1, 2, 3, 4, 5]
        System.out.println(nums);

        // Test 3
        Deque<Integer> stack = new ArrayDeque();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // Original Stack: [5, 4, 3, 2, 1]
        removeItemFromTopOfStack(stack);
        System.out.println(stack);

        // Test 4
        Queue<Integer> queue = new ArrayDeque();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        // Original Queue: [1, 2, 3, 4, 5]
        removeItemFromFrontOfQueue(queue);
        System.out.println(queue);

        // Test 5
        Set<String> set = new TreeSet<>();
        set.add("red");
        set.add("orange");
        set.add("yellow");
        // Original TreeSet: [red, orange, yellow]
        addItemToTreeSet(set, "green");
        System.out.println(set);
    }

}

