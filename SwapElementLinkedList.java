/*1c. Linked List Programs */
/*5.Write a Java program that swaps two elements ( first and third elements ) in a linked list 
 * ( using Collections.swap(l_list, 0, 2)) */


package oneC;

import java.util.*;

public class SwapElementLinkedList {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        // Display original list
        System.out.println("Original List: " + list);

        // Swap 1st and 3rd elements (index 0 and 2)
        Collections.swap(list, 0, 2);

        // Display updated list
        System.out.println("After swapping 1st and 3rd elements: " + list);
    }
}