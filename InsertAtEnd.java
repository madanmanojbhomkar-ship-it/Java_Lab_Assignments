/*1c. Linked List Programs */
/*3.Write a Java program to insert the specified element at the end of 
 * a linked list.( using l_listobj.offerLast("Pink")) */

package oneC;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add initial elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Display original list
        System.out.println("Original List: " + list);

        // Insert element at the end using offerLast()
        list.offerLast("Pink");

        // Display updated list
        System.out.println("After inserting 'Pink' at the end: " + list);
    }
}