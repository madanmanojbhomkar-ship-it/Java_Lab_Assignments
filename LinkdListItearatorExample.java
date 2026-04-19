/*1c. Linked List Programs */

/*
1.	Write a Java program to iterate through all elements in a linked 
list starting at the specified position ( 2nd) using iterator
 ( hint : Iterator iteratorobj = listobj.listIterator(1)) 
*/
package oneC;

import java.util.*;

public class LinkdListItearatorExample {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        // Display full list
        System.out.println("Full List: " + list);

        // Create iterator starting from 2nd position (index 1)
        ListIterator<String> iterator = list.listIterator(1);

        // Iterate from 2nd element
        System.out.print("Elements from 2nd position: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}