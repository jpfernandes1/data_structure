package com.algorithms.sorting;

import java.util.Random;

/*
    A fast and efficient sorting algorithm that uses the "divide and conquer" strategy, choosing an element (pivot)
    and partitioning the array into two sub-arrays:
    Down: one with elements smaller than the pivot, that iteration goes up;
    Up: with larger elements with the pivot placed in its correct final position, that iteration comes down.
    Then, the algorithm is called recursively for both sub-arrays until all elements are sorted.
 */
public class Quick {

    // Create another constructor to make it easier to call;
    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) {
            return;
        }

        /**
         * Randomly selects the pivot for Quicksort.
         *
         * Motivation:
         * - Avoids the worst-case O(n²) in sorted arrays or arrays with adversarial patterns.
         * - Transforms a deterministic attack (predictable worst-case) into a very low-probability event.
         * - Guarantees an expected time O(n log n) with high probability, making the algorithm robust for arbitrary inputs.
         *
         * Operation:
         * 1. Chooses a random index from [left, right]
         * 2. Swaps the random element with the last (or first) position
         * 3. Proceeds with the partition normally
         *
         * Cost: only O(1) additional per recursive call.
         */
        int pivotIndex = new Random().nextInt(highIndex-lowIndex+1)+lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);
        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);

    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
