package com.structures.lists;

/*
## Sequential Lists (Arrays/Vectors)

Elements are stored in contiguous memory positions.
Access: Fast and direct by index (constant time).
Insertion/Removal: Slow, as it requires shifting other elements.
 */

public class Array {

    /* The need for arrays is to create a single object with multiple elements
       instead of creating many variables.

    String element1 = 'a';
    String element2 = 'b';
    String element3 = 'c';
    String element4 = 'd';

     It's better to manage and manipulate in array format:

     String[] elements = new String[8]; // define array size in declaration
     elements[0] = 'a';
     elements[1] = 'b';
     elements[2] = 'c';
     elements[3] = 'd';

     Other advantages:
     This array is iterable, which facilitates reading, editing, and even allows calculations
     like average, sum, etc. (for numeric arrays) and element counting.. */

    private String[] elements;
    private int nextIndex; // Added to constructor

    // Instantiate array
    public Array(int capacity) {
        this.elements = new String[capacity];
        this.nextIndex = 0;
    }

    /* Add Element to array

    About this method, we need to keep some concepts in mind:
    When instantiating an array, depending on the type used, empty positions will have different default values:
    If String, null.
    If int, 0;
    If Boolean, false.

    ex.: the elements array we instantiated earlier with 8 positions and only 4 set values will be:
    ['a', 'b', 'c', 'd', null, null, null, null];
    So, to add in the last position, can we iterate looking for the position with null value?
    No.. there are two problems with this approach:
     1. In the case of a boolean or int array, an element could be false or 0 and be a real value,
      not absence of data.
     2. If we have a very large array, it would be inefficient to traverse until finding the index.

     Solution: create a new attribute that indicates the next position to be filled (pointer);
     */

    public void add(String element) throws Exception {
        if (this.nextIndex < this.elements.length) {
            // Will proceed only if the array still has an empty position (hasn't reached maximum size)
            this.elements[nextIndex] = element;
            this.nextIndex++;
        } else {
            throw new Exception("Array is full, cannot add more elements");
        }
    }
}