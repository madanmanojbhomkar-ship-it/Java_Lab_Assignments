/*3c. String Exercise progams */
/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined
 *  function capitalizeWords() */


package ThreeC;

import java.util.Scanner;

public class CapitalizeWordsDemo {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.split("\\s+"); // split by spaces
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter + rest of word
                result += Character.toUpperCase(word.charAt(0)) 
                          + word.substring(1).toLowerCase() + " ";
            }
        }

        return result.trim(); // remove trailing space
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String output = capitalizeWords(input);

        System.out.println("Capitalized Sentence: " + output);

        sc.close();
    }
}