package com.algorithms.search;

/*
    This type of search has a complexity of O(n).
 */
public class Linear {

    public static int linearSearch(int value, int[] vector) {
        int pos;
        for (pos = 0; pos < vector.length; pos++) {
            if (vector[pos] == value) {
                return pos;
            }
        }
            return -1; // invalid position to represent that the value was not found;
    }
}
