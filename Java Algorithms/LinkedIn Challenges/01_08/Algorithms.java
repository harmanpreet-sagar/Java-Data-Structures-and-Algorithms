// ? Reverse each word in a Sentence

// * Input: String
// * Output: new string with each word reversed.
// * Assumptions: no punctuation in the string; each word separated by spaces.
// * Casing should remain the same.

public class Algorithms {

    public static String reverseEachWord(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder str = new StringBuilder();
        String[] strArray = s.split(" ");
        for (String a : strArray) {
            str.append(reverse(a));
            str.append(" ");
        }

        return str.toString();

    }

    public static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord(null));
        System.out.println(reverseEachWord(""));
        System.out.println(reverseEachWord(" "));
        System.out.println(reverseEachWord("sally is a great worker"));
        System.out.println(reverseEachWord("racer racecar madam"));
        System.out.println(reverseEachWord("what can I do today"));
    }
}
