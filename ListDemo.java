/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a 
LinkedList to perform the following operations with different functions directed as follows 
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list 
*/

package oneA;

import java.util.*;

public class ListDemo {

    // 1. Adding elements
    static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("1. Added Elements: " + list);
    }

    // 2. Add element at specific index
    static void addAtIndex(List<String> list) {
        list.add(1, "Mango");
        System.out.println("2. Added at index 1: " + list);
    }

    // 3. Add multiple elements
    static void addMultiple(List<String> list) {
        list.addAll(Arrays.asList("Grapes", "Pineapple"));
        System.out.println("3. Added multiple elements: " + list);
    }

    // 4. Access elements
    static void accessElements(List<String> list) {
        System.out.println("4. Element at index 2: " + list.get(2));
    }

    // 5. Update elements
    static void updateElements(List<String> list) {
        list.set(0, "Kiwi");
        System.out.println("5. Updated first element: " + list);
    }

    // 6. Remove elements
    static void removeElements(List<String> list) {
        list.remove("Banana");
        System.out.println("6. Removed Banana: " + list);
    }

    // 7. Search elements
    static void searchElements(List<String> list) {
        System.out.println("7. Contains Apple? " + list.contains("Apple"));
    }

    // 8. List size
    static void listSize(List<String> list) {
        System.out.println("8. List size: " + list.size());
    }

    // 9. Iterating (for-each)
    static void iterateList(List<String> list) {
        System.out.print("9. Iteration (for-each): ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 10. Using Iterator
    static void useIterator(List<String> list) {
        System.out.print("10. Iteration (Iterator): ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    // 11. Sorting
    static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("11. Sorted list: " + list);
    }

    // 12. Sublist
    static void subList(List<String> list) {
        System.out.println("12. Sublist (0 to 2): " + list.subList(0, 2));
    }

    // 13. Clearing the list
    static void clearList(List<String> list) {
        list.clear();
        System.out.println("13. Cleared list: " + list);
    }

    // Perform all operations
    static void performAll(List<String> list) {
        addElements(list);
        addAtIndex(list);
        addMultiple(list);
        accessElements(list);
        updateElements(list);
        removeElements(list);
        searchElements(list);
        listSize(list);
        iterateList(list);
        useIterator(list);
        sortList(list);
        subList(list);
        clearList(list);
    }

    public static void main(String[] args) {

        System.out.println("=== ARRAYLIST ===");
        List<String> arrayList = new ArrayList<>();
        performAll(arrayList);

        System.out.println("\n=== LINKEDLIST ===");
        List<String> linkedList = new LinkedList<>();
        performAll(linkedList);
    }
}