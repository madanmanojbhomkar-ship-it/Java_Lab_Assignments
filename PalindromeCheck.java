/*3b. String Exercise progams  */
/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome(): 
 
*/
package threeB;

import java.util.Scanner;

public class PalindromeCheck {

    // User-defined function
    public static boolean isPalindrome(String str) {

        // Remove punctuation & spaces, convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        // Check palindrome
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a PALINDROME.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}