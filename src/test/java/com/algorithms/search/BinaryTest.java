package com.algorithms.search;

/* This type of search has complexity O(log n), its too much faster than Linear, but it demands
    a sorted vector;
 */

public class BinaryTest {

    public static void main(String[] args) {

        int[] array = {2, 6, 8, 9, 16, 20};

        System.out.println(Binary.binarySearch(array, 9));

    }

}
