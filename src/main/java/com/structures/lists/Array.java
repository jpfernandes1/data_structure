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
    private int size; // Added to constructor

    // Instantiate array
    public Array(int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
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
        if (this.size < this.elements.length) {
            // Will proceed only if the array still has an empty position (hasn't reached maximum size)
            this.elements[size] = element;
            this.size++;
        } else {
            throw new Exception("Array is full, cannot add more elements");
        }
    }

    /*
        Method to return the Array length
     */

    public int size(){
        return this.size;
    }

    /*
        Utility for printing all elements of the array.
     */

    @Override
    public String toString() {

        String s = "[";

        for (int i = 0; i < this.size -1; i++) { // the iteration will run until the second to last number, in order to not put a comma after the last.
            s += this.elements[i];
            s += ", ";
        }

        if (this.size > 0) {
            s += this.elements[this.size -1]; // The last one will be appended just here.
        }

        s += "]";
        return s;
    }

    /*
        Search method to get an element by its index.
     */
    public String search(int index){
        if(!(index <= this.size && index >= 0)) { // Any index out of the array limits, or available but empty will throw an error
          throw new IllegalArgumentException("Posição inválida");
        }
          return this.elements[index];
    }

    /*
        Method to verify if an element exists
     */
    public boolean search(String element){
        for(int i=0; i<this.size(); i++){ // sequential search
            if(this.elements[i].equals(element)){
                return true;
            }
        }
            return false;
    }

    /*
        Method for adding an element at a given index;
     */

    public void add(int index, String element) {

        increasesCapacity();

        if (index < 0 || index > this.size) {
            throw new IllegalArgumentException("Posição inválida");
        }


        for (int i = this.size - 1; i >= index; i--) {
            this.elements[i + 1] = this.elements[i];
        }

        this.elements[index] = element;
        this.size++;
    }

    private void increasesCapacity() {
        if(this.size == this.elements.length) {
            String[] newElements = new String[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    /*
        Method for removing an element at a given index
     */

    public void remove(int index){
        if(!(index >=0 && index < size)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i=index; i<size-1; i++){
            elements[i] = elements[i+1];
        }

        size--;
    }


}