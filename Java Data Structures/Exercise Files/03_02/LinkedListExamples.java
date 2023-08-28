import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    
    /*
    ! In a LinkedList, each element has a reference to the element after it
    ! and the element before it. This allows us to quickly add elements in a
    ! certain position.
    */

    // * Linked Lists are quicker when adding and deleting elements from a list.

    // * Array lists are quicker than linked lists when randomly accessing
    // * elements as LinkedLists need to go through each element.

    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        shoppingList.add(1, "mango");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);

        // ? Linked Lists are not synchronized.
        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedShoppingList);
    }
}
