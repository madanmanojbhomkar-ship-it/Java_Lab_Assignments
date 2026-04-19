/*2	a. Develop a java program for performing various string operations with different string handling functions directed as follows 
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith() 
*/
package TwoA;

import java.util.*;

public class StringOperationsDemo {

    // 1. String Creation and Basic Operations
    static void basicOperations() {
        String s1 = "Hello";
        String s2 = new String("World");

        System.out.println("1. String Creation:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    // 2. Length and Character Access
    static void lengthAndChar() {
        String str = "Java";
        System.out.println("\n2. Length & Character Access:");
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
    }

    // 3. String Comparison
    static void comparison() {
        String a = "Java";
        String b = "java";

        System.out.println("\n3. String Comparison:");
        System.out.println("equals(): " + a.equals(b));
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));
    }

    // 4. String Searching
    static void searching() {
        String str = "Programming";
        System.out.println("\n4. String Searching:");
        System.out.println("Index of 'g': " + str.indexOf('g'));
        System.out.println("Contains 'gram': " + str.contains("gram"));
    }

    // 5. Substring Operations
    static void substringOps() {
        String str = "Computer";
        System.out.println("\n5. Substring:");
        System.out.println("Substring(0,4): " + str.substring(0, 4));
    }

    // 6. String Modification
    static void modification() {
        String str = "hello";
        System.out.println("\n6. String Modification:");
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace 'h' with 'y': " + str.replace('h', 'y'));
    }

    // 7. Whitespace Handling
    static void whitespace() {
        String str = "   Java Programming   ";
        System.out.println("\n7. Whitespace Handling:");
        System.out.println("Before trim: '" + str + "'");
        System.out.println("After trim: '" + str.trim() + "'");
    }

    // 8. String Concatenation
    static void concatenation() {
        String a = "Hello";
        String b = "World";
        System.out.println("\n8. Concatenation:");
        System.out.println("Using + : " + (a + " " + b));
        System.out.println("Using concat(): " + a.concat(" ").concat(b));
    }

    // 9. String Splitting
    static void splitting() {
        String str = "Java,Python,C++";
        System.out.println("\n9. Splitting:");
        String[] parts = str.split(",");
        for (String p : parts) {
            System.out.println(p);
        }
    }

    // 10. StringBuilder Demo
    static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");

        System.out.println("\n10. StringBuilder:");
        System.out.println("Result: " + sb);
    }

    // 11. String Formatting
    static void formatting() {
        int marks = 85;
        System.out.println("\n11. Formatting:");
        System.out.println(String.format("Marks: %d", marks));
    }

    // 12. Email Validation
    static void validateEmail() {
        String email = "test@gmail.com";

        System.out.println("\n12. Email Validation:");

        if (email.contains("@") &&
            email.startsWith("test") &&
            email.endsWith(".com")) {

            System.out.println("Valid Email: " + email);
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {

        basicOperations();
        lengthAndChar();
        comparison();
        searching();
        substringOps();
        modification();
        whitespace();
        concatenation();
        splitting();
        stringBuilderDemo();
        formatting();
        validateEmail();
    }
}