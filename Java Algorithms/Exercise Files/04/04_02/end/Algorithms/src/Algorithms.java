import java.util.Queue;
import java.util.LinkedList;


// ! Queue

// Contains elements in teh order they were added.
// Elements are inserted at the end and removed from the front.

// * FIFO (First In, First Out)

// Enqueue: adds an item to the back.
// Dequeue: removes an item from the front.
// Peek: accesses the item at the front of the queue.

// Indices do not exist for queues
// FIFO can be useful if we leverage it as an assumption.

public class Algorithms {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(19);
        queue.add(20);

        int removedItem = queue.remove();
        System.out.println(removedItem);
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
