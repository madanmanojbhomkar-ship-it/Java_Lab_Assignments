/*1b. Array List programs */
/*2.	/*2.Write a java program for getting different colors through ArrayList interface and remove the 2nd element and
 *  color "Blue" from the ArrayList */
package oneB;

import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);
        System.out.println("After removing 2nd element: " + colors);

        // Remove color "Blue"
        colors.remove("Blue");
        System.out.println("After removing 'Blue': " + colors);
    }
}
