package com.structures.lists;

import com.structures.lists.Array;

public class ArraysTest {

    public static void main(String[] args) throws Exception {

        Array array = new Array(10);


        try {
            array.add("a");
            array.add("b");
            array.add("c");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(array.size());
        System.out.println(array.toString()); // We can use just "array" and the compilation will understand we want the toString method.

        System.out.println(array.search(2));

        System.out.println(array.search("b"));

        array.add(3, "e");
        array.add(1, "e");
        System.out.println(array.toString());
    }
}
