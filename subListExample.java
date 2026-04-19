/*1b. Array List programs */
/*4.	Write a java program for getting different colors through ArrayList 
 * interface and extract the elements 1st and 2nd from 
 * the ArrayList object by using SubList() 
 
*/

package oneB;

import java.util.*;

public class subListExample {
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

        // Extract 1st and 2nd elements (index 0 to 2)
        List<String> subList = colors.subList(0, 2);

        // Display sublist
        System.out.println("Extracted SubList (1st & 2nd elements): " + subList);
    }
}
