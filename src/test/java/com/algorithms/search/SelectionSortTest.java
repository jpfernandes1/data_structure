package com.algorithms.search;

import com.algorithms.sorting.Selection;

import java.util.Arrays;

public class SelectionSortTest {

    public static void main(String[] args) {
        int[] array = { 5, 4, 1, 9, 2, 1, 6, 3, 15, 7 };

        Selection.SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
