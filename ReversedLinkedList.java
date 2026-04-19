/*1c. Linked List Programs */
/*2.Write a Java program to iterate a linked list in reverse order */

package oneC;

import java.util.*;

public class ReversedLinkedList {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        // Display original list
        System.out.println("Original List: " + list);

        // Get ListIterator starting at the end
        ListIterator<String> iterator = list.listIterator(list.size());

        // Iterate in reverse
        System.out.print("Reverse Order: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}