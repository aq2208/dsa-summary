package src.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class DSA_Queue {
    public static void main(String[] args) {
        // Declare and Instantiate a Queue
        // Queue can only store object-typed data
        Queue<String> queue = new LinkedList<>();

        // Add (enqueue) new elements (objects) to the end of the Queue
        queue.add("Minecraft");
        queue.add("Skyrim");
        queue.add("DOOM");
        queue.add("Borderlands");
        queue.add("FFVII");

        // Remove (dequeue) the front most element out from the Queue
        // When you dequeue an object from the Queue, the method will return that removed object
        queue.remove();
        String myFavGame = queue.remove();
        System.out.println(myFavGame);

        // To see what is the value of the front most object in the Queue without removing it, use peek()
        System.out.println(queue.peek());

        // Print out all the Queue's elements without removing elements
        System.out.println(queue);

        // Check if the Queue is empty
        System.out.println(queue.isEmpty());

        // Get the size of the Queue
        System.out.println(queue.size());

        // Get an object (element) in the Queue
        System.out.println(queue.element());  // get the front most element

        // Check if the Queue contains a specific element
        System.out.println(queue.contains("DOOM"));

        // Update/Modify the value of an element in the Queue
        System.out.println(queue.offer("Anh Quan"));
        System.out.println(queue);

        // It is possible to run out of memory when adding to many objects to our Queue (if we use LinkedList)
    }
}
