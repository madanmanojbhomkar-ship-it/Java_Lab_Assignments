/*3c. String Exercise progams */
/*Q7. Write a Java Program for Shortening a string to a specified length and adds
an ellipsis using user defined function truncate() */
package ThreeC;

import java.util.Scanner;

public class TruncateStringsDemo {

    // User-defined function
    public static String truncate(String str, int maxLength) {

        if (str == null) {
            return null;
        }

        // If string is already short, return as it is
        if (str.length() <= maxLength) {
            return str;
        }

        // Otherwise truncate and add ellipsis
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter maximum length: ");
        int maxLength = sc.nextInt();

        String result = truncate(input, maxLength);

        System.out.println("Truncated String: " + result);

        sc.close();
    }
}