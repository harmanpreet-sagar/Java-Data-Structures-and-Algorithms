// ? Create an algorithm that deletes the kth node from the end of the list.

// * Original: 5 -> 7 -> 11 -> 2 -> 18 -> null
// * k = 1
// * The first node from the end of the list is 18.
// * Modified: 5 -> 7 -> 11 -> 2 -> null
// * Original: 5 -> 7 -> 11 -> 2 -> null
// * k = 4
// * The fourth node from the end of the list is 5.
// * Modified: 7 -> 11 -> 2 -> null
// * Original: 7 -> 11 -> 2 -> null
// * k = 2
// * The second node from the end of the list is 11.
// * Modified: 7 -> 2 -> null

public class Algorithms {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(5);
        Node secondNode = new Node(7);
        Node thirdNode = new Node(11);
        Node fourthNode = new Node(2);
        Node fifthNode = new Node(18);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;

        linkedList.displayContents();
        linkedList.deleteSpecificNode(4);
        linkedList.displayContents();
    }
}
