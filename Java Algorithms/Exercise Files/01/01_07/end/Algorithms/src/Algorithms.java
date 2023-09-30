public class Algorithms {

    // The reverse() function created below is a lot less efficient than the
    // reverse2() function.
    public static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
    
    // This function uses the built in reverse() function to reverse the string.
    public static String reverse2(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse2(null));
        System.out.println(reverse2(""));
        System.out.println(reverse2("hello"));
        System.out.println(reverse2("tacos"));
        System.out.println(reverse2("Hi!"));
    }
}
