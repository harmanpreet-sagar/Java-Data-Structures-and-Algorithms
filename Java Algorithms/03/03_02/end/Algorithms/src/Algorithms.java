import java.util.LinkedList;

public class Algorithms {

    // ! Linked List
    // It is a data structure that is useful when working with linear data.
    // Elements are linked by pointers.
    // Idea of an index does not exist in a linked list.
    // Each element is called a node, which contains a piece of data and
    // reference to the next element.

    // * Example:
    /* 
    6 -> 9 -> 15 -> null
    6 has a pointer and has a reference to the next element 9
    9 has a pointer and has a reference pointer 15
    15 has a pointer and has a forward reference to null as it is the last element.
    The first node is called the head (here 6)
    The last node is called the tail (here 15)
    */

    // The size of a linked list can vary over time whereas an array's size is
    // constant.
    // The next references in a linked list can be changed or removed at any time.
    // For example, 6 -> 9 -> 15 -> null can be changed to 6 -> 9 -> 10 -> 15 -> null.
    


    public static void main(String[] args) {

        LinkedList<String> listy = new LinkedList<>();
        listy.add("Sally");
        listy.add("Becky");
        listy.add("Nick");
        listy.add("Jack");
        listy.add("Rachel");

        System.out.println(listy.contains("Becky"));
        System.out.println(listy.size());

        listy.removeFirst();

//        for(String item: listy) {
//            System.out.print(item + "->");
//        }

        listy.forEach(x -> System.out.print(x + "->"));
    }
}
