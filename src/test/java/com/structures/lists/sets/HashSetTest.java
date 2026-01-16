package com.structures.lists.sets;

import java.util.HashSet;
import java.util.Set;

/*

    This type of set does not maintain any kind of order, neither insertion nor natural.

    Unique feature of HashSet:

    Unpredictable order: The iteration order can change as the internal capacity is adjusted (rehashing)
    Lower memory overhead than LinkedHashSet (does not need to store references for order)
    Slightly better performance than LinkedHashSet (because it does not maintain additional links)

    When to use HashSet:

    When order doesn't matter
    When you want maximum performance for add/remove/contains operations
    When you need to allow null elements
    When you don't need ordered iteration

 */

public class HashSetTest {

    public static void main(String[] args) {
        // Creating a set
        HashSet<String> cars = new HashSet<String>(); // we can't instantiate directly just like new Set(), because it is an interface.


        cars.add("Walter");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate will not return an error, just dont add
        cars.add("Mazda");
        System.out.println(cars);

        // Checking for an element existence
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains("Toyota"));

        // Removing an element
        cars.remove("BMW");

        // Removing all elements
        cars.clear();

        // Checking for the size
        cars.size();

        // Loop through a HashSet
        for (String i : cars) {
            System.out.println(i);
        }

        /*
        Other Types
           Elements in an HashSet are actually objects. In the examples above, we created elements (objects) of type "String".
           Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify
           an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
         */

        /*
        The var Keyword
            From Java 10, you can use the var keyword to declare a HashSet variable without writing the type twice.
            The compiler figures out the type from the value you assign.

            This makes code shorter, but many developers still use the full type for clarity. Since var is valid Java,
            you may see it in other code, so it's good to know that it exists:
         */

                // Without var
                HashSet<String> cars2 = new HashSet<String>();

                // With var
                var cars3 = new HashSet<String>();


         /*
         The Set Interface
                Note: Sometimes you will see both Set and HashSet in Java code, this means the variable (cars) is declared
                as a Set (the interface), but it stores a HashSet object (the actual set).
                Since HashSet implements the Set interface, this is possible.

                It works the same way, but some developers prefer this style because it gives them more flexibility to
                change the type later. like this:
          */

            Set<String> cars4 = new HashSet<>();

    }
}