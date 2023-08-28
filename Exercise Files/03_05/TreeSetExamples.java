import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

    // ! Tree sets are data structures that store unit elements in a sorted order.
    
    // One of the key features of tree sets is that by default it stores
    // elements in an ascending order. However, it can be modified so that it
    // compares elements based on some other property and stores them in that manner.
    
    // * You CANNOT store duplicate values in Tree sets.

    public static void main(String[] args) {

        // The last () is the area where we can specify the conditions of the order.
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        System.out.println(treeSet);
        treeSet.add(6);
        System.out.println(treeSet);

        // Organizes the wordSet treeSet based on length of the string.
        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);

        // Since wolf and bear both have four letters and wordSet is organized
        // by the length of the string, the wordSet tree set is not including
        // wolf in the set because it has the same number of letters as an
        // element that was previously added in the set. 
        wordSet.add("wolf");
        System.out.println(wordSet);
        wordSet.remove("giraffe");
        System.out.println(wordSet);

    }

}
