package com.structures.lists;

import com.structures.lists.Array;
import com.structures.utils.Contact;

public class ArraysTest {

    public static void main(String[] args) throws Exception {

        Array<String> array = new Array<String>(10);


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

        System.out.println(array.contains("b"));

        array.add(3, "e");
        array.add(1, "e");
        System.out.println(array.toString());

        array.remove("e");
        array.remove("a");
        System.out.println(array.toString());


        // ----- int vector -----

        Array<Integer> array2 = new Array<Integer>(10);
        array2.add(2);
        array2.add(5);
        array2.add(7);

        System.out.println(array2.toString());

        array2.remove(3);
        array2.remove(5);
        System.out.println(array2.toString());


        // ----- Object vector ------
        Contact contact1 = new Contact("John", "john@test.com", "999");
        Contact contact2 = new Contact("Mary", "mary@test.com", "999");
        Contact contact3 = new Contact("Anna", "anna@test.com", "999");

        Array<Contact> array3 = new Array<Contact>(5);
        array3.add(contact1);
        array3.add(contact2);
        array3.add(contact3);

        System.out.println(array3.toString());
        System.out.println("Tamanho = " + array3.size());

        boolean pos = array3.contains(contact3);
        if (pos) {
            System.out.println("Element exists in vector");
        } else {
            System.out.println("Element does not exist in vector");
        }

        System.out.println(array3.lastIndexOf(contact3));

    }
}
