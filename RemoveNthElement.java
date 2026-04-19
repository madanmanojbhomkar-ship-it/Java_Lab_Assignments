/*1b. Array List programs */

/*5./*5.Write a java program for getting different colors through ArrayList interface and delete 
 * nth element from the 
 * ArrayList object by using remove by index */

package oneB;

import java.util.*;

public class RemoveNthElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        // Get n value from user (1-based index)
        System.out.print("Enter position (n) to delete: ");
        int n = sc.nextInt();

        // Check valid range
        if (n >= 1 && n <= colors.size()) {

            // Remove nth element (convert to 0-based index)
            colors.remove(n - 1);

            System.out.println("After deleting element at position " + n + ": " + colors);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}