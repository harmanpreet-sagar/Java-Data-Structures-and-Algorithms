import java.util.Arrays;

public class ArrayExamples {

    // * Every element in the array must be of the same type.
    // * arrays are indexed.
    public static void main(String[] args) {

        // * Format of creating an array:
        // ! <Type of element>[] <variable> = new <type>[size]
        // If the value is not specified then java will use the default values.

        // ? Default values:
        // * String -> null
        // * int -> 0
        // * bool -> False

        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        // Assign "Monday" to the 0th element of the array.
        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        // Can also choose to not specify the size of the array and then just
        // add the elements of the array in {} right after the size [].
        weekdays = new String[] { "Mon", "Tue", "Wed" };
        System.out.println(Arrays.toString(weekdays));

        // This is going to go through each day in the weekdays array.
        for (String day : weekdays) {
            System.out.println("Week day: " + day);
        }

        // This is going to go through each day in the weekdays array.
        for (int i = 0; i < weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays));
    }
}
