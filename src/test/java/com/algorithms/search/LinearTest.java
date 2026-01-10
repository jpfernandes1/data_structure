package com.algorithms.search;

import java.util.ArrayList;

public class LinearTest {

    public static void main(String[] args) {
        int[] array = {2, 7, 1, 9, 6};
        System.out.println(Linear.linearSearch(9, array));
        System.out.println(Linear.linearSearch(7, array));
        System.out.println(Linear.linearSearch(11, array));
        System.out.println(Linear.linearSearch(6, array));
        ;
    }
}
