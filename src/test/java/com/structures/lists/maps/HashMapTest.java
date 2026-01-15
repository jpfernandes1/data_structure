package com.structures.lists.maps;

import java.util.HashMap;

/*
    A HashMap stores items in key/value pairs, where each key maps to a specific value.
    It is part of the java.util package and implements the Map interface.
    Instead of accessing elements by an index (like with ArrayList), you use a key to retrieve its associated value.
    A HashMap can store many different combinations, such as:

    - String keys and Integer values
    - String keys and String values
 */
public class HashMapTest {

    public static void main(String[] args) {

        HashMap<String, String> federalAlchemists = new HashMap<>();

        // Add items
        federalAlchemists.put("Roy", "Flame");
        federalAlchemists.put("Edward", "Fullmetal");
        federalAlchemists.put("Kimblee", "Crimsom Lotus");
        federalAlchemists.put("Tucker", "Sewing-Life");

        // Access an Item
        System.out.println(federalAlchemists.get("Roy"));

        // get all keys
        System.out.println(federalAlchemists.keySet());

        // get all values
        System.out.println(federalAlchemists.values());

        // Remove an Item
        federalAlchemists.remove("Tucker");

        // Size
        System.out.println(federalAlchemists.size());

        // Keys Iteration
        for (String key : federalAlchemists.keySet()) {
            System.out.println(federalAlchemists.get(key));
        }

        // Values Iteration
        for (String i : federalAlchemists.values()) {
            System.out.println(i);
        }

        // Keys and values Iteration
        for (String key : federalAlchemists.keySet()) {
            System.out.println("Key: " + key + "; Value: " + federalAlchemists.get(key));
        }
        // Remove all items
        federalAlchemists.clear();

        /*

         Other Types
             Keys and values in a HashMap are actually objects. In the examples above, we used objects of type "String".
             Remember that a String in Java is an object (not a primitive type). To use other types, such as int,
             you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean,
             Character for char, Double for double, etc:

          Example
             Create a HashMap object called people that will store String keys and Integer values:
         */

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    /*
       Plus:
           From Java 10, you can use the var keyword to declare a HashMap variable without writing the type twice.
           The compiler figures out the type from the value you assign.

         - With var
           var capitalCities = new HashMap<String, String>();

       The Map Interface
           Sometimes you will see both Map and HashMap in Java code, like this:
           Map<String, String> capitalCities = new HashMap<>();

           This means the variable (capitalCities) is declared as a Map (the interface), but it stores a HashMap object
           (the actual map). Since HashMap implements the Map interface, this is possible.
           It works the same way, but some developers prefer this style because it gives them more flexibility to change the type later.
    */
    }
}