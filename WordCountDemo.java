/*3c. String Exercise progams */
/*Q10. Write a Java Program for Counting the number of words in a string using user
 *  defined function countWords() 
 */
package ThreeC;

import java.util.Scanner;

public class WordCountDemo {

    // User-defined function
    public static int countWords(String str) {

        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split string by whitespace
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int count = countWords(input);

        System.out.println("Number of words: " + count);

        sc.close();
    }
}