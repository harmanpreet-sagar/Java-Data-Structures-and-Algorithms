public class Algorithms {

    // ! Validation Algorithm

    // It checks whether a given piece of data have a certain property.
    // The output of a validation algorithm is true or false.

    public static boolean isUppercase(String s) {
        // It first creates a character stream and then uses the allMatch
        // function, which takes in the condition to be satisfied, to determine
        // whether or not a string is, in this case, in all uppercase.

        // The allMatch() function returns a bool true or false.
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s) {
        // Written similar to isUppercase().
        return s.chars().allMatch(Character::isLowerCase);

        // Could also use
        // s.chars().noneMatch(Character::isUpperCase);
    }

    public static void main(String[] args) {
        System.out.println(isUppercase("hello"));
        System.out.println(isUppercase("HELLO"));

        System.out.println(isLowercase("hello"));
        System.out.println(isLowercase("HELLO"));
    }
}
