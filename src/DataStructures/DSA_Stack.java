package src.DataStructures;

import java.util.Stack;

public class DSA_Stack {

    public static void main(String[] args) {

        // Declare and Instantiate a Stack
        // Stack can only store object-typed data
        Stack<String> stack = new Stack<>();

        // Add (push) new elements (objects) to the top of the Stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // Remove (pop) the top most element out from the Stack
        // When you pop an object from the Stack, the method will return that removed object
        stack.pop();
        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        // To see what is the value of the top most object in the Stack without removing it, use peek()
        System.out.println(stack.peek());

        // Search for an object in the Stack
        // The position my the Stack will count from the top to bottom, start with 1
        System.out.println(stack.search("Minecraft"));
        System.out.println(stack.search("Anh Quan")); // If your seach object cannot be found, it will return -1

        // Print out all the Stack's elements without removing elements
        System.out.println(stack);

        // Check if the Stack is empty
        System.out.println(stack.empty());

        // Get the size of the Stack
        System.out.println(stack.size());

        // Get an object (element) in the Stack
        System.out.println(stack.get(0));  // get the bottom most element

        // Check if the Stack contains a specific element
        System.out.println(stack.contains("DOOM"));

        // Update/Modify the value of an element in the Stack
        System.out.println(stack.set(1, "Anh Quan"));
        System.out.println(stack);

        // It is possible to run out of memory when adding to many objects to our Stack

    }

}
