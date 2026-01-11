package com.algorithms.sorting;

import java.util.Arrays;

public class InsertionSortTest {

    public static void main(String[] args) {
        int[] array = new int[] { 5, 8, 1, 3, 16, 9, 11 };
        Insertion.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
