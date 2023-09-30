public class Algorithms {

    public static String reverse(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        // Strings are immutable, i.e., can't be changed once created. So it is
        // very easy to create numerous strings when we are trying to modify
        // strings.
        
        // We can use a StringBuilder object to carry out the task. What a
        // StringBuilder does is that it creates strings and dynamically expands
        // memory in order to accommodate the change.
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse(null));
        System.out.println(reverse(""));
        System.out.println(reverse("hello"));
        System.out.println(reverse("tacos"));
        System.out.println(reverse("Hi!"));
    }
}
