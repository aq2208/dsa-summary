package src.datastructures.hashtable;

import java.util.HashMap;

public class MapsAndHashMaps {

    public static void main(String[] args) {

        // a Map is just a Set of key-value pairs

        // The key-value data type must be wrapper classes or objects

        // create a Map to store employee's names and their corresponding ids
        HashMap<String, Integer> empIds = new HashMap<>();

        // In Java the Map is actually an interface to specify the methods and
        // its implementation have to support that methods
        // and there are many implementations of Map, and HashMap is the most common

        // Add a new mapping (a new key-value pair) to the HashMap
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 868686);

        // The order of the entries in the Map is not guaranteed,
        // it can be stored in the different order from the order when you insert values

        System.out.println(empIds);

        // Get one specific value based on its key
        System.out.println(empIds.get("Carl"));

        // Get one specific key based on its value
//        System.out.println(empIds.);

        // Check if a certain key exist in the Map
        System.out.println(empIds.containsKey("Jerry"));

        // Check if a certain value exist in the Map
        System.out.println(empIds.containsValue(33333));

        // If you put into the Map the exact same key that you did before
        // If the key is already exist in the Map, it will override that key's current value and update with the new value
        empIds.put("John", 220803);
        System.out.println(empIds);

        empIds.replace("John", 777);
        empIds.replace("Anh Quan", 2003);

        empIds.putIfAbsent("John", 222);
        empIds.putIfAbsent("Steve", 222);

        empIds.remove("Steve");
        System.out.println(empIds);

    }

}
