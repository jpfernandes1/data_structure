package com.structures.lists.maps;

/*

    A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.
    It is part of the java.util package and implements the Map interface.

    Tip: Use LinkedHashMap when you want predictable iteration order (insertion order).

 */

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

    public static void main(String[] args){

        // Create a LinkedHashMap object that will store String keys and String values:
        LinkedHashMap<String, String> devTools = new LinkedHashMap<>();

        // Add items
        devTools.put("Database", "PostgreSQL");
        devTools.put("Programming language", "Java");
        devTools.put("Code Versioning", "Git");
        devTools.put("Database Versioning", "Flyway");
        devTools.put("Cloud", "Azure");
        devTools.put("Code Versioning", "Gitlab"); // Duplicate key with different value, the last remains

        System.out.println(devTools); // Output: The items will appear in the order they were added
        // (e.g., {Database=PostgreSQL, Programming language=Java, Code Versioning=Gitlab, Database Versioning=Flyway, Cloud=Azure}).
        // Duplicates are ignored.

        // Access an Item
        System.out.println(devTools.get("Code Versioning"));

        // Remove an Item
        System.out.println(devTools.remove("Database Versioning"));

        // Check the size
        System.out.println(devTools.size());

        // Loop Through a LinkedHashMap
        // Print keys
        for (String key : devTools.keySet()) {
            System.out.println(key);
        }

        // Print values
        for (String value : devTools.values()) {
            System.out.println(value);
        }

        // Print keys and values
        for (String key : devTools.keySet()) {
            System.out.println("Key: " + key + ", Value: " + devTools.get(key));
        }

        // Remove all items
        devTools.clear();
        System.out.println(devTools.size());


        /*

                                      HashMap vs LinkedHashMap
        Feature	              HashMap	                     LinkedHashMap
        Order	        No guaranteed order	              Insertion order preserved
        Performance	    Faster for random access	Slightly slower due to ordering
        Duplicates	    Keys must be unique	              Keys must be unique

        Tip: Use LinkedHashMap when you want the map to remember the order in which entries were added.

        Note: From Java 10, you can use the var keyword to declare a LinkedHashMap variable without writing the type twice.
         The compiler figures out the type from the value you assign.

            This makes code shorter, but many developers still use the full type for clarity:
                var capitalCities = new LinkedHashMap<String, String>();

        Note2: Sometimes you will see both Map and LinkedHashMap in Java code, like this:
                Map<String, String> capitalCities = new LinkedHashMap<>();

            This means the variable is declared as a Map (the interface), but it stores a LinkedHashMap object
             (the actual map). Since LinkedHashMap implements the Map interface, this is possible.

            It works the same way, but some developers prefer this style because it gives them more flexibility
             to change the type later.

         */
    }
}
