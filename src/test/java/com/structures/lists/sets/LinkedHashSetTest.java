package com.structures.lists.sets;

import java.util.LinkedHashSet;

/*

    A LinkedHashSet is a collection that stores unique elements and remembers the order they were added.
    It is part of the java.util package and implements the Set interface.

    Tip: Use LinkedHashSet when you want a set that does not allow duplicates and keeps the original insertion order.

 */
public class LinkedHashSetTest {

    public static void main(String[] args) {

        LinkedHashSet<String> vikings = new LinkedHashSet<>();
        vikings.add("Ragnar");
        vikings.add("Lagertha");
        vikings.add("Rollo");
        vikings.add("Floki");
        vikings.add("Lagertha"); // Duplicated
        vikings.add("Bjorn");

        System.out.println(vikings);

    // Output: The elements will appear in the order they were added (e.g., [Ragnar, Lagertha, Rollo, Floki, Bjorn]).
    // Note: Duplicates like "Lagertha" are ignored.

    // Check for an element existence
        System.out.println(vikings.contains("Floki"));
        System.out.println(vikings.contains("Siggy"));

    // Remove
        vikings.remove("Rollo");
        System.out.println(vikings);

    // Size
        System.out.println(vikings.size());

    // Loop Through a LinkedHashSet
        for(String v : vikings){
            System.out.println(v);
        }

    // Remove All elements
        vikings.clear();

    }
}
