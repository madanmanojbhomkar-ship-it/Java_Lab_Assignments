/*3b. String Exercise progams  */
/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user
 *  defined function removeWhitespace() */

package threeB;

import java.util.Scanner;

public class RemoveWhiteSpaceDemo {

    // User-defined function
    public static String removeWhitespace(String str) {

        // Remove all whitespace characters (spaces, tabs, newlines)
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeWhitespace(input);

        System.out.println("String after removing whitespace: " + result);

        sc.close();
    }
}