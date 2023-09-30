import java.util.Stack;

public class Algorithms {

    public static boolean hasMatchingParentheses(String s) {
        // O(1) time
        int matchingSymbolTracker = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                matchingSymbolTracker++;
            } else if (current == ')') {
                if (matchingSymbolTracker > 0) {
                    matchingSymbolTracker--;
                } else {
                    return false;
                }
            }
        }

        return matchingSymbolTracker == 0;

        // O(n) time

        // Alternate implementation
        /*
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current = '(') {
                stack.push(current);
            } else if (current = ')') {
                if (!stack.isEmpty()) {
                    stack.pop()
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
        
        
         */
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("((algorithm))"));
        System.out.println(hasMatchingParentheses("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParentheses("(algorithm("));
        System.out.println(hasMatchingParentheses(")algorithm)"));
        System.out.println(hasMatchingParentheses(")algorithm("));
        System.out.println(hasMatchingParentheses("algorithm(("));
        System.out.println(hasMatchingParentheses("(algorithm"));
        System.out.println(hasMatchingParentheses("((algorithm)"));
    }
}
