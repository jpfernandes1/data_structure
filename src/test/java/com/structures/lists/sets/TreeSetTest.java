package com.structures.lists.sets;

/*
    A TreeSet is a collection that Unlike HashSet, which has no order, TreeSet keeps its elements sorted automatically.
    It is part of the java.util package and implements the Set interface.

    In Java, TreeSets maintain sorted elements using a balanced binary tree mechanism (red-black tree) and rely on a
    comparison rule defined by the Comparable interface or a Comparator object.

    🌳 The Underlying Structure (TreeMap)

    Internally, the TreeSet is a "cover" over a TreeMap. When you add an element (e.g., mySet.add("Zebra")),
    it is stored as a key in the underlying TreeMap. The associated value is a standard constant object.

    The TreeMap is what effectively implements the red-black tree. During insertion:
    The tree is traversed from the root, using the comparison rule (Comparable or Comparator).

    It finds the correct position for the new element (based on order). The tree automatically rebalances to ensure
    it remains approximately balanced, maintaining the efficiency of operations (search, insertion, removal) in O(log n).

    ⚠️ Important Considerations

    Consistency: All elements must be comparable to each other. Mixing String and Integer, for example, will cause a ClassCastException.
    Key Immutability: The order depends on the object's state (e.g., a Person's name). If an attribute used in the
    comparison is changed after the object is in the TreeSet, the internal order will be corrupted, potentially causing unexpected behavior.

 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> peakyBlinders = new TreeSet<>();

        // add elements - Output: The elements will be sorted automatically (e.g., [Ada, Arthur, John, Polly, Tommy]
        // Note: Duplicates like "BMW" will only appear once.
        peakyBlinders.add("John");
        peakyBlinders.add("Polly");
        peakyBlinders.add("Tommy");
        peakyBlinders.add("Arthur");
        peakyBlinders.add("Polly");  // Duplicate
        peakyBlinders.add("Ada");

        System.out.println(peakyBlinders);

        // Check for an element existence
        System.out.println(peakyBlinders.contains("Tommy"));
        System.out.println(peakyBlinders.contains("Thomas"));

        // Removing an element
        System.out.println(peakyBlinders.remove("John"));
        System.out.println(peakyBlinders);

        // Size
        System.out.println(peakyBlinders.size());

        // Loop Through
        for (String i : peakyBlinders) {
            System.out.println(i);
        }

        // Remove All
        peakyBlinders.clear();
        System.out.println(peakyBlinders);

        /* Tip: Use HashSet when you care about speed, and TreeSet when you need sorted elements. Just like HashSet,
           you can also declare with Set and stores a TreeSet, since TreeSet implements the Set interface:
        */
        Set<String> shelbys = new TreeSet<>();

        // It works the same way, but some developers prefer this style because it gives them more flexibility to change the type later

    /*

    ⚙️ The Sorting Mechanism

    Sorting is established in one of two ways:

    - Natural Sorting (Comparable - as we did previously): If the inserted objects implement the Comparable interface (such as String, Integer,
    Date), the TreeSet uses its compareTo() method to sort them automatically (in case of String, it uses the unicode value to sort.
       ex.: 'A' (Unicode 65) < 'B' (66).

       Sorting Behavior:
       Ascending Order ->  Numbers (0-9) < Uppercase Letters (A-Z) < Lowercase Letters (a-z) < Accented/Multiple Characters

    - Custom Sorting (Comparator): You can create a Comparator object with your own comparison logic (for example,
    sorting Person by age) and pass it to the TreeSet constructor. This takes precedence over natural sorting:

    */

        // Custom Sorting with Comparator
        TreeSet<String> fruits = new TreeSet<>((a, b) -> b.compareTo(a)); // Descending order
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits); // [Cherry, Banana, Apple] - Reverse alphabetical order
    }
}
