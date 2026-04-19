/*1b. Array List programs */
/*3.Write a java program for getting different colors through 
 * ArrayList interface and sort them using Collections.sort( ArrayListObj) 
 
*/

package oneB;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Sort the list
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted List: " + colors);
    }
}