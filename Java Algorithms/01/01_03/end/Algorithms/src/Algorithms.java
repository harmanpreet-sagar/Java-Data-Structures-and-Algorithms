public class Algorithms {

    // Normalizing a string is a good way to ensure that your program is
    // optimized.
    // For example, you can convert the entire string to either lowercase or
    // uppercase and then search for a letter within the string instead of
    // searching for a letter with both its cases.

    public static String normalizeString(String s) {
        // toLowerCase() converts a string to lowercase.
        // trim() removes all whitespace in the string.
        // replace() gets a character and replaces it with another character.
        return s.toLowerCase().trim().replace(",", "");
    }

    public static void main(String[] args) {
        System.out.println(normalizeString("   Hello There, BUDDY "));

    }
}
