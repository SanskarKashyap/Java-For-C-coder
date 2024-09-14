package AppnaCollage;
import java.util.LinkedList;
import java.util.ListIterator;

public class ll {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Displaying the LinkedList
        System.out.println("Original LinkedList: " + list);

        // Reversing the LinkedList
        reverseLinkedList(list);

        // Displaying the reversed LinkedList
        System.out.println("Reversed LinkedList: " + list);
    }

    // Method to reverse the LinkedList
    public static void reverseLinkedList(LinkedList<Integer> list) {
        // Use a ListIterator to traverse and reverse the LinkedList
        ListIterator<Integer> frontIterator = list.listIterator(0);
        ListIterator<Integer> backIterator = list.listIterator(list.size());

        int frontIndex = 0;
        int backIndex = list.size() - 1;

        // Swap elements from the front and back until we reach the middle
        while (frontIndex < backIndex) {
            // Swap front and back elements
            Integer frontValue = frontIterator.next();
            Integer backValue = backIterator.previous();

            // Set the swapped values
            frontIterator.set(backValue);
            backIterator.set(frontValue);

            // Move the indices
            frontIndex++;
            backIndex--;
        }
    }
}
