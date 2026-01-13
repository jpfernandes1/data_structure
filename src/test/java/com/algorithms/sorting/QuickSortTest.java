package com.algorithms.sorting;

import java.util.Arrays;

public class QuickSortTest {

    public static void main(String[] args) {
        int[] array = {9, 16, 4, 2, 13, 1};

        Quick.quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}