package com.structures.lists.maps;


/*

    A TreeMap is a collection that stores key/value pairs in sorted order by key.
    It is part of the java.util package and implements the Map interface.
    Tip: Unlike HashMap, which does not maintain order, TreeMap keeps its keys sorted.

 */

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        // Creating  a TreeMap that stores String keys and String values:
        TreeMap<String, String> mainCharacters = new TreeMap<>();

        // Add items
        mainCharacters.put("HunterXHunter", "Gon");
        mainCharacters.put("Attack on Titan", "Eren");
        mainCharacters.put("Jujutsu Kaisen", "Itadori");
        mainCharacters.put("Katekyo hitman reborn", "Tsuna");
        mainCharacters.put("Attack on Titan", "Eren"); // Duplicated
        mainCharacters.put("One piece", "Luffy");

        System.out.println(mainCharacters); // Output: The keys are sorted alphabetically (e.g., {Attack on Titan=Eren,
        // HunterXHunter=Gon, Jujutsu Kaisen=Itadori, Katekyo hitman reborn=Tsuna, One piece=Luffy}). Duplicates will only appear once.

        // Access an Item
        System.out.println(mainCharacters.get("HunterXHunter"));

        // Remove Item
        mainCharacters.remove("One piece");

        // Size check
        System.out.println(mainCharacters.size());


        // Print keys
        for (String i : mainCharacters.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : mainCharacters.values()) {
            System.out.println(i);
        }

        // Loop Through a TreeMap
        for (String key : mainCharacters.keySet()) {
            System.out.println("key: " + key + " value: " + mainCharacters.get(key));
        }

        // Remove all items
        mainCharacters.clear();

        System.out.println(mainCharacters);


        /*

                                    TreeMap vs HashMap
            Feature	          HashMap          	      TreeMap
            Order   	  No guaranteed order	   Sorted by keys
            Null Keys	  Allows one null key	   Does not allow null keys
            Performance	  Faster (no sorting)	   Slower (maintains sorted order)

            Tip: Use HashMap for performance, and TreeMap when you need sorted keys.
            You can use Var to declare:
                var capitalCities = new TreeMap<String, String>();

            You can use Map and TreeMap in Java code. This means the variable (capitalCities) is declared as a Map
            (the interface), but it stores a TreeMap object (the actual map). Since TreeMap implements the Map interface,
            this is possible. It works the same way, but some developers prefer this style because it gives them more
            flexibility to change the type later:
                Map<String, String> capitalCities = new TreeMap<>();

         */
    }
}
