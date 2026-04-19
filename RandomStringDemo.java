/*3c. String Exercise progams */
/*Q9. Write a Java Program for Creating a random string of a specified length using
 *  user defined function generateRandomString*/
package ThreeC;

import java.util.Random;
import java.util.Scanner;

public class RandomStringDemo {

    // User-defined function
    public static String generateRandomString(int length) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        String result = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result += characters.charAt(index);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter desired length: ");
        int length = sc.nextInt();

        String randomString = generateRandomString(length);

        System.out.println("Random String: " + randomString);

        sc.close();
    }
}
