import java.util.ArrayDeque;
// import java.util.LinkedList;
// import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

    // * First In, First Out (FIFO)

    // Think of it in the manner of restaurant service. The first person to
    // order will be the first person that gets served.

    public static void main(String[] args) {

        // It is better to use LinkedList if you are going to remove an element
        // during iteration. 

        // It is better to use ArrayDeque when you want to have a greater
        // performance.
        
        // The way Priority Queue works is that it has the elements in an
        // alphabetical order. So for example, when Person One is removed from
        // the queue, the order becomes [Person Three, Person Two], because
        // Person Three comes before alphabetically. If the queue had the int
        // type then it would be lowest to highest with the lowest being the
        // first element.
        
        Queue<String> queue = new ArrayDeque<>();
        // offer() adds people to the queue.
        queue.offer("Person One");
        queue.offer("Person Two");
        queue.offer("Person Three");
        System.out.println(queue);

        // peek() returns the first element in the queue.
        System.out.println(queue.peek());

        // poll() removes the first element. You cannot use pop() for queues.
        queue.poll();
        System.out.println(queue);

    }

}
