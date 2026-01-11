package com.algorithms.sorting;

/*
    This type of sorting is a simple, in-place, stable sorting algorithm that builds a final sorted array one element at a time.

    Principle: Traverse the list from left to right, keeping the left side sorted and inserting each new element in the correct position.
    How it works: For each element, starting from the second, compare it with the elements to its left (which are already sorted) and move
    them to the right until you find the correct position to insert the current element.

    Its complexity is O(n²) in the worse and intermediate cases, and O(n) in the best;

 */

import java.util.Arrays;

public class Insertion {

    public static void insertionSort(int[] array) {
    int currentValue, iteration, j;

        for (iteration = 1; iteration < array.length; iteration++) {
            // The iteration will select the element and we need to find all the elements bigger than it;
            currentValue = array[iteration];
            for (j = iteration-1; (j >= 0) && array[j] > currentValue; j--) {
                array[j+1] = array[j]; // switching for all the smallest values
            }
            array[j+1] = currentValue;
            System.out.println(Arrays.toString(array));
        }
    }
}
