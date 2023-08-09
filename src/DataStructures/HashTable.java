package src.DataStructures;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        // Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //             Each key-value pair is known as an Entry
        //             FAST insertion, look up, deletion of key-value pairs
        //             Not ideal for small data sets, great with large data sets

        // Hashing = takes a key and computes an integer (formula will vary based on key & data type)
        //           In a Hashtable, we use the hash % capacity to calculate an index number of the entry

        //           key.hashCode() % capacity = index

        // bucket = an indexed storage location for one or more Entries
        //          can store multiple Entries in case of a collision (linked similarly a LinkedList)

        // collision = hash function generates the same index for more than one key
        //             less collision = more efficiency

        // Runtime complexity = Best case O(1)
        //                      Worst case O(n)

        // Create a Hashtable to store student's ids and their corresponding names
        Hashtable<Integer, String> table = new Hashtable<>(10);  // Set the initial size of the Hashtable to 10

        // Entry = a key-value pair in the Hashtable

        // Add key-value pairs to the Hashtable by using put() method
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        // Access the value of the specific key by using put(key) method
        System.out.println(table.get(100));

        // Iterate over all the values in the Hashtable
        for (Integer key : table.keySet()) {  // keySet() method get all the keys in the Hashtable and put in a Set
            // Also display each HashCode for each element (the index of each element in the Hashtable)
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

        // Remove an entry from the Hashtable
        table.remove(777);  // pass in a key
    }
}
